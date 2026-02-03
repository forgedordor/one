package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffkm extends ffkj {
    private final Object g;
    private ffkk h;
    private X500Principal i;
    private PublicKey j;
    private X500Principal k;
    private long[] l;
    private volatile boolean m;
    private volatile int n;

    /* JADX WARN: Illegal instructions before constructor call */
    public ffkm(ffkv ffkvVar, Certificate certificate) throws CertificateParsingException {
        Exception exc;
        boolean[] zArr;
        try {
            byte[] bArrB = b(certificate, "2.5.29.19");
            BasicConstraints basicConstraintsA = bArrB == null ? null : BasicConstraints.a(ASN1Primitive.v(bArrB));
            try {
                byte[] bArrB2 = b(certificate, "2.5.29.15");
                if (bArrB2 == null) {
                    zArr = null;
                } else {
                    ASN1BitString aSN1BitStringI = ASN1BitString.i(ASN1Primitive.v(bArrB2));
                    byte[] bArrM = aSN1BitStringI.m();
                    int length = (bArrM.length * 8) - aSN1BitStringI.f();
                    int i = 9;
                    if (length >= 9) {
                        i = length;
                    }
                    boolean[] zArr2 = new boolean[i];
                    for (int i2 = 0; i2 != length; i2++) {
                        try {
                            zArr2[i2] = (bArrM[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                        } catch (Exception e) {
                            exc = e;
                            throw new CertificateParsingException("cannot construct KeyUsage: ".concat(exc.toString()));
                        }
                    }
                    zArr = zArr2;
                }
                try {
                    String strA = ffkn.a(certificate.c);
                    try {
                        ASN1Encodable aSN1Encodable = certificate.c.b;
                        super(ffkvVar, certificate, basicConstraintsA, zArr, strA, aSN1Encodable != null ? aSN1Encodable.p().u() : null);
                        this.g = new Object();
                        new Hashtable();
                        new Vector();
                    } catch (Exception e2) {
                        throw new CertificateParsingException("cannot construct SigAlgParams: ".concat(e2.toString()));
                    }
                } catch (Exception e3) {
                    throw new CertificateParsingException("cannot construct SigAlgName: ".concat(e3.toString()));
                }
            } catch (Exception e4) {
                exc = e4;
            }
        } catch (Exception e5) {
            throw new CertificateParsingException("cannot construct BasicConstraints: ".concat(e5.toString()));
        }
    }

    private final ffkk c() {
        byte[] bArrU;
        ffkl ffklVar;
        ffkk ffkkVar;
        synchronized (this.g) {
            ffkk ffkkVar2 = this.h;
            if (ffkkVar2 != null) {
                return ffkkVar2;
            }
            try {
                bArrU = this.a.u();
                ffklVar = null;
            } catch (IOException e) {
                bArrU = null;
                ffklVar = new ffkl(e);
            }
            ffkk ffkkVar3 = new ffkk(this.f, this.a, this.b, this.c, this.d, this.e, bArrU, ffklVar);
            synchronized (this.g) {
                if (this.h == null) {
                    this.h = ffkkVar3;
                }
                ffkkVar = this.h;
            }
            return ffkkVar;
        }
    }

    @Override // defpackage.ffkj, java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        long[] jArr;
        Object obj = this.g;
        long time = date.getTime();
        synchronized (obj) {
            jArr = this.l;
            if (jArr == null) {
                long[] jArr2 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
                synchronized (this.g) {
                    if (this.l == null) {
                        this.l = jArr2;
                    }
                    jArr = this.l;
                }
            }
        }
        if (time > jArr[1]) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.a.d().a()));
        }
        if (time < jArr[0]) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.a.e().a()));
        }
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        ASN1BitString aSN1BitString;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ffkm)) {
            return c().equals(obj);
        }
        ffkm ffkmVar = (ffkm) obj;
        if (this.m && ffkmVar.m) {
            if (this.n != ffkmVar.n) {
                return false;
            }
        } else if ((this.h == null || ffkmVar.h == null) && (aSN1BitString = this.a.d) != null && !aSN1BitString.w(ffkmVar.a.d)) {
            return false;
        }
        return c().equals(ffkmVar.c());
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return ffwk.c(c().getEncoded());
    }

    @Override // defpackage.ffkj, java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.g) {
            X500Principal x500Principal2 = this.i;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal issuerX500Principal = super.getIssuerX500Principal();
            synchronized (this.g) {
                if (this.i == null) {
                    this.i = issuerX500Principal;
                }
                x500Principal = this.i;
            }
            return x500Principal;
        }
    }

    @Override // defpackage.ffkj, java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.g) {
            PublicKey publicKey2 = this.j;
            if (publicKey2 != null) {
                return publicKey2;
            }
            PublicKey publicKey3 = super.getPublicKey();
            if (publicKey3 == null) {
                return null;
            }
            synchronized (this.g) {
                if (this.j == null) {
                    this.j = publicKey3;
                }
                publicKey = this.j;
            }
            return publicKey;
        }
    }

    @Override // defpackage.ffkj, java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.g) {
            X500Principal x500Principal2 = this.k;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal subjectX500Principal = super.getSubjectX500Principal();
            synchronized (this.g) {
                if (this.k == null) {
                    this.k = subjectX500Principal;
                }
                x500Principal = this.k;
            }
            return x500Principal;
        }
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (!this.m) {
            this.n = c().hashCode();
            this.m = true;
        }
        return this.n;
    }
}
