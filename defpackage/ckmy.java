package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmy {
    public ckmy(cqnr cqnrVar) {
        Level level = cqnq.a;
        final cqnt cqntVar = (cqnt) cqnrVar.a.b();
        cqntVar.getClass();
        new AtomicLong(0L);
        new AtomicBoolean(false);
        new AtomicReference(cqnq.a);
        if (cqntVar.b.compareAndSet(false, true)) {
            eijx.g(new Callable() { // from class: cqns
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cqnt cqntVar2 = cqntVar;
                    cqntVar2.d.a();
                    cqntVar2.c.incrementAndGet();
                    return null;
                }
            }, cqntVar.a).k(auvh.b(), eoqg.a);
        }
    }
}
