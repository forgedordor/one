package defpackage;

import android.content.Context;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebiu implements ebiv {
    private static final dhip a = new dhip("LocalMsrpCertificateManager");
    private String b;
    private KeyStore c;
    private final Context d;
    private boolean e = false;

    public ebiu(Context context) {
        this.d = context.getApplicationContext();
    }

    private final X509Certificate c(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, IOException, KeyStoreException, CertificateException {
        dhja.d(a, "Generating a new certificate.", new Object[0]);
        Context context = this.d;
        ebga.d(context, str);
        KeyStore keyStoreE = ebga.e(context);
        this.c = keyStoreE;
        return ebga.b(keyStoreE);
    }

    private final synchronized void d() {
        KeyStore keyStoreE;
        if (this.e) {
            throw new IllegalStateException("expected to be not initialized");
        }
        dhja.d(a, "Creating local MSRP certificate", new Object[0]);
        String strC = dfpk.c();
        if (!ebga.c(strC)) {
            throw new IllegalArgumentException("Not supported digest algorithm ".concat(String.valueOf(strC)));
        }
        String str = "SHA-1".equalsIgnoreCase(strC) ? "SHA1withRSA" : "SHA-256".equalsIgnoreCase(strC) ? "SHA256withRSA" : "";
        try {
            keyStoreE = ebga.e(this.d);
        } catch (IOException unused) {
            dhja.l(a, "Generating keystore due to uninitialized keystore file.", new Object[0]);
            Context context = this.d;
            ebga.d(context, str);
            keyStoreE = ebga.e(context);
        }
        X509Certificate x509CertificateB = ebga.b(keyStoreE);
        x509CertificateB.getClass();
        if (!f(x509CertificateB, strC)) {
            dhja.l(a, "Generating new local SSL certificate as the old one has expired", new Object[0]);
            x509CertificateB = c(str);
        } else if (x509CertificateB.getSigAlgName().equalsIgnoreCase(str)) {
            this.c = keyStoreE;
        } else {
            dhja.l(a, "Generating new local SSL certificate as signature algorithm changed. old:%s new:%s", x509CertificateB.getSigAlgName(), str);
            x509CertificateB = c(str);
        }
        if (x509CertificateB == null) {
            throw new IllegalStateException("expected non-null certificate");
        }
        String strA = ebga.a(x509CertificateB, strC);
        strA.getClass();
        this.b = strA;
        dhja.d(a, "Using fingerprint: %s", strA);
    }

    private final synchronized void e() {
        if (this.e) {
            return;
        }
        try {
            d();
            this.e = true;
        } catch (IOException e) {
            e = e;
            dhja.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (IllegalStateException e2) {
            dhja.j(e2, a, "Illegal state while initialize the certificate provider", new Object[0]);
        } catch (InvalidKeyException e3) {
            e = e3;
            dhja.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (KeyStoreException e4) {
            e = e4;
            dhja.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            dhja.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (SignatureException e6) {
            e = e6;
            dhja.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        } catch (CertificateException e7) {
            e = e7;
            dhja.j(e, a, "Error while initializing the certificate provider", new Object[0]);
        }
    }

    private static boolean f(X509Certificate x509Certificate, String str) throws NoSuchAlgorithmException, CertificateNotYetValidException, CertificateExpiredException {
        dhja.d(a, "(%s) certificate valid from: %s to: %s", ebga.a(x509Certificate, str), x509Certificate.getNotBefore().toString(), x509Certificate.getNotAfter().toString());
        try {
            x509Certificate.checkValidity(new Date(dhkl.a().longValue()));
            return true;
        } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
            return false;
        }
    }

    @Override // defpackage.ebiv
    public final String a() {
        e();
        return this.b;
    }

    @Override // defpackage.ebiv
    public final KeyStore b() {
        e();
        KeyStore keyStore = this.c;
        if (keyStore != null) {
            return keyStore;
        }
        throw new IllegalStateException("Keystore could not be created.");
    }
}
