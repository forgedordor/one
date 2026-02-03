package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Sequence;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffjv {
    private final ffju[] a;

    public ffjv(String str) {
        this.a = new ffju[]{new ffju(str), new ffju("X509 ".concat(str)), new ffju("PKCS7")};
    }

    private final ffju b(String str) {
        for (int i = 0; i != 3; i++) {
            ffju ffjuVar = this.a[i];
            if (ffjuVar.b(str) || ffjuVar.a(str)) {
                return ffjuVar;
            }
        }
        return null;
    }

    private static final String c(InputStream inputStream) throws IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i = inputStream.read();
            if (i != 13 && i != 10 && i >= 0) {
                stringBuffer.append((char) i);
            } else if (i < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
        } else if (i == 13) {
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == 10) {
                inputStream.mark(1);
            } else if (i2 > 0) {
            }
            inputStream.reset();
        }
        return stringBuffer.toString();
    }

    final ASN1Sequence a(InputStream inputStream, boolean z) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        ffju ffjuVarB = null;
        while (ffjuVarB == null) {
            String strC = c(inputStream);
            if (strC == null) {
                break;
            }
            ffjuVarB = b(strC);
            if (ffjuVarB != null && !ffjuVarB.b(strC)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (ffjuVarB == null) {
            if (z) {
                throw new IOException("malformed PEM data: no header found");
            }
            return null;
        }
        ffju ffjuVarB2 = null;
        while (ffjuVarB2 == null) {
            String strC2 = c(inputStream);
            if (strC2 == null) {
                break;
            }
            ffjuVarB2 = b(strC2);
            if (ffjuVarB2 == null) {
                stringBuffer.append(strC2);
            } else if (!ffjuVarB.a(strC2)) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (ffjuVarB2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return ASN1Sequence.j(ffwv.a(stringBuffer.toString()));
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
