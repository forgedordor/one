package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eoqt extends eorr {
    public static eoqt t(ListenableFuture listenableFuture) {
        return listenableFuture instanceof eoqt ? (eoqt) listenableFuture : new eoqv(listenableFuture);
    }

    public final eoqt u(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (eoqt) eork.p(this, j, timeUnit, scheduledExecutorService);
    }
}
