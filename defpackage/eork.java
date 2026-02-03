package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eork extends eors {
    public static eorg a(Iterable iterable) {
        return new eorg(false, ekgb.j(iterable));
    }

    @SafeVarargs
    public static eorg b(ListenableFuture... listenableFutureArr) {
        return new eorg(false, ekgb.p(listenableFutureArr));
    }

    public static eorg c(Iterable iterable) {
        return new eorg(true, ekgb.j(iterable));
    }

    @SafeVarargs
    public static eorg d(ListenableFuture... listenableFutureArr) {
        return new eorg(true, ekgb.p(listenableFutureArr));
    }

    public static ListenableFuture e(Iterable iterable) {
        return new eopz(ekgb.j(iterable), true);
    }

    @SafeVarargs
    public static ListenableFuture f(ListenableFuture... listenableFutureArr) {
        return new eopz(ekgb.p(listenableFutureArr), true);
    }

    public static ListenableFuture g() {
        eort eortVar = eort.a;
        return eortVar != null ? eortVar : new eort();
    }

    public static ListenableFuture h(Throwable th) {
        th.getClass();
        return new eoru(th);
    }

    public static ListenableFuture i(Object obj) {
        return obj == null ? eorv.a : new eorv(obj);
    }

    public static ListenableFuture j(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        eorj eorjVar = new eorj(listenableFuture);
        listenableFuture.b(eorjVar, eoqg.a);
        return eorjVar;
    }

    public static ListenableFuture k(eooy eooyVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        eotc eotcVar = new eotc(eooyVar);
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(eotcVar, j, timeUnit);
        eotcVar.b(new Runnable() { // from class: eorc
            @Override // java.lang.Runnable
            public final void run() {
                scheduledFutureSchedule.cancel(false);
            }
        }, eoqg.a);
        return eotcVar;
    }

    public static ListenableFuture l(Runnable runnable, Executor executor) {
        eotc eotcVarD = eotc.d(runnable, null);
        executor.execute(eotcVarD);
        return eotcVarD;
    }

    public static ListenableFuture m(Callable callable, Executor executor) {
        eotc eotcVar = new eotc(callable);
        executor.execute(eotcVar);
        return eotcVar;
    }

    public static ListenableFuture n(eooy eooyVar, Executor executor) {
        eotc eotcVar = new eotc(eooyVar);
        executor.execute(eotcVar);
        return eotcVar;
    }

    public static ListenableFuture o(Iterable iterable) {
        return new eopz(ekgb.j(iterable), false);
    }

    public static ListenableFuture p(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        eosz eoszVar = new eosz(listenableFuture);
        eosx eosxVar = new eosx(eoszVar);
        eoszVar.b = scheduledExecutorService.schedule(eosxVar, j, timeUnit);
        listenableFuture.b(eosxVar, eoqg.a);
        return eoszVar;
    }

    public static Object q(Future future) {
        ejwl.p(future.isDone(), "Future was expected to be done: %s", future);
        return eote.a(future);
    }

    public static void r(ListenableFuture listenableFuture, eora eoraVar, Executor executor) {
        eoraVar.getClass();
        listenableFuture.b(new eord(listenableFuture, eoraVar), executor);
    }

    public static void s(ListenableFuture listenableFuture, Future future) {
        if (listenableFuture instanceof eooi) {
            ((eooi) listenableFuture).m(future);
        } else {
            if (listenableFuture == null || !listenableFuture.isCancelled() || future == null) {
                return;
            }
            future.cancel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(ListenableFuture listenableFuture, Future future) {
        listenableFuture.getClass();
        if (future.isDone()) {
            return;
        }
        if (listenableFuture.isDone()) {
            s(listenableFuture, future);
            return;
        }
        eore eoreVar = new eore(listenableFuture, future);
        eoqg eoqgVar = eoqg.a;
        listenableFuture.b(eoreVar, eoqgVar);
        if (future instanceof ListenableFuture) {
            future.b(eoreVar, eoqgVar);
        }
    }
}
