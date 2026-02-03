package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbzz implements fcas {
    public final Executor a;
    private final fcas b;

    public fbzz(fcas fcasVar, Executor executor) {
        this.b = fcasVar;
        executor.getClass();
        this.a = executor;
    }

    @Override // defpackage.fcas
    public final fcbc a(SocketAddress socketAddress, fcar fcarVar, fbnf fbnfVar) {
        return new fbzy(this, this.b.a(socketAddress, fcarVar, fbnfVar), fcarVar.a);
    }

    @Override // defpackage.fcas
    public final Collection b() {
        return this.b.b();
    }

    @Override // defpackage.fcas
    public final ScheduledExecutorService c() {
        return this.b.c();
    }

    @Override // defpackage.fcas, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
