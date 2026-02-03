package defpackage;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdu extends ffdq {
    private final Class b;
    private final Class c;

    public ffdu(Class cls, Class cls2, Class cls3) {
        super(cls);
        this.b = cls2;
        this.c = cls3;
    }

    @Override // defpackage.ffdq, defpackage.ffdt
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Object objJ = fezr.j(sSLSocketFactory, this.c, "sslParameters");
        objJ.getClass();
        X509TrustManager x509TrustManager = (X509TrustManager) fezr.j(objJ, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) fezr.j(objJ, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @Override // defpackage.ffdq, defpackage.ffdt
    public final boolean f(SSLSocketFactory sSLSocketFactory) {
        return this.b.isInstance(sSLSocketFactory);
    }
}
