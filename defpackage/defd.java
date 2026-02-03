package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defd implements defo {
    public final Object a = new Object();
    public final defe b;
    private final Executor c;

    public defd(Executor executor, defe defeVar) {
        this.c = executor;
        this.b = defeVar;
    }

    @Override // defpackage.defo
    public final void c(defn defnVar) {
        if (defnVar.m() || ((defv) defnVar).d) {
            return;
        }
        synchronized (this.a) {
        }
        this.c.execute(new defc(this, defnVar));
    }
}
