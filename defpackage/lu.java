package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lu {
    public static byte[] a(byte[] bArr) {
        int iDigit;
        int iDigit2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                try {
                    char c = (char) bArr[i + 1];
                    if (c == '\r') {
                        int i2 = i + 2;
                        if (((char) bArr[i2]) != '\n') {
                            c = '\r';
                            iDigit = Character.digit(c, 16);
                            i += 2;
                            iDigit2 = Character.digit((char) bArr[i], 16);
                            if (iDigit == -1 && iDigit2 != -1) {
                                byteArrayOutputStream.write((char) ((iDigit << 4) + iDigit2));
                            }
                            return null;
                        }
                        i = i2;
                    } else {
                        iDigit = Character.digit(c, 16);
                        i += 2;
                        iDigit2 = Character.digit((char) bArr[i], 16);
                        if (iDigit == -1) {
                            return null;
                        }
                        byteArrayOutputStream.write((char) ((iDigit << 4) + iDigit2));
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
