package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpt extends bpw implements Runnable {
    volatile ListenableFuture a;
    private bpr c;
    private final BlockingQueue d = new LinkedBlockingQueue(1);
    private final CountDownLatch e = new CountDownLatch(1);
    private ListenableFuture f;

    public bpt(bpr bprVar, ListenableFuture listenableFuture) {
        this.c = bprVar;
        lcg.i(listenableFuture);
        this.f = listenableFuture;
    }

    private static final void d(Future future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override // defpackage.bpw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!super.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        d(this.f, z);
        d(this.a, z);
        return true;
    }

    @Override // defpackage.bpw, java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        if (!isDone()) {
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.e.await();
            ListenableFuture listenableFuture2 = this.a;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return super.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objTake;
        boolean z = false;
        try {
            try {
                try {
                    ListenableFuture listenableFutureA = this.c.a(bqk.h(this.f));
                    this.a = listenableFutureA;
                    if (isCancelled()) {
                        BlockingQueue blockingQueue = this.d;
                        while (true) {
                            try {
                                objTake = blockingQueue.take();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        listenableFutureA.cancel(((Boolean) objTake).booleanValue());
                        this.a = null;
                    } else {
                        listenableFutureA.b(new bps(this, listenableFutureA), bpc.a());
                    }
                } catch (Throwable th2) {
                    this.c = null;
                    this.f = null;
                    this.e.countDown();
                    throw th2;
                }
            } catch (CancellationException unused2) {
                cancel(false);
            } catch (ExecutionException e) {
                c(e.getCause());
            }
        } catch (Error e2) {
            c(e2);
        } catch (UndeclaredThrowableException e3) {
            c(e3.getCause());
        } catch (Exception e4) {
            c(e4);
        }
        this.c = null;
        this.f = null;
        this.e.countDown();
    }

    @Override // defpackage.bpw, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        if (!isDone()) {
            if (timeUnit != TimeUnit.NANOSECONDS) {
                j = TimeUnit.NANOSECONDS.convert(j, timeUnit);
                timeUnit = TimeUnit.NANOSECONDS;
            }
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            CountDownLatch countDownLatch = this.e;
            long jNanoTime2 = System.nanoTime();
            if (countDownLatch.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ListenableFuture listenableFuture2 = this.a;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }
}
