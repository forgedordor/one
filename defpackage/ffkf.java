package defpackage;

import java.io.IOException;
import java.security.cert.CRLException;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffkf extends ffkc {
    private final Object f;
    private ffkd g;
    private volatile boolean h;
    private volatile int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public ffkf(ffkv ffkvVar, CertificateList certificateList) throws CRLException {
        Exception exc;
        try {
            String strA = ffkn.a(certificateList.b);
            try {
                ASN1Encodable aSN1Encodable = certificateList.b.b;
                byte[] bArr = null;
                byte[] bArrU = aSN1Encodable == null ? null : aSN1Encodable.p().u();
                try {
                    ASN1OctetString aSN1OctetStringA = ffkc.a(certificateList, Extension.i.e());
                    if (aSN1OctetStringA != null) {
                        try {
                            bArr = aSN1OctetStringA.c;
                        } catch (Exception e) {
                            exc = e;
                            throw new ffjt(exc);
                        }
                    }
                    super(ffkvVar, certificateList, strA, bArrU, bArr == null ? false : IssuingDistributionPoint.a(bArr).a);
                    this.f = new Object();
                } catch (Exception e2) {
                    exc = e2;
                }
            } catch (Exception e3) {
                throw new CRLException("CRL contents invalid: ".concat(e3.toString()));
            }
        } catch (Exception e4) {
            throw new ffke("CRL contents invalid: ".concat(String.valueOf(e4.getMessage())), e4);
        }
    }

    private final ffkd b() {
        byte[] bArrU;
        ffke ffkeVar;
        ffkd ffkdVar;
        synchronized (this.f) {
            ffkd ffkdVar2 = this.g;
            if (ffkdVar2 != null) {
                return ffkdVar2;
            }
            try {
                bArrU = this.a.u();
                ffkeVar = null;
            } catch (IOException e) {
                bArrU = null;
                ffkeVar = new ffke(e);
            }
            ffkd ffkdVar3 = new ffkd(this.e, this.a, this.b, this.c, this.d, bArrU, ffkeVar);
            synchronized (this.f) {
                if (this.g == null) {
                    this.g = ffkdVar3;
                }
                ffkdVar = this.g;
            }
            return ffkdVar;
        }
    }

    @Override // java.security.cert.X509CRL
    public final boolean equals(Object obj) {
        ASN1BitString aSN1BitString;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffkf)) {
            return b().equals(obj);
        }
        ffkf ffkfVar = (ffkf) obj;
        if (this.h && ffkfVar.h) {
            if (this.i != ffkfVar.i) {
                return false;
            }
        } else if ((this.g == null || ffkfVar.g == null) && (aSN1BitString = this.a.c) != null && !aSN1BitString.w(ffkfVar.a.c)) {
            return false;
        }
        return b().equals(ffkfVar.b());
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() {
        return ffwk.c(b().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public final int hashCode() {
        if (!this.h) {
            this.i = b().hashCode();
            this.h = true;
        }
        return this.i;
    }
}
