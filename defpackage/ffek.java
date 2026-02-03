package defpackage;

import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffek extends ffeh {
    private final ffej a;

    public ffek(URL url, feyy feyyVar) {
        ffej ffejVar = new ffej(url, feyyVar);
        super(ffejVar);
        this.a = ffejVar;
    }

    @Override // defpackage.ffeh
    protected final feyk a() {
        ffej ffejVar = this.a;
        if (ffejVar.f != null) {
            return ffejVar.l;
        }
        throw new IllegalStateException("Connection has not yet been established");
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.a.a.t;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.a.a.a();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        ffej ffejVar = this.a;
        feyx feyxVar = new feyx(ffejVar.a);
        hostnameVerifier.getClass();
        if (!fdbq.f(hostnameVerifier, feyxVar.r)) {
            feyxVar.x = null;
        }
        feyxVar.r = hostnameVerifier;
        ffejVar.a = new feyy(feyxVar);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory == null) {
            throw new IllegalArgumentException("sslSocketFactory == null");
        }
        ffej ffejVar = this.a;
        feyx feyxVar = new feyx(ffejVar.a);
        if (!fdbq.f(sSLSocketFactory, feyxVar.n)) {
            feyxVar.x = null;
        }
        feyxVar.n = sSLSocketFactory;
        X509TrustManager x509TrustManagerB = ffdi.b.b(sSLSocketFactory);
        if (x509TrustManagerB != null) {
            feyxVar.o = x509TrustManagerB;
            ffdi ffdiVar = ffdi.b;
            X509TrustManager x509TrustManager = feyxVar.o;
            x509TrustManager.getClass();
            feyxVar.t = ffdiVar.c(x509TrustManager);
            ffejVar.a = new feyy(feyxVar);
            return;
        }
        Class<?> cls = sSLSocketFactory.getClass();
        throw new IllegalStateException("Unable to extract the trust manager on " + ffdi.b + ", sslSocketFactory is " + cls);
    }
}
