package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pap {
    static int a(InputStream inputStream) {
        return (int) d(inputStream, 2);
    }

    static int b(InputStream inputStream) {
        return (int) d(inputStream, 1);
    }

    static int c(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static long d(InputStream inputStream, int i) throws IOException {
        byte[] bArrN = n(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (bArrN[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    static long e(InputStream inputStream) {
        return d(inputStream, 4);
    }

    static String f(InputStream inputStream, int i) {
        return new String(n(inputStream, i), StandardCharsets.UTF_8);
    }

    static void g(OutputStream outputStream, byte[] bArr) throws IOException {
        k(outputStream, bArr.length);
        byte[] bArrM = m(bArr);
        k(outputStream, bArrM.length);
        outputStream.write(bArrM);
    }

    static void h(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void i(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void j(OutputStream outputStream, int i) throws IOException {
        i(outputStream, i, 2);
    }

    static void k(OutputStream outputStream, long j) throws IOException {
        i(outputStream, j, 4);
    }

    static void l(OutputStream outputStream, int i) throws IOException {
        i(outputStream, i, 1);
    }

    static byte[] m(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    static byte[] n(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(a.g(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    static byte[] o(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException(a.e(i, "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ", " bytes"));
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 != i) {
                throw new IllegalStateException(a.s(i3, i, "Didn't read enough bytes during decompression. expected=", " actual="));
            }
            if (inflater.finished()) {
                return bArr;
            }
            throw new IllegalStateException("Inflater did not finish");
        } finally {
            inflater.end();
        }
    }
}
