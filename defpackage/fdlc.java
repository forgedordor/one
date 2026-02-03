package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdlc extends fdkw {
    protected abstract Thread g();

    protected void k(long j, fdkz fdkzVar) {
        fdkd.a.w(j, fdkzVar);
    }

    protected final void z() {
        Thread threadG = g();
        if (Thread.currentThread() != threadG) {
            LockSupport.unpark(threadG);
        }
    }
}
