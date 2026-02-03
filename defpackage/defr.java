package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defr<TResult> {
    public final defv a = new defv();

    public defr() {
    }

    public final void a(Exception exc) {
        this.a.u(exc);
    }

    public final void b(Object obj) {
        this.a.v(obj);
    }

    public final boolean c(Exception exc) {
        dclh.n(exc, "Exception must not be null");
        defv defvVar = this.a;
        synchronized (defvVar.a) {
            if (defvVar.c) {
                return false;
            }
            defvVar.c = true;
            defvVar.e = exc;
            defvVar.b.b(defvVar);
            return true;
        }
    }

    public final boolean d(Object obj) {
        return this.a.w(obj);
    }

    public defr(deem deemVar) {
        deemVar.a(new defq(this));
    }
}
