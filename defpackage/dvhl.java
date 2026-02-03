package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvhl extends ThreadPoolExecutor implements AutoCloseable {
    private static final long c = TimeUnit.MINUTES.toMillis(3);
    public final Set a;
    public final String b;
    private final AtomicInteger d;
    private final ScheduledExecutorService e;

    public dvhl(ScheduledExecutorService scheduledExecutorService, String str, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 1L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
        this.d = new AtomicInteger(0);
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.e = scheduledExecutorService;
        this.b = str;
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
    public final void execute(final Runnable runnable) {
        final int iIncrementAndGet = this.d.incrementAndGet();
        final Throwable th = new Throwable();
        final ScheduledFuture<?> scheduledFutureSchedule = this.e.schedule(new Runnable() { // from class: dvhj
            @Override // java.lang.Runnable
            public final void run() {
                dvhl dvhlVar = this.a;
                if (dvhlVar.a.contains(Integer.valueOf(iIncrementAndGet))) {
                    dvhv.g(dvhlVar.b, "Task executed for too long: ", th);
                }
            }
        }, c, TimeUnit.MILLISECONDS);
        this.a.add(Integer.valueOf(iIncrementAndGet));
        super.execute(new Runnable() { // from class: dvhk
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
                this.a.a.remove(Integer.valueOf(iIncrementAndGet));
                scheduledFutureSchedule.cancel(false);
            }
        });
    }
}
