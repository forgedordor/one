package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwv {
    public static final ffwy a = new ffww();

    public static byte[] a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            ffwy ffwyVar = a;
            byte[] bArr = new byte[54];
            int length = str.length();
            while (length > 0) {
                int i = length - 1;
                if (!ffww.a(str.charAt(i))) {
                    break;
                }
                length = i;
            }
            if (length != 0) {
                int i2 = length;
                int i3 = 0;
                while (i2 > 0 && i3 != 4) {
                    i2--;
                    if (!ffww.a(str.charAt(i2))) {
                        i3++;
                    }
                }
                int iB = ffww.b(str, 0, i2);
                int i4 = 0;
                while (iB < i2) {
                    byte[] bArr2 = ((ffww) ffwyVar).c;
                    int i5 = iB + 1;
                    byte b = bArr2[str.charAt(iB)];
                    int iB2 = ffww.b(str, i5, i2);
                    int i6 = iB2 + 1;
                    byte b2 = bArr2[str.charAt(iB2)];
                    int iB3 = ffww.b(str, i6, i2);
                    int i7 = iB3 + 1;
                    byte b3 = bArr2[str.charAt(iB3)];
                    int iB4 = ffww.b(str, i7, i2);
                    int i8 = iB4 + 1;
                    byte b4 = bArr2[str.charAt(iB4)];
                    if ((b | b2 | b3 | b4) < 0) {
                        throw new IOException("invalid characters encountered in base64 data");
                    }
                    bArr[i4] = (byte) ((b << 2) | (b2 >> 4));
                    int i9 = i4 + 2;
                    bArr[i4 + 1] = (byte) ((b2 << 4) | (b3 >> 2));
                    i4 += 3;
                    bArr[i9] = (byte) (b4 | (b3 << 6));
                    if (i4 == 54) {
                        byteArrayOutputStream.write(bArr);
                        i4 = 0;
                    }
                    iB = ffww.b(str, i8, i2);
                }
                if (i4 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i4);
                }
                int iB5 = ffww.b(str, iB, length);
                int iB6 = ffww.b(str, iB5 + 1, length);
                int iB7 = ffww.b(str, iB6 + 1, length);
                int iB8 = ffww.b(str, iB7 + 1, length);
                char cCharAt = str.charAt(iB5);
                char cCharAt2 = str.charAt(iB6);
                char cCharAt3 = str.charAt(iB7);
                char cCharAt4 = str.charAt(iB8);
                char c = ((ffww) ffwyVar).b;
                if (cCharAt3 == c) {
                    if (cCharAt4 != c) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byte[] bArr3 = ((ffww) ffwyVar).c;
                    byte b5 = bArr3[cCharAt];
                    byte b6 = bArr3[cCharAt2];
                    if ((b5 | b6) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b6 >> 4) | (b5 << 2));
                } else if (cCharAt4 == c) {
                    byte[] bArr4 = ((ffww) ffwyVar).c;
                    byte b7 = bArr4[cCharAt];
                    byte b8 = bArr4[cCharAt2];
                    byte b9 = bArr4[cCharAt3];
                    if ((b7 | b8 | b9) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b7 << 2) | (b8 >> 4));
                    byteArrayOutputStream.write((b9 >> 2) | (b8 << 4));
                } else {
                    byte[] bArr5 = ((ffww) ffwyVar).c;
                    byte b10 = bArr5[cCharAt];
                    byte b11 = bArr5[cCharAt2];
                    byte b12 = bArr5[cCharAt3];
                    byte b13 = bArr5[cCharAt4];
                    if ((b10 | b11 | b12 | b13) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b10 << 2) | (b11 >> 4));
                    byteArrayOutputStream.write((b11 << 4) | (b12 >> 2));
                    byteArrayOutputStream.write(b13 | (b12 << 6));
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new ffwx("unable to decode base64 string: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
