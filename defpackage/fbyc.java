package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbyc implements fcek {
    public static final ConcurrentMap a = new ConcurrentHashMap();
    public final List b;
    public final fchy c;
    private final SocketAddress d;
    private fclz e;
    private boolean f;
    private ScheduledExecutorService g;

    public fbyc(fbye fbyeVar, List list) {
        this.d = fbyeVar.a;
        this.c = fbyeVar.b;
        list.getClass();
        this.b = DesugarCollections.unmodifiableList(list);
    }

    final synchronized fcmd a(fbzb fbzbVar) {
        if (this.f) {
            return null;
        }
        return this.e.a(fbzbVar);
    }

    @Override // defpackage.fcek
    public final List b() {
        return Collections.singletonList(this.d);
    }

    @Override // defpackage.fcek
    public final void d() {
        ((fbxy) this.d).b(this);
        this.c.b(this.g);
        this.g = null;
        synchronized (this) {
            this.f = true;
            this.e.c();
        }
    }

    @Override // defpackage.fcek
    public final void e(fclz fclzVar) {
        this.e = fclzVar;
        this.g = (ScheduledExecutorService) this.c.a();
        ((fbxy) this.d).c(this);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("listenAddress", this.d);
        return ejwfVarB.toString();
    }
}
