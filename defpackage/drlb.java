package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlb extends eoqz implements AutoCloseable, eosd {
    public static final /* synthetic */ int b = 0;
    public final eosd a;
    private final eosc c;

    public drlb(eosc eoscVar, eosd eosdVar) {
        this.c = eoscVar;
        this.a = eosdVar;
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
        final eosa eosaVar = new eosa(runnable);
        return new drla(eosaVar, this.a.schedule(new Runnable() { // from class: drku
            @Override // java.lang.Runnable
            public final void run() {
                this.a.execute(eosaVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final eosb schedule(Callable callable, long j, TimeUnit timeUnit) {
        final eosa eosaVar = new eosa(callable);
        return new drla(eosaVar, this.a.schedule(new Runnable() { // from class: drkv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.execute(eosaVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final eosb scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final Executor executorB = drle.b(this);
        final SettableFuture settableFutureCreate = SettableFuture.create();
        return new drla(settableFutureCreate, this.a.scheduleAtFixedRate(new Runnable() { // from class: drkw
            @Override // java.lang.Runnable
            public final void run() {
                int i = drlb.b;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = settableFutureCreate;
                executorB.execute(new Runnable() { // from class: drkt
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = drlb.b;
                        try {
                            runnable2.run();
                        } catch (Throwable th) {
                            settableFuture.setException(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final eosb scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        SettableFuture settableFutureCreate = SettableFuture.create();
        drla drlaVar = new drla(settableFutureCreate, null);
        drlaVar.a = this.a.schedule(new drky(this, runnable, settableFutureCreate, drlaVar, j2, timeUnit), j, timeUnit);
        return drlaVar;
    }

    @Override // defpackage.eoqz
    protected final eosc h() {
        return this.c;
    }

    @Override // defpackage.eoqu, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.c;
    }

    @Override // defpackage.eoqz, defpackage.eoqu
    protected final /* synthetic */ ExecutorService i() {
        return this.c;
    }
}
