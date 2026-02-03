package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fchb extends fbrv {
    final SocketAddress a;
    final String b;
    final Collection c;

    public fchb(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.fbrp
    public final fbru a(URI uri, fbrn fbrnVar) {
        return new fcha(this);
    }

    @Override // defpackage.fbrp
    public final String b() {
        return "directaddress";
    }

    @Override // defpackage.fbrv
    public final Collection c() {
        return this.c;
    }

    @Override // defpackage.fbrv
    protected final void d() {
    }

    @Override // defpackage.fbrv
    protected final void e() {
    }
}
