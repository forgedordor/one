package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdkd extends fdlb implements Runnable {
    private static volatile Thread _thread;
    public static final fdkd a;
    private static volatile int debugStatus;
    private static final long e;

    static {
        Long l;
        fdkd fdkdVar = new fdkd();
        a = fdkdVar;
        fdkdVar.p(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        e = timeUnit.toNanos(l.longValue());
    }

    private fdkd() {
    }

    private final synchronized Thread A() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setContextClassLoader(a.getClass().getClassLoader());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void B() {
        if (D()) {
            debugStatus = 3;
            ((fdlb) this).c.c(null);
            this.d.c(null);
            notifyAll();
        }
    }

    private final synchronized boolean C() {
        if (D()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean D() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private static final void E() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.fdlb, defpackage.fdkh
    public final fdks c(long j, Runnable runnable, fcyh fcyhVar) {
        return v(j, runnable);
    }

    @Override // defpackage.fdlc
    protected final Thread g() {
        Thread thread = _thread;
        return thread == null ? A() : thread;
    }

    @Override // defpackage.fdlb
    public final void j(Runnable runnable) {
        if (debugStatus == 4) {
            E();
        }
        super.j(runnable);
    }

    @Override // defpackage.fdlc
    protected final void k(long j, fdkz fdkzVar) {
        E();
    }

    @Override // defpackage.fdlb, defpackage.fdkw
    public final void l() {
        debugStatus = 4;
        super.l();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = fdmw.a;
        fdmw.a.set(this);
        try {
            if (C()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM = m();
                    if (jM == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = e + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            break;
                        } else {
                            jM = fddu.k(Long.MAX_VALUE, j2);
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM > 0) {
                        if (D()) {
                            break;
                        } else {
                            LockSupport.parkNanos(this, jM);
                        }
                    }
                }
            }
            _thread = null;
            B();
            if (y()) {
                return;
            }
            g();
        } catch (Throwable th) {
            _thread = null;
            B();
            if (!y()) {
                g();
            }
            throw th;
        }
    }

    @Override // defpackage.fdjq
    public final String toString() {
        return "DefaultExecutor";
    }
}
