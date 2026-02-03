package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffml implements ffxg {
    private final ffmg a;

    public ffml(ffmg ffmgVar) {
        this.a = ffmgVar;
    }

    @Override // defpackage.ffxg
    public final Object a(ffxf ffxfVar) throws IOException {
        String str = null;
        boolean z = false;
        for (ffxe ffxeVar : ffxfVar.c) {
            String str2 = ffxeVar.a;
            if (str2.equals("Proc-Type") && ffxeVar.b.equals("4,ENCRYPTED")) {
                z = true;
            } else if (str2.equals("DEK-Info")) {
                str = ffxeVar.b;
            }
        }
        byte[] bArr = ffxfVar.d;
        try {
            if (!z) {
                return this.a.a(bArr);
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            stringTokenizer.nextToken();
            String strNextToken = stringTokenizer.nextToken();
            ffxb ffxbVar = ffxa.a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ffxb ffxbVar2 = ffxa.a;
                byte[] bArr2 = new byte[36];
                int length = strNextToken.length();
                while (length > 0) {
                    int i = length - 1;
                    if (!ffxb.a(strNextToken.charAt(i))) {
                        break;
                    }
                    length = i;
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    while (i2 < length && ffxb.a(strNextToken.charAt(i2))) {
                        i2++;
                    }
                    byte[] bArr3 = ffxbVar2.b;
                    int i4 = i2 + 1;
                    byte b = bArr3[strNextToken.charAt(i2)];
                    while (i4 < length && ffxb.a(strNextToken.charAt(i4))) {
                        i4++;
                    }
                    int i5 = i4 + 1;
                    byte b2 = bArr3[strNextToken.charAt(i4)];
                    if ((b | b2) < 0) {
                        throw new IOException("invalid characters encountered in Hex string");
                    }
                    int i6 = i3 + 1;
                    bArr2[i3] = (byte) ((b << 4) | b2);
                    if (i6 == 36) {
                        byteArrayOutputStream.write(bArr2);
                        i3 = 0;
                    } else {
                        i3 = i6;
                    }
                    i2 = i5;
                }
                if (i3 > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i3);
                }
                byteArrayOutputStream.toByteArray();
                return new ffmd();
            } catch (Exception e) {
                throw new ffwx("exception decoding Hex string: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (IOException e2) {
            if (z) {
                throw new ffme("exception decoding - please check password and data.", e2);
            }
            throw new ffme(e2.getMessage(), e2);
        } catch (IllegalArgumentException e3) {
            if (z) {
                throw new ffme("exception decoding - please check password and data.", e3);
            }
            throw new ffme(e3.getMessage(), e3);
        }
    }
}
