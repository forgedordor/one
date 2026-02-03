package defpackage;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drli extends ScheduledThreadPoolExecutor implements AutoCloseable {
    private final AtomicLong a;
    private final drln b;

    public drli(drln drlnVar, drlg drlgVar) {
        super(1, drlgVar);
        this.a = new AtomicLong(0L);
        this.b = drlnVar;
        setKeepAliveTime(2L, TimeUnit.MINUTES);
        allowCoreThreadTimeOut(false);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    protected final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return new drlw(runnable, this.b.a(runnable), runnableScheduledFuture.getDelay(TimeUnit.NANOSECONDS), this.a.getAndIncrement());
    }
}
