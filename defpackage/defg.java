package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defg implements defo {
    public final Object a = new Object();
    public final defh b;
    private final Executor c;

    public defg(Executor executor, defh defhVar) {
        this.c = executor;
        this.b = defhVar;
    }

    @Override // defpackage.defo
    public final void c(defn defnVar) {
        if (defnVar.m()) {
            synchronized (this.a) {
            }
            this.c.execute(new deff(this, defnVar));
        }
    }
}
