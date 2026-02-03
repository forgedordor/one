package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deeu implements defo, defh, defe, deey {
    public final deeq a;
    public final defv b;
    private final Executor c;

    public deeu(Executor executor, deeq deeqVar, defv defvVar) {
        this.c = executor;
        this.a = deeqVar;
        this.b = defvVar;
    }

    @Override // defpackage.deey
    public final void a() {
        this.b.x();
    }

    @Override // defpackage.defo
    public final void c(defn defnVar) {
        this.c.execute(new deet(this, defnVar));
    }

    @Override // defpackage.defe
    public final void d(Exception exc) {
        this.b.u(exc);
    }

    @Override // defpackage.defh
    public final void e(Object obj) {
        this.b.v(obj);
    }
}
