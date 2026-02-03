package defpackage;

import java.security.cert.CRLException;
import org.bouncycastle.asn1.x509.CertificateList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffkd extends ffkc {
    private final byte[] f;
    private final CRLException g;

    public ffkd(ffkv ffkvVar, CertificateList certificateList, String str, byte[] bArr, boolean z, byte[] bArr2, CRLException cRLException) {
        super(ffkvVar, certificateList, str, bArr, z);
        this.f = bArr2;
        this.g = cRLException;
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() throws CRLException {
        CRLException cRLException = this.g;
        if (cRLException != null) {
            throw cRLException;
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
