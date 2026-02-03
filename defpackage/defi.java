package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defi implements Runnable {
    final /* synthetic */ defn a;
    final /* synthetic */ defj b;

    public defi(defj defjVar, defn defnVar) {
        this.a = defnVar;
        this.b = defjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            defn defnVarA = this.b.a.a(this.a.i());
            defj defjVar = this.b;
            Executor executor = defu.b;
            defnVarA.q(executor, defjVar);
            defnVarA.p(executor, defjVar);
            defnVarA.n(executor, defjVar);
        } catch (defl e) {
            if (e.getCause() instanceof Exception) {
                this.b.d((Exception) e.getCause());
            } else {
                this.b.d(e);
            }
        } catch (CancellationException unused) {
            this.b.a();
        } catch (Exception e2) {
            this.b.d(e2);
        }
    }
}
