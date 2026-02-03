package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class paz {
    static final byte[] a = {112, 114, 111, 0};
    static final byte[] b = {112, 114, 109, 0};

    public static int a(int i) {
        return (i + 7) & (-8);
    }

    public static String b(String str, String str2, byte[] bArr) {
        String strA = pbd.a(bArr);
        if (str.length() <= 0) {
            return i(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return i(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + pbd.a(bArr) + str2;
    }

    public static void c(OutputStream outputStream, pao paoVar) throws IOException {
        int[] iArr = paoVar.h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            Integer numValueOf = Integer.valueOf(i3);
            numValueOf.getClass();
            pap.j(outputStream, i3 - i2);
            numValueOf.getClass();
            i++;
            i2 = i3;
        }
    }

    public static void d(OutputStream outputStream, pao paoVar) throws IOException {
        int i = 0;
        for (Map.Entry entry : paoVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                pap.j(outputStream, iIntValue - i);
                pap.j(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static byte[] e(pao[] paoVarArr, byte[] bArr) throws IOException {
        int length;
        int i = 0;
        int i2 = 0;
        int iH = 0;
        while (true) {
            length = paoVarArr.length;
            if (i2 >= length) {
                break;
            }
            pao paoVar = paoVarArr[i2];
            int iC = pap.c(b(paoVar.a, paoVar.b, bArr)) + 16;
            int i3 = paoVar.e;
            iH += iC + i3 + i3 + paoVar.f + h(paoVar.g);
            i2++;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iH);
        if (Arrays.equals(bArr, pbd.c)) {
            while (i < length) {
                pao paoVar2 = paoVarArr[i];
                l(byteArrayOutputStream, paoVar2, b(paoVar2.a, paoVar2.b, bArr));
                k(byteArrayOutputStream, paoVar2);
                i++;
            }
        } else {
            for (pao paoVar3 : paoVarArr) {
                l(byteArrayOutputStream, paoVar3, b(paoVar3.a, paoVar3.b, bArr));
            }
            int length2 = paoVarArr.length;
            while (i < length2) {
                k(byteArrayOutputStream, paoVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iH) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iH);
    }

    static byte[] f(InputStream inputStream, byte[] bArr) {
        if (!Arrays.equals(bArr, pap.n(inputStream, 4))) {
            throw new IllegalStateException("Invalid magic");
        }
        int i = pbd.h;
        return pap.n(inputStream, 4);
    }

    public static int[] g(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int iA = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iA += pap.a(inputStream);
            iArr[i2] = iA;
        }
        return iArr;
    }

    private static int h(int i) {
        return a(i + i) / 8;
    }

    private static String i(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static void j(byte[] bArr, int i, int i2, pao paoVar) {
        int i3 = paoVar.g;
        if (i != 2) {
            if (i != 4) {
                throw new IllegalStateException(a.g(i, "Unexpected flag: "));
            }
            i2 += i3;
        }
        int i4 = i2 / 8;
        bArr[i4] = (byte) ((1 << (i2 % 8)) | bArr[i4]);
    }

    private static void k(OutputStream outputStream, pao paoVar) throws IOException {
        d(outputStream, paoVar);
        c(outputStream, paoVar);
        byte[] bArr = new byte[h(paoVar.g)];
        for (Map.Entry entry : paoVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                j(bArr, 2, iIntValue, paoVar);
            }
            if ((iIntValue2 & 4) != 0) {
                j(bArr, 4, iIntValue, paoVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void l(OutputStream outputStream, pao paoVar, String str) throws IOException {
        pap.j(outputStream, pap.c(str));
        pap.j(outputStream, paoVar.e);
        pap.k(outputStream, paoVar.f);
        pap.k(outputStream, paoVar.c);
        pap.k(outputStream, paoVar.g);
        pap.h(outputStream, str);
    }
}
