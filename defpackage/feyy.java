package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyy implements Cloneable, fexj {
    public static final List a = fezr.o(feyz.d, feyz.b);
    public static final List b = fezr.o(fexu.a, fexu.b);
    public final fezp A;
    public final feya c;
    public final fexs d;
    public final List e;
    public final List f;
    public final boolean g;
    public final fexg h;
    public final boolean i;
    public final fexz j;
    public final feyc k;
    public final Proxy l;
    public final ProxySelector m;
    public final fexg n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final fexn u;
    public final ffea v;
    public final int w;
    public final int x;
    public final int y;
    public final ffap z;

    public feyy() {
        this(new feyx());
    }

    public final SSLSocketFactory a() {
        SSLSocketFactory sSLSocketFactory = this.p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final Object clone() {
        return super.clone();
    }

    public feyy(feyx feyxVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.c = feyxVar.a;
        this.d = feyxVar.b;
        this.e = fezr.p(feyxVar.c);
        this.f = fezr.p(feyxVar.d);
        this.A = feyxVar.y;
        this.g = feyxVar.e;
        this.h = feyxVar.f;
        this.i = feyxVar.g;
        this.j = feyxVar.h;
        this.k = feyxVar.i;
        this.l = feyxVar.j;
        if (feyxVar.j != null) {
            proxySelector = ffdv.a;
        } else {
            proxySelector = feyxVar.k;
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = ffdv.a;
            }
        }
        this.m = proxySelector;
        this.n = feyxVar.l;
        this.o = feyxVar.m;
        List list = feyxVar.p;
        this.r = list;
        this.s = feyxVar.q;
        this.t = feyxVar.r;
        this.w = feyxVar.u;
        this.x = feyxVar.v;
        this.y = feyxVar.w;
        ffap ffapVar = feyxVar.x;
        this.z = ffapVar == null ? new ffap() : ffapVar;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = fexn.a;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((fexu) it.next()).c) {
                    SSLSocketFactory sSLSocketFactory = feyxVar.n;
                    if (sSLSocketFactory == null) {
                        ffdi ffdiVar = ffdi.b;
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                trustManager.getClass();
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.q = x509TrustManager;
                                ffdi ffdiVar2 = ffdi.b;
                                x509TrustManager.getClass();
                                this.p = ffdiVar2.k(x509TrustManager);
                                x509TrustManager.getClass();
                                ffea ffeaVarC = ffdi.b.c(x509TrustManager);
                                this.v = ffeaVarC;
                                fexn fexnVar = feyxVar.s;
                                ffeaVarC.getClass();
                                this.u = fexnVar.a(ffeaVarC);
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        throw new IllegalStateException("Unexpected default trust managers: ".concat(string));
                    }
                    this.p = sSLSocketFactory;
                    ffea ffeaVar = feyxVar.t;
                    ffeaVar.getClass();
                    this.v = ffeaVar;
                    X509TrustManager x509TrustManager2 = feyxVar.o;
                    x509TrustManager2.getClass();
                    this.q = x509TrustManager2;
                    fexn fexnVar2 = feyxVar.s;
                    ffeaVar.getClass();
                    this.u = fexnVar2.a(ffeaVar);
                }
            }
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = fexn.a;
        }
        if (this.e.contains(null)) {
            List list2 = this.e;
            Objects.toString(list2);
            throw new IllegalStateException("Null interceptor: ".concat(list2.toString()));
        }
        if (this.f.contains(null)) {
            List list3 = this.f;
            Objects.toString(list3);
            throw new IllegalStateException("Null network interceptor: ".concat(list3.toString()));
        }
        List list4 = this.r;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((fexu) it2.next()).c) {
                    if (this.p == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.v == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.q == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.p != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.v != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!fdbq.f(this.u, fexn.a)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
