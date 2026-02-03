package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqk {
    public static ListenableFuture a(Collection collection) {
        return new bqs(new ArrayList(collection), true, bpc.a());
    }

    public static ListenableFuture b(Object obj) {
        return obj == null ? bqn.a : new bqn(obj);
    }

    public static ListenableFuture c(final long j, final ScheduledExecutorService scheduledExecutorService, final ListenableFuture listenableFuture) {
        return kol.a(new koi() { // from class: bpx
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final ListenableFuture listenableFuture2 = listenableFuture;
                bqk.j(listenableFuture2, kogVar);
                if (!listenableFuture2.isDone()) {
                    final long j2 = j;
                    final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: bqe
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(kogVar.c(new TimeoutException("Future[" + listenableFuture2 + "] is not done within " + j2 + " ms.")));
                        }
                    }, j2, TimeUnit.MILLISECONDS);
                    listenableFuture2.b(new Runnable() { // from class: bqf
                        @Override // java.lang.Runnable
                        public final void run() {
                            scheduledFutureSchedule.cancel(true);
                        }
                    }, bpc.a());
                }
                return a.h(listenableFuture2, "TimeoutFuture[", "]");
            }
        });
    }

    public static ListenableFuture d(final ListenableFuture listenableFuture) {
        lcg.i(listenableFuture);
        return listenableFuture.isDone() ? listenableFuture : kol.a(new koi() { // from class: bqa
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                ListenableFuture listenableFuture2 = listenableFuture;
                bqk.l(false, listenableFuture2, kogVar, bpc.a());
                return "nonCancellationPropagating[" + listenableFuture2 + "]";
            }
        });
    }

    public static ListenableFuture e(Collection collection) {
        return new bqs(new ArrayList(collection), false, bpc.a());
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, akv akvVar, Executor executor) {
        return g(listenableFuture, new bqg(akvVar), executor);
    }

    public static ListenableFuture g(ListenableFuture listenableFuture, bpr bprVar, Executor executor) {
        bpt bptVar = new bpt(bprVar, listenableFuture);
        listenableFuture.b(bptVar, executor);
        return bptVar;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    public static void i(ListenableFuture listenableFuture, bpu bpuVar, Executor executor) {
        listenableFuture.b(new bqj(listenableFuture, bpuVar), executor);
    }

    public static void j(ListenableFuture listenableFuture, kog kogVar) {
        l(true, listenableFuture, kogVar, bpc.a());
    }

    public static ListenableFuture k(final long j, final ScheduledExecutorService scheduledExecutorService, final ListenableFuture listenableFuture) {
        return kol.a(new koi() { // from class: bqb
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final ListenableFuture listenableFuture2 = listenableFuture;
                bqk.j(listenableFuture2, kogVar);
                if (!listenableFuture2.isDone()) {
                    final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: bqc
                        @Override // java.lang.Runnable
                        public final void run() {
                            kogVar.b(null);
                            listenableFuture2.cancel(true);
                        }
                    }, j, TimeUnit.MILLISECONDS);
                    listenableFuture2.b(new Runnable() { // from class: bqd
                        @Override // java.lang.Runnable
                        public final void run() {
                            scheduledFutureSchedule.cancel(true);
                        }
                    }, bpc.a());
                }
                return a.h(listenableFuture2, "TimeoutFuture[", "]");
            }
        });
    }

    public static void l(boolean z, ListenableFuture listenableFuture, kog kogVar, Executor executor) {
        lcg.i(listenableFuture);
        lcg.i(kogVar);
        lcg.i(executor);
        i(listenableFuture, new bqh(kogVar), executor);
        if (z) {
            kogVar.a(new bqi(listenableFuture), bpc.a());
        }
    }
}
