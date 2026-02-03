package defpackage;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbya implements fcas {
    private final ScheduledExecutorService a;
    private final boolean b;
    private boolean c;
    private final boolean d;

    public fbya(ScheduledExecutorService scheduledExecutorService, boolean z) {
        boolean z2 = scheduledExecutorService == null;
        this.b = z2;
        this.a = z2 ? (ScheduledExecutorService) fcmk.a(fcdy.p) : scheduledExecutorService;
        this.d = z;
    }

    @Override // defpackage.fcas
    public final fcbc a(SocketAddress socketAddress, fcar fcarVar, fbnf fbnfVar) {
        if (this.c) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new fbzb(socketAddress, fcarVar.a, fcarVar.c, fcarVar.b, this.d);
    }

    @Override // defpackage.fcas
    public final Collection b() {
        return Arrays.asList(fbyf.class, fbxy.class);
    }

    @Override // defpackage.fcas
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override // defpackage.fcas, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b) {
            fcmk.d(fcdy.p, this.a);
        }
    }
}
