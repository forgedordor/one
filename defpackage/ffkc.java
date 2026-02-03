package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.CRLNumber;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class ffkc extends X509CRL {
    protected final CertificateList a;
    protected final String b;
    protected final byte[] c;
    protected final boolean d;
    protected final ffkv e;

    public ffkc(ffkv ffkvVar, CertificateList certificateList, String str, byte[] bArr, boolean z) {
        this.e = ffkvVar;
        this.a = certificateList;
        this.b = str;
        this.c = bArr;
        this.d = z;
    }

    protected static ASN1OctetString a(CertificateList certificateList, String str) {
        Extension extensionB;
        Extensions extensions = certificateList.a.g;
        if (extensions == null || (extensionB = extensions.b(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extensionB.x;
    }

    private final Set b(boolean z) {
        Extensions extensions;
        if (getVersion() != 2 || (extensions = this.a.a.g) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = extensions.a();
        while (enumerationA.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationA.nextElement();
            if (z == extensions.b(aSN1ObjectIdentifier).w) {
                hashSet.add(aSN1ObjectIdentifier.e());
            }
        }
        return hashSet;
    }

    private final void c(PublicKey publicKey, Signature signature, ASN1Encodable aSN1Encodable, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CRLException, InvalidAlgorithmParameterException {
        CertificateList certificateList = this.a;
        if (!ffkn.d(certificateList.b, certificateList.a.b)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TbsCertList.");
        }
        ffkn.c(signature, aSN1Encodable);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new ffjq(signature), 512);
            certificateList.a.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private final void d(PublicKey publicKey, ffjx ffjxVar) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        CertificateList certificateList = this.a;
        if (!certificateList.b.equals(certificateList.a.b)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        if ((publicKey instanceof ffjp) && ffkn.e(certificateList.b)) {
            throw null;
        }
        if (!ffkn.e(certificateList.b)) {
            Signature signatureA = ffjxVar.a(this.b);
            byte[] bArr = this.c;
            if (bArr == null) {
                c(publicKey, signatureA, null, getSignature());
                return;
            }
            try {
                c(publicKey, signatureA, ASN1Primitive.v(bArr), getSignature());
                return;
            } catch (IOException e) {
                throw new SignatureException("cannot decode signature parameters: ".concat(String.valueOf(e.getMessage())));
            }
        }
        CertificateList certificateList2 = this.a;
        ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(certificateList2.b.b);
        ASN1Sequence aSN1SequenceJ2 = ASN1Sequence.j(certificateList2.c.n());
        boolean z = false;
        for (int i = 0; i != aSN1SequenceJ2.e(); i++) {
            AlgorithmIdentifier algorithmIdentifierA = AlgorithmIdentifier.a(aSN1SequenceJ.h(i));
            try {
                c(publicKey, ffjxVar.a(ffkn.a(algorithmIdentifierA)), algorithmIdentifierA.b, ASN1BitString.i(aSN1SequenceJ2.h(i)).n());
                z = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            } catch (SignatureException e2) {
                e = e2;
            }
            e = null;
            if (e != null) {
                throw e;
            }
        }
        if (!z) {
            throw new InvalidKeyException("no matching key found");
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return b(true);
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        ASN1OctetString aSN1OctetStringA = a(this.a, str);
        if (aSN1OctetStringA == null) {
            return null;
        }
        try {
            return aSN1OctetStringA.s();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // java.security.cert.X509CRL
    public final Principal getIssuerDN() {
        return new ffkw(X500Name.b(this.a.b().b));
    }

    @Override // java.security.cert.X509CRL
    public final X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.a.b().s());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getNextUpdate() {
        Time time = this.a.a.e;
        if (time == null) {
            return null;
        }
        return time.b();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return b(false);
    }

    @Override // java.security.cert.X509CRL
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        Extension extensionB;
        Enumeration enumerationA = this.a.a();
        X500Name x500NameB = null;
        while (enumerationA.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) enumerationA.nextElement();
            if (cRLEntry.a().q(bigInteger)) {
                return new ffjy(cRLEntry, this.d, x500NameB);
            }
            if (this.d && cRLEntry.d() && (extensionB = cRLEntry.b().b(Extension.j)) != null) {
                x500NameB = X500Name.b(GeneralNames.a(Extension.a(extensionB)).c()[0].a);
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final Set getRevokedCertificates() {
        Extension extensionB;
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = this.a.a();
        X500Name x500NameB = null;
        while (enumerationA.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) enumerationA.nextElement();
            boolean z = this.d;
            hashSet.add(new ffjy(cRLEntry, z, x500NameB));
            if (z && cRLEntry.d() && (extensionB = cRLEntry.b().b(Extension.j)) != null) {
                x500NameB = X500Name.b(GeneralNames.a(Extension.a(extensionB)).c()[0].a);
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgName() {
        return this.b;
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgOID() {
        return this.a.b.a.e();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSigAlgParams() {
        return ffwk.c(this.c);
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSignature() {
        return this.a.c.n();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getTBSCertList() throws CRLException {
        try {
            return this.a.a.u();
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getThisUpdate() {
        return this.a.a.d.b();
    }

    @Override // java.security.cert.X509CRL
    public final int getVersion() {
        ASN1Integer aSN1Integer = this.a.a.a;
        if (aSN1Integer == null) {
            return 1;
        }
        return aSN1Integer.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(Extension.i.e());
        criticalExtensionOIDs.remove(Extension.h.e());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.CRL
    public final boolean isRevoked(Certificate certificate) {
        X500Name x500NameA;
        Extension extensionB;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        CertificateList certificateList = this.a;
        Enumeration enumerationA = certificateList.a();
        X500Name x500NameB = certificateList.b();
        if (enumerationA.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (enumerationA.hasMoreElements()) {
                TBSCertList.CRLEntry cRLEntryC = TBSCertList.CRLEntry.c(enumerationA.nextElement());
                if (this.d && cRLEntryC.d() && (extensionB = cRLEntryC.b().b(Extension.j)) != null) {
                    x500NameB = X500Name.b(GeneralNames.a(Extension.a(extensionB)).c()[0].a);
                }
                if (cRLEntryC.a().q(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        x500NameA = X500Name.b(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            x500NameA = org.bouncycastle.asn1.x509.Certificate.c(certificate.getEncoded()).a();
                        } catch (CertificateEncodingException e) {
                            throw new IllegalArgumentException("Cannot process certificate: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                    return x500NameB.equals(x500NameA);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = ffwu.a;
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(str);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.b);
        stringBuffer.append(str);
        ffkn.b(getSignature(), stringBuffer, str);
        Extensions extensions = this.a.a.g;
        if (extensions != null) {
            Enumeration enumerationA = extensions.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("           Extensions: ");
                stringBuffer.append(str);
            }
            while (enumerationA.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationA.nextElement();
                Extension extensionB = extensions.b(aSN1ObjectIdentifier);
                ASN1OctetString aSN1OctetString = extensionB.x;
                if (aSN1OctetString != null) {
                    ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1OctetString.c);
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(extensionB.w);
                    stringBuffer.append(") ");
                    try {
                        if (aSN1ObjectIdentifier.w(Extension.f)) {
                            stringBuffer.append(new CRLNumber(ASN1Integer.m(aSN1InputStream.f()).i()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.h)) {
                            stringBuffer.append("Base CRL: " + new CRLNumber(ASN1Integer.m(aSN1InputStream.f()).i()).toString());
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.i)) {
                            stringBuffer.append(IssuingDistributionPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.l)) {
                            stringBuffer.append(CRLDistPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.q)) {
                            stringBuffer.append(CRLDistPoint.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else {
                            stringBuffer.append(aSN1ObjectIdentifier.e());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(ASN1Dump.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(aSN1ObjectIdentifier.e());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                        stringBuffer.append(str);
                    }
                } else {
                    stringBuffer.append(str);
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        d(publicKey, new ffjz(this));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        d(publicKey, new ffka(str));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        try {
            d(publicKey, new ffkb(this, provider));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
