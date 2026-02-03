package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiju<V> extends eoqx<V> {
    private eiju(ListenableFuture listenableFuture) {
        super(listenableFuture);
    }

    public static eiju g(ListenableFuture listenableFuture) {
        return listenableFuture instanceof eiju ? (eiju) listenableFuture : new eiju(listenableFuture);
    }

    public final eiju e(Class cls, ejvr ejvrVar, Executor executor) {
        return new eiju(eika.e(this.b, cls, ejvrVar, executor));
    }

    public final eiju f(Class cls, eooz eoozVar, Executor executor) {
        return new eiju(eika.f(this.b, cls, eoozVar, executor));
    }

    public final eiju h(ejvr ejvrVar, Executor executor) {
        return new eiju(eika.j(this.b, ejvrVar, executor));
    }

    public final eiju i(eooz eoozVar, Executor executor) {
        return new eiju(eika.k(this.b, eoozVar, executor));
    }

    public final eiju j(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return new eiju(eork.p(this.b, j, timeUnit, scheduledExecutorService));
    }

    public final void k(eora eoraVar, Executor executor) {
        eika.l(this.b, eoraVar, executor);
    }
}
