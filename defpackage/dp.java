package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dp extends adj {
    final /* synthetic */ AtomicReference a;

    public dp(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.adj
    public final void a(Object obj, kun kunVar) {
        adj adjVar = (adj) this.a.get();
        if (adjVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        adjVar.a(obj, kunVar);
    }

    @Override // defpackage.adj
    public final void b() {
        adj adjVar = (adj) this.a.getAndSet(null);
        if (adjVar != null) {
            adjVar.b();
        }
    }
}
