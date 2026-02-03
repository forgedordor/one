package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezl {
    public final fexe a;
    public final Proxy b;
    public final InetSocketAddress c;

    public fezl(fexe fexeVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = fexeVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.c != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fezl)) {
            return false;
        }
        fezl fezlVar = (fezl) obj;
        return fdbq.f(fezlVar.a, this.a) && fdbq.f(fezlVar.b, this.b) && fdbq.f(fezlVar.c, this.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
