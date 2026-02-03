package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deet implements Runnable {
    final /* synthetic */ defn a;
    final /* synthetic */ deeu b;

    public deet(deeu deeuVar, defn defnVar) {
        this.a = defnVar;
        this.b = deeuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            defn defnVar = (defn) this.b.a.a(this.a);
            if (defnVar == null) {
                this.b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            deeu deeuVar = this.b;
            Executor executor = defu.b;
            defnVar.q(executor, deeuVar);
            defnVar.p(executor, deeuVar);
            defnVar.n(executor, deeuVar);
        } catch (defl e) {
            if (!(e.getCause() instanceof Exception)) {
                this.b.b.u(e);
                return;
            }
            deeu deeuVar2 = this.b;
            deeuVar2.b.u((Exception) e.getCause());
        } catch (Exception e2) {
            this.b.b.u(e2);
        }
    }
}
