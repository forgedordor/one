package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcll implements fcmb {
    public final fbnz a;
    private final Executor b;
    private final Executor c;
    private final fcma d;
    private fcmb e;

    public fcll(Executor executor, Executor executor2, fcma fcmaVar, fbnz fbnzVar) {
        this.b = executor;
        this.c = executor2;
        this.d = fcmaVar;
        this.a = fbnzVar;
    }

    @Override // defpackage.fcmb
    public final void a(Status status) {
        int i = fcsr.a;
        if (!status.f()) {
            Throwable fbpsVar = status.t;
            if (fbpsVar == null) {
                Status statusWithDescription = Status.c.withDescription("RPC cancelled");
                fbrb fbrbVar = fbpr.a;
                fbpsVar = new fbps(statusWithDescription);
            }
            this.c.execute(new fclg(this.a, fbpsVar));
        }
        this.b.execute(new fclh(this, status));
    }

    @Override // defpackage.fcmb
    public final void b() {
        int i = fcsr.a;
        this.b.execute(new fcli(this));
    }

    public final fcmb c() {
        fcmb fcmbVar = this.e;
        if (fcmbVar != null) {
            return fcmbVar;
        }
        throw new IllegalStateException("listener unset");
    }

    @Override // defpackage.fcmp
    public final void d(fcmo fcmoVar) {
        int i = fcsr.a;
        this.b.execute(new fclj(this, fcmoVar));
    }

    @Override // defpackage.fcmp
    public final void e() {
        int i = fcsr.a;
        this.b.execute(new fclk(this));
    }

    public final void f(Throwable th) {
        this.d.e(Status.d.withDescription("Application error processing RPC").d(th), new fbrg());
    }

    final void g(fcmb fcmbVar) {
        fcmbVar.getClass();
        ejwl.m(this.e == null, "Listener already set");
        this.e = fcmbVar;
    }
}
