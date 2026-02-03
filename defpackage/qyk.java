package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyk {
    public static byte[] a(byte[] bArr) throws qyj {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                try {
                    int iDigit = Character.digit((char) bArr[i + 1], 16);
                    i += 2;
                    int iDigit2 = Character.digit((char) bArr[i], 16);
                    if (iDigit == -1 || iDigit2 == -1) {
                        throw new qyj();
                    }
                    byteArrayOutputStream.write((char) ((iDigit << 4) + iDigit2));
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new qyj(e);
                }
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
