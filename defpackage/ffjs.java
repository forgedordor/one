package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.x509.CertificateList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffjs extends CertificateFactorySpi {
    private static final ffjv a = new ffjv("CERTIFICATE");
    private static final ffjv b = new ffjv("CRL");
    private final ffkv i = new ffkt();
    private ASN1Set c = null;
    private int d = 0;
    private InputStream e = null;
    private ASN1Set f = null;
    private int g = 0;
    private InputStream h = null;

    static {
        new ffjv("PKCS7");
    }

    private final CRL b(InputStream inputStream, boolean z) throws IOException, CRLException {
        InputStream inputStream2 = this.h;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.h = inputStream;
            this.f = null;
            this.g = 0;
        }
        try {
            ASN1Set aSN1Set = this.f;
            if (aSN1Set != null) {
                if (this.g != aSN1Set.e()) {
                    return c();
                }
                this.f = null;
                this.g = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(ffxd.a(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            return i != 48 ? d(b.a(inputStream, z)) : d(ASN1Sequence.j(new ASN1InputStream(inputStream, (byte[]) null).f()));
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    private final CRL c() {
        ASN1Set aSN1Set = this.f;
        if (aSN1Set == null || this.g >= aSN1Set.e()) {
            return null;
        }
        ASN1Set aSN1Set2 = this.f;
        int i = this.g;
        this.g = i + 1;
        return a(CertificateList.c(aSN1Set2.f(i)));
    }

    private final CRL d(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.e() <= 1 || !(aSN1Sequence.h(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.h(0).equals(PKCSObjectIdentifiers.u)) {
            return a(CertificateList.c(aSN1Sequence));
        }
        this.f = SignedData.a(ASN1Sequence.m((ASN1TaggedObject) aSN1Sequence.h(1), true)).M;
        return c();
    }

    private final Certificate e(InputStream inputStream, boolean z) throws ffjr, IOException {
        InputStream inputStream2 = this.e;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.e = inputStream;
            this.c = null;
            this.d = 0;
        }
        try {
            ASN1Set aSN1Set = this.c;
            if (aSN1Set != null) {
                if (this.d != aSN1Set.e()) {
                    return f();
                }
                this.c = null;
                this.d = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(ffxd.a(inputStream));
            }
            inputStream.mark(1);
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            inputStream.reset();
            return i != 48 ? g(a.a(inputStream, z)) : g(ASN1Sequence.j(new ASN1InputStream(inputStream).f()));
        } catch (Exception e) {
            throw new ffjr("parsing issue: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    private final Certificate f() {
        if (this.c == null) {
            return null;
        }
        while (this.d < this.c.e()) {
            ASN1Set aSN1Set = this.c;
            int i = this.d;
            this.d = i + 1;
            ASN1Encodable aSN1EncodableF = aSN1Set.f(i);
            if (aSN1EncodableF instanceof ASN1Sequence) {
                return new ffkm(this.i, org.bouncycastle.asn1.x509.Certificate.c(aSN1EncodableF));
            }
        }
        return null;
    }

    private final Certificate g(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.e() <= 1 || !(aSN1Sequence.h(0) instanceof ASN1ObjectIdentifier) || !aSN1Sequence.h(0).equals(PKCSObjectIdentifiers.u)) {
            return new ffkm(this.i, org.bouncycastle.asn1.x509.Certificate.c(aSN1Sequence));
        }
        this.c = SignedData.a(ASN1Sequence.m((ASN1TaggedObject) aSN1Sequence.h(1), true)).L;
        return f();
    }

    protected final CRL a(CertificateList certificateList) {
        return new ffkf(this.i, certificateList);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CRL engineGenerateCRL(InputStream inputStream) {
        return b(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCRLs(InputStream inputStream) throws IOException, CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL crlB = b(bufferedInputStream, arrayList.isEmpty());
            if (crlB == null) {
                return arrayList;
            }
            arrayList.add(crlB);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream) {
        return new ffjw(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Certificate engineGenerateCertificate(InputStream inputStream) {
        return e(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCertificates(InputStream inputStream) throws ffjr, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate certificateE = e(bufferedInputStream, arrayList.isEmpty());
            if (certificateE == null) {
                return arrayList;
            }
            arrayList.add(certificateE);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Iterator engineGetCertPathEncodings() {
        return ffjw.a.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new ffjw(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n".concat(String.valueOf(obj.toString())));
            }
        }
        return new ffjw(list);
    }
}
