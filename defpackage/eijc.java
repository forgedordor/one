package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eijc implements eija {
    final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(eije.class, eijb.class, "currentMetadata");

    @Override // defpackage.eija
    public final eijb a(eije eijeVar) {
        return (eijb) this.a.get(eijeVar);
    }

    @Override // defpackage.eija
    public final boolean b(eije eijeVar, eijb eijbVar, eijb eijbVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (atomicReferenceFieldUpdater.compareAndSet(eijeVar, eijbVar, eijbVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(eijeVar) == eijbVar);
        return false;
    }
}
