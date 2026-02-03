package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eosi extends eosf implements AutoCloseable, eosd {
    final ScheduledExecutorService a;

    public eosi(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.eoon, java.lang.AutoCloseable
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
        ScheduledExecutorService scheduledExecutorService = this.a;
        eotc eotcVarD = eotc.d(runnable, null);
        return new eosg(eotcVarD, scheduledExecutorService.schedule(eotcVarD, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final eosb schedule(Callable callable, long j, TimeUnit timeUnit) {
        eotc eotcVar = new eotc(callable);
        return new eosg(eotcVar, this.a.schedule(eotcVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final eosb scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        eosh eoshVar = new eosh(runnable);
        return new eosg(eoshVar, this.a.scheduleAtFixedRate(eoshVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final eosb scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        eosh eoshVar = new eosh(runnable);
        return new eosg(eoshVar, this.a.scheduleWithFixedDelay(eoshVar, j, j2, timeUnit));
    }
}
