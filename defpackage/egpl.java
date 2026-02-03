package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpl implements ExecutorService, AutoCloseable {
    private static final ekrg c = ekrg.c("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor");
    private final Executor d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private boolean h;
    private ListenableFuture i;
    private egpk j;
    public final Deque a = new ArrayDeque();
    public int b = 1;
    private final egpj k = new egpj(this);

    public egpl(Executor executor, boolean z, boolean z2, boolean z3) {
        this.d = executor;
        this.f = z2;
        this.g = z3;
        this.e = z;
    }

    static /* synthetic */ void b(ListenableFuture listenableFuture, String str) {
        try {
            eork.q(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((ekrd) ((ekrd) ((ekrd) c.i()).g(e.getCause())).h("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor", "logOnFailure", (char) 427, "SuspendableUiThreadExecutor.java")).q(str);
        }
    }

    private static void e(final ListenableFuture listenableFuture, final String str) {
        listenableFuture.b(eiid.k(new Runnable() { // from class: egpi
            @Override // java.lang.Runnable
            public final void run() {
                egpl.b(listenableFuture, str);
            }
        }), eoqg.a);
    }

    public final Queue a() {
        ArrayDeque arrayDeque;
        Deque deque = this.a;
        synchronized (deque) {
            ejwl.m(this.h, "Executor may only be drained when it is suspended.");
            arrayDeque = new ArrayDeque(deque);
            deque.clear();
        }
        return arrayDeque;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        ecem.c();
        synchronized (this.a) {
            this.h = false;
        }
        execute(eosp.a);
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

    public final void d() {
        ecem.c();
        synchronized (this.a) {
            this.h = true;
            this.b = 1;
            if (this.f) {
                egpk egpkVar = this.j;
                if (egpkVar != null) {
                    egpkVar.a();
                    this.j = null;
                }
            } else {
                ListenableFuture listenableFuture = this.i;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                    this.i = null;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        Deque deque = this.a;
        synchronized (deque) {
            if (this.h || (i = this.b) == 3 || i == 2) {
                deque.add(runnable);
            } else {
                deque.add(runnable);
                if (this.f) {
                    egpk egpkVar = new egpk(this.k);
                    this.j = egpkVar;
                    this.d.execute(eiid.k(egpkVar));
                } else {
                    ListenableFuture listenableFutureL = eork.l(eiid.k(this.k), this.d);
                    this.i = listenableFutureL;
                    if (this.g) {
                        e(listenableFutureL, "Silently ignored exception in MainImmediateContext.");
                    } else {
                        e(listenableFutureL, "Silently ignored exception in SuspendableUiThreadExecutor.");
                    }
                }
                this.b = 2;
            }
        }
        synchronized (this.a) {
            z = false;
            if (ecem.g() && this.e && !this.h && this.b != 3) {
                if (this.f) {
                    egpk egpkVar2 = this.j;
                    egpkVar2.getClass();
                    egpkVar2.a();
                    this.j = null;
                } else {
                    ListenableFuture listenableFuture = this.i;
                    listenableFuture.getClass();
                    listenableFuture.cancel(false);
                    this.i = null;
                }
                this.b = 2;
                z = true;
            }
        }
        if (z) {
            this.k.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
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

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return eork.l(runnable, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(final Runnable runnable, final Object obj) {
        return eork.m(new Callable() { // from class: egph
            @Override // java.util.concurrent.Callable
            public final Object call() {
                runnable.run();
                return obj;
            }
        }, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return eork.m(callable, this);
    }
}
