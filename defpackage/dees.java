package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dees implements defo {
    public final deeq a;
    public final defv b;
    private final Executor c;

    public dees(Executor executor, deeq deeqVar, defv defvVar) {
        this.c = executor;
        this.a = deeqVar;
        this.b = defvVar;
    }

    @Override // defpackage.defo
    public final void c(defn defnVar) {
        this.c.execute(new deer(this, defnVar));
    }
}
