package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlu extends ThreadPoolExecutor implements AutoCloseable, drly {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper");
    private static final AtomicInteger d = new AtomicInteger(0);
    final drls b;
    public final drlk c;

    public drlu(drlk drlkVar, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 2L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.c = drlkVar;
        this.b = new drls();
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

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(new drlt(this, runnable, d.getAndIncrement()));
    }
}
