package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcla extends fckz {
    private final AtomicIntegerFieldUpdater a;

    public fcla(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.fckz
    public final boolean a(fclc fclcVar) {
        return this.a.compareAndSet(fclcVar, 0, -1);
    }

    @Override // defpackage.fckz
    public final void b(fclc fclcVar) {
        this.a.set(fclcVar, 0);
    }
}
