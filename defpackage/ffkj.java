package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class ffkj extends X509Certificate {
    protected final Certificate a;
    protected final BasicConstraints b;
    protected final boolean[] c;
    protected final String d;
    protected final byte[] e;
    protected final ffkv f;

    public ffkj(ffkv ffkvVar, Certificate certificate, BasicConstraints basicConstraints, boolean[] zArr, String str, byte[] bArr) {
        this.f = ffkvVar;
        this.a = certificate;
        this.b = basicConstraints;
        this.c = zArr;
        this.d = str;
        this.e = bArr;
    }

    protected static ASN1OctetString a(Certificate certificate, String str) {
        Extension extensionB;
        Extensions extensions = certificate.b.l;
        if (extensions == null || (extensionB = extensions.b(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        return extensionB.x;
    }

    protected static byte[] b(Certificate certificate, String str) {
        ASN1OctetString aSN1OctetStringA = a(certificate, str);
        if (aSN1OctetStringA != null) {
            return aSN1OctetStringA.c;
        }
        return null;
    }

    private static Collection c(Certificate certificate, String str) throws CertificateParsingException, IOException {
        byte[] bArrB = b(certificate, str);
        if (bArrB == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration enumerationF = ASN1Sequence.j(bArrB).f();
            while (enumerationF.hasMoreElements()) {
                GeneralName generalNameA = GeneralName.a(enumerationF.nextElement());
                ArrayList arrayList2 = new ArrayList();
                int i = generalNameA.b;
                arrayList2.add(Integer.valueOf(i));
                switch (i) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(generalNameA.s());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((ASN1String) generalNameA.a).e());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 4:
                        X500NameStyle x500NameStyle = RFC4519Style.R;
                        ASN1Encodable aSN1Encodable = generalNameA.a;
                        X500NameStyle x500NameStyle2 = X500Name.a;
                        arrayList2.add((aSN1Encodable instanceof X500Name ? new X500Name(x500NameStyle, (X500Name) aSN1Encodable) : aSN1Encodable != null ? new X500Name(x500NameStyle, ASN1Sequence.j(aSN1Encodable)) : null).toString());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(DEROctetString.f(generalNameA.a).c).getHostAddress());
                            arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                    case 8:
                        arrayList2.add(ASN1ObjectIdentifier.h(generalNameA.a).e());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    default:
                        throw new IOException(a.g(i, "Bad tag number: "));
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return DesugarCollections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    private final void d(PublicKey publicKey, Signature signature, ASN1Encodable aSN1Encodable, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        Certificate certificate = this.a;
        if (!ffkn.d(certificate.c, certificate.b.d)) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        ffkn.c(signature, aSN1Encodable);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new ffjq(signature), 512);
            certificate.b.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    private final void e(PublicKey publicKey, ffjx ffjxVar) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        boolean z = publicKey instanceof ffjp;
        if (z && ffkn.e(this.a.c)) {
            throw null;
        }
        Certificate certificate = this.a;
        if (!ffkn.e(certificate.c)) {
            Signature signatureA = ffjxVar.a(this.d);
            if (!z) {
                d(publicKey, signatureA, certificate.c.b, getSignature());
                return;
            } else {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = ffjj.a;
                throw null;
            }
        }
        ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(certificate.c.b);
        ASN1Sequence aSN1SequenceJ2 = ASN1Sequence.j(certificate.d.n());
        boolean z2 = false;
        for (int i = 0; i != aSN1SequenceJ2.e(); i++) {
            AlgorithmIdentifier algorithmIdentifierA = AlgorithmIdentifier.a(aSN1SequenceJ.h(i));
            try {
                d(publicKey, ffjxVar.a(ffkn.a(algorithmIdentifierA)), algorithmIdentifierA.b, ASN1BitString.i(aSN1SequenceJ2.h(i)).n());
                z2 = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            } catch (SignatureException e) {
                e = e;
            }
            e = null;
            if (e != null) {
                throw e;
            }
        }
        if (!z2) {
            throw new InvalidKeyException("no matching key found");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        BasicConstraints basicConstraints = this.b;
        if (basicConstraints == null || !basicConstraints.b()) {
            return -1;
        }
        ASN1Integer aSN1Integer = basicConstraints.b;
        if (aSN1Integer == null) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        byte[] bArr = aSN1Integer.b;
        int length = bArr.length;
        int i = aSN1Integer.c;
        int i2 = length - i;
        if (i2 > 4 || (i2 == 4 && (bArr[i] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return ASN1Integer.e(bArr, i, 255);
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.a.b.l;
        if (extensions == null) {
            return null;
        }
        Enumeration enumerationA = extensions.a();
        while (enumerationA.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationA.nextElement();
            if (extensions.b(aSN1ObjectIdentifier).w) {
                hashSet.add(aSN1ObjectIdentifier.e());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] bArrB = b(this.a, "2.5.29.37");
        if (bArrB == null) {
            return null;
        }
        try {
            ASN1Sequence aSN1SequenceJ = ASN1Sequence.j(ASN1Primitive.v(bArrB));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != aSN1SequenceJ.e(); i++) {
                arrayList.add(((ASN1ObjectIdentifier) aSN1SequenceJ.h(i)).e());
            }
            return DesugarCollections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
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
            throw new IllegalStateException("error parsing ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() {
        return c(this.a, Extension.d.e());
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return new ffkw(this.a.a());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        ASN1BitString aSN1BitString = this.a.b.j;
        if (aSN1BitString == null) {
            return null;
        }
        byte[] bArrM = aSN1BitString.m();
        int length = (bArrM.length * 8) - aSN1BitString.f();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bArrM[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.a.a().u());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        boolean[] zArr = this.c;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Extensions extensions = this.a.b.l;
        if (extensions == null) {
            return null;
        }
        Enumeration enumerationA = extensions.a();
        while (enumerationA.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationA.nextElement();
            if (!extensions.b(aSN1ObjectIdentifier).w) {
                hashSet.add(aSN1ObjectIdentifier.e());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.a.d().b();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.a.e().b();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        ffks ffksVar;
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = this.a.b.i;
            Logger logger = ffla.a;
            if (subjectPublicKeyInfo.a.a.m(BCObjectIdentifiers.am)) {
                new ffve();
                return new ffvd(subjectPublicKeyInfo);
            }
            ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.a.a;
            Map map = ffla.b;
            synchronized (map) {
                ffksVar = (ffks) map.get(aSN1ObjectIdentifier);
            }
            if (ffksVar == null) {
                return null;
            }
            return ffksVar.b(subjectPublicKeyInfo);
        } catch (IOException e) {
            throw new IllegalStateException("failed to recover public key: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.a.b.c.j();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.d;
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.a.c.a.e();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return ffwk.c(this.e);
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.a.d.n();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() {
        return c(this.a, Extension.c.e());
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return new ffkw(this.a.b());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        ASN1BitString aSN1BitString = this.a.b.k;
        if (aSN1BitString == null) {
            return null;
        }
        byte[] bArrM = aSN1BitString.m();
        int length = (bArrM.length * 8) - aSN1BitString.f();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bArrM[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.a.b().u());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.a.b.u();
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.a.b.b.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Extensions extensions;
        if (getVersion() != 3 || (extensions = this.a.b.l) == null) {
            return false;
        }
        Enumeration enumerationA = extensions.a();
        while (enumerationA.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationA.nextElement();
            if (!aSN1ObjectIdentifier.w(Extension.b) && !aSN1ObjectIdentifier.w(Extension.m) && !aSN1ObjectIdentifier.w(Extension.n) && !aSN1ObjectIdentifier.w(Extension.r) && !aSN1ObjectIdentifier.w(Extension.l) && !aSN1ObjectIdentifier.w(Extension.i) && !aSN1ObjectIdentifier.w(Extension.h) && !aSN1ObjectIdentifier.w(Extension.o) && !aSN1ObjectIdentifier.w(Extension.e) && !aSN1ObjectIdentifier.w(Extension.c) && !aSN1ObjectIdentifier.w(Extension.k) && extensions.b(aSN1ObjectIdentifier).w) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = ffwu.a;
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.d);
        stringBuffer.append(str);
        ffkn.b(getSignature(), stringBuffer, str);
        Extensions extensions = this.a.b.l;
        if (extensions != null) {
            Enumeration enumerationA = extensions.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
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
                        if (aSN1ObjectIdentifier.w(Extension.e)) {
                            stringBuffer.append(BasicConstraints.a(aSN1InputStream.f()));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(Extension.b)) {
                            ASN1Primitive aSN1PrimitiveF = aSN1InputStream.f();
                            stringBuffer.append(aSN1PrimitiveF != null ? new KeyUsage(ASN1BitString.i(aSN1PrimitiveF)) : null);
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(ffjj.b)) {
                            stringBuffer.append(new ffjk(ASN1BitString.i(aSN1InputStream.f())));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(ffjj.c)) {
                            stringBuffer.append(new ffjl(ASN1IA5String.f(aSN1InputStream.f())));
                            stringBuffer.append(str);
                        } else if (aSN1ObjectIdentifier.w(ffjj.e)) {
                            stringBuffer.append(new ffjm(ASN1IA5String.f(aSN1InputStream.f())));
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
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        e(publicKey, new ffkg(this));
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.a.d().a()));
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.a.e().a()));
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        e(publicKey, new ffkh(str));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        try {
            e(publicKey, new ffki(provider));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
