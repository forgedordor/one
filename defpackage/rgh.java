package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgh {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile rgf d;

    public rgh() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new rgd());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new rge(this));
    }

    public final synchronized rhq a(res resVar) {
        rgg rggVar = (rgg) this.a.get(resVar);
        if (rggVar == null) {
            return null;
        }
        rhq rhqVar = (rhq) rggVar.get();
        if (rhqVar == null) {
            c(rggVar);
        }
        return rhqVar;
    }

    public final synchronized void b(res resVar, rhq rhqVar) {
        rgg rggVar = (rgg) this.a.put(resVar, new rgg(resVar, rhqVar, this.b));
        if (rggVar != null) {
            rggVar.a();
        }
    }

    final void c(rgg rggVar) {
        synchronized (this) {
            this.a.remove(rggVar.a);
            if (rggVar.b) {
                rhy rhyVar = rggVar.c;
            }
        }
    }

    final synchronized void d(res resVar) {
        rgg rggVar = (rgg) this.a.remove(resVar);
        if (rggVar != null) {
            rggVar.a();
        }
    }
}
