package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Hashtable;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V3TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebga {
    public static final char[] a = {'J', 'I', 'B', 'E'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(Certificate certificate, String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(certificate.getEncoded());
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            StringBuffer stringBuffer = new StringBuffer(length + length);
            for (int i = 0; i < bArrDigest.length; i++) {
                if (i > 0) {
                    stringBuffer.append(':');
                }
                char[] cArr = b;
                stringBuffer.append(cArr[(bArrDigest[i] & 240) >> 4]);
                stringBuffer.append(cArr[bArrDigest[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            dhja.i(e, "Error while creating fingerprint: %s", e.getMessage());
            return null;
        }
    }

    public static X509Certificate b(KeyStore keyStore) {
        return (X509Certificate) keyStore.getCertificate("private");
    }

    public static boolean c(String str) {
        return "SHA-1".equalsIgnoreCase(str) || "SHA-256".equalsIgnoreCase(str);
    }

    public static void d(Context context, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, IOException, KeyStoreException, CertificateException {
        dhja.c("Generating keypair of length %d", 2048);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048, new SecureRandom());
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        dhja.c("Generating certificate for issuer %s", "C=US, ST=California, L=California, O=Jibe, OU=Jibe, CN=Jibe");
        Certificate certificateF = f(keyPairGenerateKeyPair, str);
        dhja.c("Generating key store", new Object[0]);
        Certificate[] certificateArr = {certificateF};
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        KeyStore keyStore = KeyStore.getInstance("BKS");
        keyStore.load(null, null);
        char[] cArr = a;
        keyStore.setKeyEntry("private", privateKey, cArr, certificateArr);
        dhja.c("Saving key store to file %s", "msrp.bks");
        if (TextUtils.isEmpty("msrp.bks")) {
            throw new IllegalArgumentException("Filename must not be empty");
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.getApplicationContext().openFileOutput("msrp.bks", 0);
            if (fileOutputStreamOpenFileOutput == null) {
                throw new IOException(a.v("msrp.bks", "Unable to open file for writing: "));
            }
            keyStore.store(fileOutputStreamOpenFileOutput, cArr);
            dhji.a(fileOutputStreamOpenFileOutput);
        } catch (Throwable th) {
            dhji.a(null);
            throw th;
        }
    }

    public static KeyStore e(Context context) throws IOException {
        if (TextUtils.isEmpty("msrp.bks")) {
            throw new IllegalArgumentException("Filename must not be empty");
        }
        dhja.c("Loading key store %s", "msrp.bks");
        FileInputStream fileInputStreamOpenFileInput = context.getApplicationContext().openFileInput("msrp.bks");
        if (fileInputStreamOpenFileInput == null) {
            throw new FileNotFoundException("Keystore file not found: msrp.bks");
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("BKS");
            keyStore.load(fileInputStreamOpenFileInput, a);
            return keyStore;
        } finally {
            dhji.a(fileInputStreamOpenFileInput);
        }
    }

    private static Certificate f(KeyPair keyPair, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, ffxj {
        AlgorithmIdentifier algorithmIdentifier;
        Extension extensionB;
        Date date = new Date(dhkl.a().longValue() - 86400000);
        Date date2 = new Date(dhkl.a().longValue() + 31536000000L);
        X500Principal x500Principal = new X500Principal("C=US, ST=California, L=California, O=Jibe, OU=Jibe, CN=Jibe");
        X500Principal x500Principal2 = new X500Principal("C=US, ST=California, L=California, O=Jibe, OU=Jibe, CN=Jibe");
        try {
            ffxl ffxlVar = new ffxl();
            try {
                ffxlVar.b.d = X500Name.b(new ffkw(x500Principal.getEncoded()));
                BigInteger bigInteger = BigInteger.ONE;
                if (bigInteger.compareTo(BigInteger.ZERO) <= 0) {
                    throw new IllegalArgumentException("serial number must be a positive integer");
                }
                V3TBSCertificateGenerator v3TBSCertificateGenerator = ffxlVar.b;
                v3TBSCertificateGenerator.b = new ASN1Integer(bigInteger);
                v3TBSCertificateGenerator.e = new Time(date);
                v3TBSCertificateGenerator.f = new Time(date2);
                try {
                    v3TBSCertificateGenerator.g = X500Name.b(new ffkw(x500Principal2.getEncoded()).p());
                    try {
                        ffxlVar.b.h = SubjectPublicKeyInfo.b(new ASN1InputStream(keyPair.getPublic().getEncoded()).f());
                        ffxlVar.e = str;
                        try {
                            Hashtable hashtable = ffxk.a;
                            String strC = ffwu.c(str);
                            Hashtable hashtable2 = ffxk.a;
                            ffxlVar.c = hashtable2.containsKey(strC) ? (ASN1ObjectIdentifier) hashtable2.get(strC) : new ASN1ObjectIdentifier(strC);
                            ASN1ObjectIdentifier aSN1ObjectIdentifier = ffxlVar.c;
                            if (ffxk.c.contains(aSN1ObjectIdentifier)) {
                                algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier);
                            } else {
                                String strC2 = ffwu.c(str);
                                Hashtable hashtable3 = ffxk.b;
                                algorithmIdentifier = hashtable3.containsKey(strC2) ? new AlgorithmIdentifier(aSN1ObjectIdentifier, (ASN1Encodable) hashtable3.get(strC2)) : new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.a);
                            }
                            ffxlVar.d = algorithmIdentifier;
                            V3TBSCertificateGenerator v3TBSCertificateGenerator2 = ffxlVar.b;
                            v3TBSCertificateGenerator2.c = ffxlVar.d;
                            PrivateKey privateKey = keyPair.getPrivate();
                            X509ExtensionsGenerator x509ExtensionsGenerator = ffxlVar.f;
                            Vector vector = x509ExtensionsGenerator.b;
                            if (!vector.isEmpty()) {
                                Extensions extensionsC = Extensions.c(new X509Extensions(vector, x509ExtensionsGenerator.a));
                                v3TBSCertificateGenerator2.i = extensionsC;
                                if (extensionsC != null && (extensionB = extensionsC.b(Extension.c)) != null && extensionB.w) {
                                    v3TBSCertificateGenerator2.j = true;
                                }
                            }
                            if (v3TBSCertificateGenerator2.b == null || v3TBSCertificateGenerator2.c == null || v3TBSCertificateGenerator2.d == null || v3TBSCertificateGenerator2.e == null || v3TBSCertificateGenerator2.f == null || ((v3TBSCertificateGenerator2.g == null && !v3TBSCertificateGenerator2.j) || v3TBSCertificateGenerator2.h == null)) {
                                throw new IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
                            }
                            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
                            aSN1EncodableVector.b(v3TBSCertificateGenerator2.a);
                            aSN1EncodableVector.b(v3TBSCertificateGenerator2.b);
                            AlgorithmIdentifier algorithmIdentifier2 = v3TBSCertificateGenerator2.c;
                            if (algorithmIdentifier2 != null) {
                                aSN1EncodableVector.b(algorithmIdentifier2);
                            }
                            aSN1EncodableVector.b(v3TBSCertificateGenerator2.d);
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
                            aSN1EncodableVector2.b(v3TBSCertificateGenerator2.e);
                            aSN1EncodableVector2.b(v3TBSCertificateGenerator2.f);
                            aSN1EncodableVector.b(new DERSequence(aSN1EncodableVector2));
                            X500Name x500Name = v3TBSCertificateGenerator2.g;
                            if (x500Name != null) {
                                aSN1EncodableVector.b(x500Name);
                            } else {
                                aSN1EncodableVector.b(new DERSequence());
                            }
                            aSN1EncodableVector.b(v3TBSCertificateGenerator2.h);
                            Extensions extensions = v3TBSCertificateGenerator2.i;
                            if (extensions != null) {
                                aSN1EncodableVector.b(new DERTaggedObject(true, 3, extensions));
                            }
                            TBSCertificate tBSCertificateA = TBSCertificate.a(new DERSequence(aSN1EncodableVector));
                            try {
                                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ffxlVar.c;
                                String str2 = ffxlVar.e;
                                if (aSN1ObjectIdentifier2 == null) {
                                    throw new IllegalStateException("no signature algorithm specified");
                                }
                                Signature signature = Signature.getInstance(str2);
                                signature.initSign(privateKey);
                                signature.update(tBSCertificateA.p().u());
                                byte[] bArrSign = signature.sign();
                                try {
                                    ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
                                    aSN1EncodableVector3.b(tBSCertificateA);
                                    aSN1EncodableVector3.b(ffxlVar.d);
                                    aSN1EncodableVector3.b(new DERBitString(bArrSign));
                                    return ffxlVar.a.engineGenerateCertificate(new ByteArrayInputStream(new DERSequence(aSN1EncodableVector3).u()));
                                } catch (Exception e) {
                                    throw new ffxj("exception producing certificate object", e);
                                }
                            } catch (IOException e2) {
                                throw new ffxj("exception encoding TBS cert", e2);
                            }
                        } catch (Exception unused) {
                            throw new IllegalArgumentException("Unknown signature type requested: ".concat(str));
                        }
                    } catch (Exception e3) {
                        throw new IllegalArgumentException("unable to process key - ".concat(String.valueOf(e3.toString())));
                    }
                } catch (IOException e4) {
                    throw new IllegalArgumentException("can't process principal: ".concat(e4.toString()));
                }
            } catch (IOException e5) {
                throw new IllegalArgumentException("can't process principal: ".concat(e5.toString()));
            }
        } catch (NoSuchMethodError e6) {
            dhja.i(e6, "Platform does not have API to use X509V3CertificateGenerator.", new Object[0]);
            throw new IllegalStateException(e6.toString());
        }
    }
}
