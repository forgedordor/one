package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzqz implements eora {
    final /* synthetic */ dzra a;

    public dzqz(dzra dzraVar) {
        this.a = dzraVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dzra dzraVar = this.a;
        AtomicReference atomicReference = dzraVar.g;
        dzqh dzqhVar = (dzqh) obj;
        synchronized (atomicReference) {
            atomicReference.set(dzqhVar);
            dzraVar.k = null;
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(th)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl$1", "onFailure", (char) 219, "MemoryMetricServiceImpl.java")).q("Memory snapshot failed");
        dzra dzraVar = this.a;
        AtomicReference atomicReference = dzraVar.g;
        synchronized (atomicReference) {
            atomicReference.set(dzqh.a);
            dzraVar.k = null;
        }
    }
}
