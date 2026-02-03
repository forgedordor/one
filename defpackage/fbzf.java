package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbzf extends fbzj implements fcan, fcht {
    public static final Logger q = Logger.getLogger(fbzf.class.getName());
    private final fcdp a;
    private fbrg b;
    private volatile boolean c;
    public final fcmu r;
    public final boolean s;

    protected fbzf(fcmw fcmwVar, fcmm fcmmVar, fcmu fcmuVar, fbrg fbrgVar, fbnc fbncVar) {
        fcmuVar.getClass();
        this.r = fcmuVar;
        this.s = fcdy.j(fbncVar);
        this.a = new fchu(this, fcmwVar, fcmmVar);
        this.b = fbrgVar;
    }

    @Override // defpackage.fcan
    public final void b(fceg fcegVar) {
        fcegVar.b("remote_addr", a().a(fbpb.a));
    }

    @Override // defpackage.fcan
    public final void c(Status status) {
        ejwl.b(!status.f(), "Should not cancel with OK status");
        this.c = true;
        p().a(status);
    }

    @Override // defpackage.fcan
    public final void e() {
        if (q().m) {
            return;
        }
        q().m = true;
        fchu fchuVar = (fchu) u();
        if (fchuVar.i) {
            return;
        }
        fchuVar.i = true;
        fcmv fcmvVar = fchuVar.b;
        if (fcmvVar != null && fcmvVar.a() == 0 && fchuVar.b != null) {
            fchuVar.b = null;
        }
        fchuVar.b(true, true);
    }

    @Override // defpackage.fcan
    public final void i(fbol fbolVar) {
        fbrg fbrgVar = this.b;
        fbrb fbrbVar = fcdy.b;
        fbrgVar.f(fbrbVar);
        this.b.h(fbrbVar, Long.valueOf(Math.max(0L, fbolVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.fcan
    public final void j(fboo fbooVar) {
        fbze fbzeVarQ = q();
        ejwl.m(fbzeVarQ.k == null, "Already called start");
        fbooVar.getClass();
        fbzeVarQ.l = fbooVar;
    }

    @Override // defpackage.fcan
    public final void k(int i) {
        ((fchq) q().o).b = i;
    }

    @Override // defpackage.fcan
    public final void l(int i) {
        fchu fchuVar = (fchu) this.a;
        ejwl.m(fchuVar.a == -1, "max size already set");
        fchuVar.a = i;
    }

    @Override // defpackage.fcan
    public final void m(fcap fcapVar) {
        fbze fbzeVarQ = q();
        ejwl.m(fbzeVarQ.k == null, "Already called setListener");
        fbzeVarQ.k = fcapVar;
        p().c(this.b);
        this.b = null;
    }

    @Override // defpackage.fbzj, defpackage.fcmn
    public final boolean o() {
        return r().n() && !this.c;
    }

    protected abstract fbzc p();

    protected abstract fbze q();

    @Override // defpackage.fbzj
    protected /* bridge */ /* synthetic */ fbzi r() {
        throw null;
    }

    @Override // defpackage.fbzj
    protected final fcdp u() {
        return this.a;
    }

    @Override // defpackage.fcht
    public final void v(fcmv fcmvVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (fcmvVar == null && !z) {
            z3 = false;
        }
        ejwl.b(z3, "null frame before EOS");
        p().b(fcmvVar, z, z2, i);
    }
}
