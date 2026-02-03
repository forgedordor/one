package defpackage;

import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqlb extends eoon implements AutoCloseable, eosd {
    public static final /* synthetic */ int d = 0;
    public final diep a;
    public final Handler b;
    public final eygg c;

    public dqlb(diep diepVar, Handler handler, ejwi ejwiVar) {
        this.a = diepVar;
        this.b = handler;
        this.c = (eygg) ejwiVar.e(new eygg() { // from class: dqkw
            @Override // defpackage.eygg
            public final Object b() {
                int i = dqlb.d;
                return false;
            }
        });
    }

    public static int h(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final eosb i(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        dqkz dqkzVar = new dqkz(this, runnable, this.a.a() + millis, timeUnit.toMillis(j2), z);
        this.b.postDelayed(dqkzVar, millis);
        j(dqkzVar, dqkzVar);
        return dqkzVar;
    }

    private final void j(ListenableFuture listenableFuture, final Runnable runnable) {
        listenableFuture.b(new Runnable() { // from class: dqkx
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.removeCallbacks(runnable);
            }
        }, eoqg.a);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eoon, defpackage.eosc
    /* renamed from: b */
    public final ListenableFuture submit(final Callable callable) {
        if (((Boolean) this.c.b()).booleanValue()) {
            return super.submit(callable);
        }
        Handler handler = this.b;
        final SettableFuture settableFutureCreate = SettableFuture.create();
        handler.post(new Runnable() { // from class: dqky
            @Override // java.lang.Runnable
            public final void run() {
                int i = dqlb.d;
                SettableFuture settableFuture = settableFutureCreate;
                try {
                    settableFuture.set(callable.call());
                } catch (Exception e) {
                    settableFuture.setException(e);
                    throw new RuntimeException(e);
                }
            }
        });
        return settableFutureCreate;
    }

    @Override // defpackage.eoon, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool()) {
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
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final eosb schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        dqla dqlaVar = new dqla(this, callable, this.a.a() + millis);
        this.b.postDelayed(dqlaVar, millis);
        j(dqlaVar, dqlaVar);
        return dqlaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final eosb scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final eosb scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eoon, java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Callable callable) {
        return submit(callable);
    }
}
