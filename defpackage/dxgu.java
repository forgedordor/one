package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxgu extends eoqz implements AutoCloseable, eosd {
    public static final /* synthetic */ int b = 0;
    public final eosd a;
    private final eosc c;

    public dxgu(eosc eoscVar, eosd eosdVar) {
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
        return j <= 0 ? new dxgt(this.c.submit(runnable), System.nanoTime()) : new dxgs(eosaVar, this.a.schedule(new Runnable() { // from class: dxgl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.execute(eosaVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final eosb schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new dxgt(this.c.submit(callable), System.nanoTime());
        }
        final eosa eosaVar = new eosa(callable);
        return new dxgs(eosaVar, this.a.schedule(new Runnable() { // from class: dxgo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.execute(eosaVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final eosb scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final eoss eossVar = new eoss(this);
        final SettableFuture settableFutureCreate = SettableFuture.create();
        return new dxgs(settableFutureCreate, this.a.scheduleAtFixedRate(new Runnable() { // from class: dxgm
            @Override // java.lang.Runnable
            public final void run() {
                int i = dxgu.b;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = settableFutureCreate;
                eossVar.execute(new Runnable() { // from class: dxgn
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = dxgu.b;
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
        dxgs dxgsVar = new dxgs(settableFutureCreate, null);
        dxgsVar.a = this.a.schedule(new dxgq(this, runnable, settableFutureCreate, dxgsVar, j2, timeUnit), j, timeUnit);
        return dxgsVar;
    }

    @Override // defpackage.eoqz
    public final eosc h() {
        return this.c;
    }

    @Override // defpackage.eoqu, defpackage.eker
    public final /* synthetic */ Object hp() {
        return this.c;
    }

    @Override // defpackage.eoqz, defpackage.eoqu
    public final /* synthetic */ ExecutorService i() {
        return this.c;
    }
}
