package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deex implements defo {
    public final Object a = new Object();
    public final deey b;
    private final Executor c;

    public deex(Executor executor, deey deeyVar) {
        this.c = executor;
        this.b = deeyVar;
    }

    @Override // defpackage.defo
    public final void c(defn defnVar) {
        if (((defv) defnVar).d) {
            synchronized (this.a) {
            }
            this.c.execute(new deew(this));
        }
    }
}
