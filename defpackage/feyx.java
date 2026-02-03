package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyx {
    public feya a;
    public final fexs b;
    public final List c;
    public final List d;
    public boolean e;
    public final fexg f;
    public boolean g;
    public final fexz h;
    public final feyc i;
    public Proxy j;
    public ProxySelector k;
    public final fexg l;
    public final SocketFactory m;
    public SSLSocketFactory n;
    public X509TrustManager o;
    public final List p;
    public final List q;
    public HostnameVerifier r;
    public final fexn s;
    public ffea t;
    public int u;
    public int v;
    public int w;
    public ffap x;
    public final fezp y;

    public feyx() {
        this.a = new feya();
        this.b = new fexs();
        this.c = new ArrayList();
        this.d = new ArrayList();
        feye feyeVar = feye.a;
        byte[] bArr = fezr.a;
        this.y = new fezp(feyeVar);
        this.e = true;
        fexg fexgVar = fexg.a;
        this.f = fexgVar;
        this.g = true;
        this.h = fexz.a;
        this.i = feyc.a;
        this.l = fexgVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.m = socketFactory;
        this.p = feyy.b;
        this.q = feyy.a;
        this.r = ffeb.a;
        this.s = fexn.a;
        this.u = 10000;
        this.v = 10000;
        this.w = 10000;
    }

    public final void a(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.u = fezr.B(j, timeUnit);
    }

    public final void b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.v = fezr.B(j, timeUnit);
    }

    public feyx(feyy feyyVar) {
        this();
        this.a = feyyVar.c;
        this.b = feyyVar.d;
        fcva.y(this.c, feyyVar.e);
        fcva.y(this.d, feyyVar.f);
        this.y = feyyVar.A;
        this.e = feyyVar.g;
        this.f = feyyVar.h;
        this.g = feyyVar.i;
        this.h = feyyVar.j;
        this.i = feyyVar.k;
        this.j = feyyVar.l;
        this.k = feyyVar.m;
        this.l = feyyVar.n;
        this.m = feyyVar.o;
        this.n = feyyVar.p;
        this.o = feyyVar.q;
        this.p = feyyVar.r;
        this.q = feyyVar.s;
        this.r = feyyVar.t;
        this.s = feyyVar.u;
        this.t = feyyVar.v;
        this.u = feyyVar.w;
        this.v = feyyVar.x;
        this.w = feyyVar.y;
        this.x = feyyVar.z;
    }
}
