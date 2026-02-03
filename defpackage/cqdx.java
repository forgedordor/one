package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqdx implements AutoCloseable, eosc {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("awaitTermination unimplemented, cannot shutdown UI thread");
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final ListenableFuture submit(final Callable callable) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        cqdq.f(new Runnable() { // from class: cqdu
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = settableFutureCreate;
                try {
                    settableFuture.set(callable.call());
                } catch (Throwable th) {
                    settableFuture.setException(th);
                }
            }
        });
        return settableFutureCreate;
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final ListenableFuture submit(final Runnable runnable, final Object obj) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        cqdq.f(new Runnable() { // from class: cqdt
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture = settableFutureCreate;
                Runnable runnable2 = runnable;
                Object obj2 = obj;
                try {
                    runnable2.run();
                    settableFuture.set(obj2);
                } catch (Throwable th) {
                    settableFuture.setException(th);
                }
            }
        });
        return settableFutureCreate;
    }

    @Override // java.lang.AutoCloseable
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

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        cqdq.f(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    /* renamed from: gc */
    public final ListenableFuture submit(Runnable runnable) {
        return submit(runnable, new Object());
    }

    @Override // defpackage.eosc, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return (List) Collection.EL.stream(collection).map(new Function() { // from class: cqdv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.submit((Callable) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cqdw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(java.util.Collection collection) {
        throw new UnsupportedOperationException("invokeAny unimplemented, cannot cancel runnables on the UI thread");
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
        throw new UnsupportedOperationException("shutdown unimplemented, cannot shutdown UI thread");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("shutdownNow unimplemented, cannot shutdown UI thread");
    }

    @Override // defpackage.eosc, java.util.concurrent.ExecutorService
    public final List invokeAll(java.util.Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("invokeAll with timeout unimplemented, cannot cancel runnables on the UI thread");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(java.util.Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("invokeAny with timeout unimplemented, cannot cancel runnables on the UI thread");
    }
}
