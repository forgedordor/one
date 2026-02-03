package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dewj extends ThreadPoolExecutor implements AutoCloseable {
    private final ConcurrentHashMap a;

    public dewj(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(1, 3, 1L, timeUnit, blockingQueue);
        this.a = new ConcurrentHashMap();
    }

    final void a(dewf dewfVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        String strB = dewfVar.b();
        if (concurrentHashMap.putIfAbsent(strB, dewfVar) != null) {
            dhja.l(dewk.a, "Business info retrieval is already active for key %s", dhiz.GENERIC.c(strB));
        } else {
            dhja.l(dewk.a, "Executing business info retrieval for key %s", dhiz.GENERIC.c(strB));
            execute(dewfVar);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (runnable instanceof dewf) {
            this.a.remove(((dewf) runnable).b());
        }
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
}
