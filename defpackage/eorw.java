package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eorw extends AbstractOwnableSynchronizer implements Runnable {
    private final eory a;

    public eorw(eory eoryVar) {
        this.a = eoryVar;
    }

    public final void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
