package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpd extends fbsg {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public fbpd(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        ejwl.p(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbpd)) {
            return false;
        }
        fbpd fbpdVar = (fbpd) obj;
        return ejwh.a(this.a, fbpdVar.a) && ejwh.a(this.b, fbpdVar.b) && ejwh.a(this.c, fbpdVar.c) && ejwh.a(this.d, fbpdVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("proxyAddr", this.a);
        ejwfVarB.b("targetAddr", this.b);
        ejwfVarB.b("username", this.c);
        ejwfVarB.h("hasPassword", this.d != null);
        return ejwfVarB.toString();
    }
}
