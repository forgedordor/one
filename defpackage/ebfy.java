package defpackage;

import android.text.TextUtils;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebfy implements X509TrustManager {
    private final String a;
    private final String b;

    public ebfy(String str) throws SSLException {
        if (TextUtils.isEmpty(str)) {
            dhja.q("Expected fingerprint is empty. Will not be able to validate against certificate", new Object[0]);
            this.a = null;
            this.b = null;
            return;
        }
        List listI = ejxk.b(' ').i(str.toUpperCase(Locale.US));
        if (listI.size() < 2) {
            throw new SSLException("Unexpected fingerprint format.");
        }
        String str2 = (String) listI.get(0);
        this.b = str2;
        this.a = (String) listI.get(1);
        if (ebga.c(str2)) {
            return;
        }
        throw new SSLException("Unsupported fingerprint type " + str2 + ". Needs to be SHA-1 or SHA-256.");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        dhja.c("checkClientTrusted for auth type %s", str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws NoSuchAlgorithmException, CertificateException {
        dhja.c("checkServerTrusted for auth type %s", str);
        if (x509CertificateArr == null) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
        }
        if (x509CertificateArr.length <= 0) {
            throw new IllegalArgumentException("checkServerTrusted: X509Certificate is empty");
        }
        String str2 = this.a;
        if (TextUtils.isEmpty(str2)) {
            dhja.q("Expected fingerprint has not been set. Skipping validation", new Object[0]);
            return;
        }
        X509Certificate x509Certificate = x509CertificateArr[0];
        String str3 = this.b;
        String strA = ebga.a(x509Certificate, str3);
        if (!TextUtils.isEmpty(strA) && str2.equalsIgnoreCase(strA)) {
            dhja.c("Fingerprint verification has passed", new Object[0]);
            return;
        }
        throw new CertificateException("Fingerprint mismatch. Expected: " + str3 + " " + str2 + " - read from certificate: " + strA);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        dhja.c("getAcceptIssuers", new Object[0]);
        return null;
    }
}
