package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdij extends fdic {
    public final fdkw b;
    private final Thread e;

    public fdij(fcyh fcyhVar, Thread thread, fdkw fdkwVar) {
        super(fcyhVar, true);
        this.e = thread;
        this.b = fdkwVar;
    }

    @Override // defpackage.fdme
    protected final void hC(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (fdbq.f(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // defpackage.fdme
    protected final boolean hD() {
        return true;
    }
}
