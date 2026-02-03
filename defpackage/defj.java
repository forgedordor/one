package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defj implements defo, defh, defe, deey {
    public final defm a;
    private final Executor b;
    private final defv c;

    public defj(Executor executor, defm defmVar, defv defvVar) {
        this.b = executor;
        this.a = defmVar;
        this.c = defvVar;
    }

    @Override // defpackage.deey
    public final void a() {
        this.c.x();
    }

    @Override // defpackage.defo
    public final void c(defn defnVar) {
        this.b.execute(new defi(this, defnVar));
    }

    @Override // defpackage.defe
    public final void d(Exception exc) {
        this.c.u(exc);
    }

    @Override // defpackage.defh
    public final void e(Object obj) {
        this.c.v(obj);
    }
}
