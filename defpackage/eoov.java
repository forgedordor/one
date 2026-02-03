package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoov extends eoou {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(eoox.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(eoox.class, "remainingField");

    @Override // defpackage.eoou
    public final int a(eoox eooxVar) {
        return b.decrementAndGet(eooxVar);
    }

    @Override // defpackage.eoou
    public final void b(eoox eooxVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(eooxVar, null, set) && atomicReferenceFieldUpdater.get(eooxVar) == null) {
        }
    }
}
