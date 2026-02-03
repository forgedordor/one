package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defa implements defo {
    public final Object a = new Object();
    public final defb b;
    private final Executor c;

    public defa(Executor executor, defb defbVar) {
        this.c = executor;
        this.b = defbVar;
    }

    @Override // defpackage.defo
    public final void c(defn defnVar) {
        synchronized (this.a) {
        }
        this.c.execute(new deez(this, defnVar));
    }
}
