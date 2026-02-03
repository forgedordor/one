package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxk implements fcas {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final int c;
    private final fbxl d;
    private final fcmu e;
    private final boolean f;

    public fbxk(fbxl fbxlVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, fcmu fcmuVar) {
        boolean z = scheduledExecutorService == null;
        this.f = z;
        this.a = z ? (ScheduledExecutorService) fcmk.a(fcdy.p) : scheduledExecutorService;
        this.c = i;
        this.d = fbxlVar;
        executor.getClass();
        this.b = executor;
        this.e = fcmuVar;
    }

    @Override // defpackage.fcas
    public final fcbc a(SocketAddress socketAddress, fcar fcarVar, fbnf fbnfVar) {
        String str = fcarVar.a;
        String str2 = fcarVar.c;
        fbmw fbmwVar = fcarVar.b;
        Executor executor = this.b;
        int i = this.c;
        return new fbxv(this.d, (InetSocketAddress) socketAddress, str, str2, fbmwVar, executor, i, this.e);
    }

    @Override // defpackage.fcas
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.fcas
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override // defpackage.fcas, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            fcmk.d(fcdy.p, this.a);
        }
    }
}
