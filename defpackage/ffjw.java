package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffjw extends CertPath {
    static final List a;
    private List b;
    private final ffkv c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        a = DesugarCollections.unmodifiableList(arrayList);
    }

    public ffjw(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        ffkt ffktVar = new ffkt();
        this.c = ffktVar;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException(a.v(str, "unsupported encoding: "));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.b = new ArrayList();
                CertificateFactory certificateFactoryB = ffktVar.b();
                while (true) {
                    Certificate certificateGenerateCertificate = certificateFactoryB.generateCertificate(bufferedInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    } else {
                        this.b.add(certificateGenerateCertificate);
                    }
                }
            } else {
                ASN1Primitive aSN1PrimitiveF = new ASN1InputStream(inputStream).f();
                if (!(aSN1PrimitiveF instanceof ASN1Sequence)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration enumerationF = ((ASN1Sequence) aSN1PrimitiveF).f();
                this.b = new ArrayList();
                CertificateFactory certificateFactoryB2 = ffktVar.b();
                while (enumerationF.hasMoreElements()) {
                    this.b.add(0, certificateFactoryB2.generateCertificate(new ByteArrayInputStream(((ASN1Encodable) enumerationF.nextElement()).p().u())));
                }
            }
            this.b = a(this.b);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n".concat(String.valueOf(e.toString())));
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n".concat(String.valueOf(e2.toString())));
        }
    }

    private static final List a(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
            for (int i = 1; i != list.size(); i++) {
                if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    ArrayList arrayList = new ArrayList(list.size());
                    ArrayList arrayList2 = new ArrayList(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i3 = 0;
                        while (true) {
                            if (i3 == list.size()) {
                                arrayList.add(x509Certificate);
                                list.remove(i2);
                                break;
                            }
                            if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                break;
                            }
                            i3++;
                        }
                    }
                    if (arrayList.size() <= 1) {
                        for (int i4 = 0; i4 != arrayList.size(); i4++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                            int i5 = 0;
                            while (true) {
                                if (i5 < list.size()) {
                                    X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                        arrayList.add(x509Certificate2);
                                        list.remove(i5);
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        if (list.size() <= 0) {
                            return arrayList;
                        }
                    }
                    return arrayList2;
                }
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
            }
        }
        return list;
    }

    private static final ASN1Primitive b(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new ASN1InputStream(x509Certificate.getEncoded()).f();
        } catch (Exception e) {
            throw new CertificateEncodingException("Exception while encoding certificate: ".concat(String.valueOf(e.toString())));
        }
    }

    private static final byte[] c(ASN1Encodable aSN1Encodable) throws CertificateEncodingException {
        try {
            return aSN1Encodable.p().u();
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: ".concat(e.toString()));
        }
    }

    @Override // java.security.cert.CertPath
    public final List getCertificates() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.b));
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded() {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public final Iterator getEncodings() {
        return a.iterator();
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded(String str) throws IOException, CertificateEncodingException {
        char[] cArr;
        int i;
        ffjw ffjwVar = this;
        if (str.equalsIgnoreCase("PkiPath")) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            List list = ffjwVar.b;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                aSN1EncodableVector.b(b((X509Certificate) listIterator.previous()));
            }
            return c(new DERSequence(aSN1EncodableVector));
        }
        if (str.equalsIgnoreCase("PKCS7")) {
            ContentInfo contentInfo = new ContentInfo(PKCSObjectIdentifiers.t, null);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            for (int i2 = 0; i2 != ffjwVar.b.size(); i2++) {
                aSN1EncodableVector2.b(b((X509Certificate) ffjwVar.b.get(i2)));
            }
            return c(new ContentInfo(PKCSObjectIdentifiers.u, new SignedData(new ASN1Integer(1L), new DERSet(), contentInfo, new DERSet(aSN1EncodableVector2), new DERSet())));
        }
        if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ffxi ffxiVar = new ffxi(new OutputStreamWriter(byteArrayOutputStream));
            int i3 = 0;
            while (i3 != ffjwVar.b.size()) {
                try {
                    ffxf ffxfVar = new ffxf("CERTIFICATE", ffxf.a, ((X509Certificate) ffjwVar.b.get(i3)).getEncoded());
                    String str2 = ffxfVar.b;
                    ffxiVar.write(a.a(str2, "-----BEGIN ", "-----"));
                    ffxiVar.newLine();
                    List<ffxe> list2 = ffxfVar.c;
                    if (!list2.isEmpty()) {
                        for (ffxe ffxeVar : list2) {
                            ffxiVar.write(ffxeVar.a);
                            ffxiVar.write(": ");
                            ffxiVar.write(ffxeVar.b);
                            ffxiVar.newLine();
                        }
                        ffxiVar.newLine();
                    }
                    byte[] bArr = ffxfVar.d;
                    ffwy ffwyVar = ffwv.a;
                    int length = bArr.length;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(((length + 2) / 3) * 4);
                    try {
                        ffwy ffwyVar2 = ffwv.a;
                        byte[] bArr2 = new byte[72];
                        int i4 = 0;
                        while (length > 0) {
                            int iMin = Math.min(54, length);
                            int i5 = i4 + iMin;
                            int i6 = i4;
                            int i7 = 0;
                            while (i6 < i5 - 2) {
                                byte b = bArr[i6];
                                int i8 = i6 + 2;
                                int i9 = bArr[i6 + 1] & 255;
                                i6 += 3;
                                ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                                byte b2 = bArr[i8];
                                int i10 = b2 & 255;
                                byte[] bArr3 = ((ffww) ffwyVar2).a;
                                bArr2[i7] = bArr3[(b >>> 2) & 63];
                                bArr2[i7 + 1] = bArr3[((b << 4) | (i9 >>> 4)) & 63];
                                int i11 = i7 + 3;
                                bArr2[i7 + 2] = bArr3[((i10 >>> 6) | (i9 << 2)) & 63];
                                i7 += 4;
                                bArr2[i11] = bArr3[b2 & 63];
                                byteArrayOutputStream = byteArrayOutputStream3;
                            }
                            ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
                            int i12 = iMin - (i6 - i4);
                            if (i12 == 1) {
                                int i13 = bArr[i6] & 255;
                                byte[] bArr4 = ((ffww) ffwyVar2).a;
                                bArr2[i7] = bArr4[i13 >>> 2];
                                bArr2[i7 + 1] = bArr4[(i13 << 4) & 63];
                                int i14 = i7 + 3;
                                byte b3 = ((ffww) ffwyVar2).b;
                                bArr2[i7 + 2] = b3;
                                i7 += 4;
                                bArr2[i14] = b3;
                            } else if (i12 == 2) {
                                int i15 = bArr[i6] & 255;
                                int i16 = bArr[i6 + 1] & 255;
                                byte[] bArr5 = ((ffww) ffwyVar2).a;
                                bArr2[i7] = bArr5[i15 >>> 2];
                                bArr2[i7 + 1] = bArr5[((i15 << 4) | (i16 >>> 4)) & 63];
                                int i17 = i7 + 3;
                                bArr2[i7 + 2] = bArr5[(i16 << 2) & 63];
                                i7 += 4;
                                bArr2[i17] = ((ffww) ffwyVar2).b;
                            }
                            byteArrayOutputStream2.write(bArr2, 0, i7);
                            length -= iMin;
                            byteArrayOutputStream = byteArrayOutputStream4;
                            i4 = i5;
                        }
                        ByteArrayOutputStream byteArrayOutputStream5 = byteArrayOutputStream;
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        for (int i18 = 0; i18 < byteArray.length; i18 += 64) {
                            int i19 = 0;
                            while (true) {
                                cArr = ffxiVar.a;
                                int length2 = cArr.length;
                                if (i19 != 64 && (i = i18 + i19) < byteArray.length) {
                                    cArr[i19] = (char) byteArray[i];
                                    i19++;
                                }
                            }
                            ffxiVar.write(cArr, 0, i19);
                            ffxiVar.newLine();
                        }
                        ffxiVar.write(a.a(str2, "-----END ", "-----"));
                        ffxiVar.newLine();
                        i3++;
                        ffjwVar = this;
                        byteArrayOutputStream = byteArrayOutputStream5;
                    } catch (Exception e) {
                        throw new ffwz("exception encoding base64 string: ".concat(String.valueOf(e.getMessage())), e);
                    }
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            ByteArrayOutputStream byteArrayOutputStream6 = byteArrayOutputStream;
            ffxiVar.close();
            return byteArrayOutputStream6.toByteArray();
        }
        throw new CertificateEncodingException("unsupported encoding: ".concat(String.valueOf(str)));
    }

    public ffjw(List list) {
        super("X.509");
        this.c = new ffkt();
        this.b = a(new ArrayList(list));
    }
}
