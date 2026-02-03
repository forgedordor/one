package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbtk implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public fbtk(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final fbtj a(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        fbti fbtiVar = new fbti(runnable);
        return new fbtj(fbtiVar, scheduledExecutorService.schedule(new fbth(this, fbtiVar, runnable), j, timeUnit));
    }

    public final void b() {
        do {
            AtomicReference atomicReference = this.c;
            Thread threadCurrentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.c.set(null);
                    throw th2;
                }
            }
            this.c.set(null);
        } while (!this.b.isEmpty());
    }

    public final void c(Runnable runnable) {
        runnable.getClass();
        this.b.add(runnable);
    }

    public final void d() {
        ejwl.m(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable);
        b();
    }
}
