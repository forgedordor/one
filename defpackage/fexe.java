package defpackage;

import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexe {
    public final feyc a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final fexn e;
    public final fexg f;
    public final Proxy g;
    public final ProxySelector h;
    public final feyq i;
    public final List j;
    public final List k;

    public fexe(String str, int i, feyc feycVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, fexn fexnVar, fexg fexgVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = feycVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = fexnVar;
        this.f = fexgVar;
        this.g = proxy;
        this.h = proxySelector;
        feyo feyoVar = new feyo();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (fdgn.j(str2, "http", true)) {
            feyoVar.a = "http";
        } else {
            if (!fdgn.j(str2, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            feyoVar.a = "https";
        }
        char[] cArr = feyq.a;
        String strA = fezo.a(feyp.c(str, 0, 0, false, 7));
        if (strA == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        feyoVar.d = strA;
        if (i <= 0) {
            throw new IllegalArgumentException(a.g(i, "unexpected port: "));
        }
        feyoVar.e = i;
        this.i = feyoVar.a();
        this.j = fezr.p(list);
        this.k = fezr.p(list2);
    }

    public final boolean a(fexe fexeVar) {
        fexeVar.getClass();
        if (fdbq.f(this.a, fexeVar.a) && fdbq.f(this.f, fexeVar.f) && fdbq.f(this.j, fexeVar.j) && fdbq.f(this.k, fexeVar.k) && fdbq.f(this.h, fexeVar.h) && fdbq.f(this.g, fexeVar.g) && fdbq.f(this.c, fexeVar.c) && fdbq.f(this.d, fexeVar.d) && fdbq.f(this.e, fexeVar.e)) {
            return this.i.d == fexeVar.i.d;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fexe)) {
            return false;
        }
        fexe fexeVar = (fexe) obj;
        return fdbq.f(this.i, fexeVar.i) && a(fexeVar);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.i.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.h.hashCode()) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        String string;
        String str;
        Proxy proxy = this.g;
        if (proxy != null) {
            java.util.Objects.toString(proxy);
            string = proxy.toString();
            str = "proxy=";
        } else {
            ProxySelector proxySelector = this.h;
            java.util.Objects.toString(proxySelector);
            string = proxySelector.toString();
            str = "proxySelector=";
        }
        String strConcat = str.concat(string);
        feyq feyqVar = this.i;
        return "Address{" + feyqVar.c + ":" + feyqVar.d + ", " + strConcat + "}";
    }
}
