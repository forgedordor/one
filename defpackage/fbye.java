package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbye extends fbow {
    final SocketAddress a;
    public fchy b = new fcml(fcdy.p);
    private final fcly c;

    public fbye(SocketAddress socketAddress) {
        this.a = socketAddress;
        fcly fclyVar = new fcly(new fbyd(this));
        this.c = fclyVar;
        fclyVar.p = false;
        fclyVar.q = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ejwl.e(true, "handshake timeout is %s, but must be positive", Long.MAX_VALUE);
        timeUnit.getClass();
        fclyVar.m = timeUnit.toMillis(Long.MAX_VALUE);
    }

    @Override // defpackage.fbow
    public final fbsk b() {
        return this.c;
    }
}
