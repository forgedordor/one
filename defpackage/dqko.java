package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqko extends eoqz implements AutoCloseable, eosd {
    protected dqko() {
    }

    @Override // defpackage.eoqz, defpackage.eoqu, java.lang.AutoCloseable
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

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final eosb schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return j().schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final eosb schedule(Callable callable, long j, TimeUnit timeUnit) {
        return j().schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final eosb scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return j().scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final eosb scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return j().scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.eoqz
    protected /* bridge */ /* synthetic */ eosc h() {
        throw null;
    }

    protected abstract eosd j();
}
