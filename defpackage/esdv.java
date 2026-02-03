package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esdv implements ScheduledExecutorService, AutoCloseable {
    public static final /* synthetic */ int c = 0;
    public final ExecutorService a;
    public final ScheduledExecutorService b;

    public esdv(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.a = executorService;
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
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

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new esdy(new esdx() { // from class: esdn
            @Override // defpackage.esdx
            public final ScheduledFuture a(final esdw esdwVar) {
                final esdv esdvVar = this.a;
                final Runnable runnable2 = runnable;
                return esdvVar.b.schedule(new Runnable() { // from class: esdj
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Runnable runnable3 = runnable2;
                        final esdw esdwVar2 = esdwVar;
                        esdvVar.a.execute(new Runnable() { // from class: esds
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = esdv.c;
                                Runnable runnable4 = runnable3;
                                esdw esdwVar3 = esdwVar2;
                                try {
                                    runnable4.run();
                                    esdwVar3.a(null);
                                } catch (Exception e) {
                                    esdwVar3.b(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new esdy(new esdx() { // from class: esdq
            @Override // defpackage.esdx
            public final ScheduledFuture a(final esdw esdwVar) {
                final esdv esdvVar = this.a;
                final Runnable runnable2 = runnable;
                return esdvVar.b.scheduleAtFixedRate(new Runnable() { // from class: esdu
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Runnable runnable3 = runnable2;
                        final esdw esdwVar2 = esdwVar;
                        esdvVar.a.execute(new Runnable() { // from class: esdr
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                int i = esdv.c;
                                try {
                                    runnable3.run();
                                } catch (Exception e) {
                                    esdwVar2.b(e);
                                    throw e;
                                }
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new esdy(new esdx() { // from class: esdt
            @Override // defpackage.esdx
            public final ScheduledFuture a(final esdw esdwVar) {
                final esdv esdvVar = this.a;
                final Runnable runnable2 = runnable;
                return esdvVar.b.scheduleWithFixedDelay(new Runnable() { // from class: esdp
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Runnable runnable3 = runnable2;
                        final esdw esdwVar2 = esdwVar;
                        esdvVar.a.execute(new Runnable() { // from class: esdm
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = esdv.c;
                                try {
                                    runnable3.run();
                                } catch (Exception e) {
                                    esdwVar2.b(e);
                                }
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new esdy(new esdx() { // from class: esdk
            @Override // defpackage.esdx
            public final ScheduledFuture a(final esdw esdwVar) {
                final esdv esdvVar = this.a;
                final Callable callable2 = callable;
                return esdvVar.b.schedule(new Callable() { // from class: esdo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final Callable callable3 = callable2;
                        final esdw esdwVar2 = esdwVar;
                        return esdvVar.a.submit(new Runnable() { // from class: esdl
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = esdv.c;
                                Callable callable4 = callable3;
                                esdw esdwVar3 = esdwVar2;
                                try {
                                    esdwVar3.a(callable4.call());
                                } catch (Exception e) {
                                    esdwVar3.b(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }
}
