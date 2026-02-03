package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijy {
    public static ListenableFuture a(ListenableFuture listenableFuture, Callable callable, Executor executor) {
        return egot.a(listenableFuture, eiid.l(callable), executor);
    }

    public static ListenableFuture b(final ListenableFuture listenableFuture, eooy eooyVar, final Executor executor) {
        ListenableFuture listenableFutureN = eork.n(new egos(eiid.c(eooyVar), listenableFuture), new Executor() { // from class: egor
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                listenableFuture.b(runnable, executor);
            }
        });
        egot.b(listenableFuture, listenableFutureN);
        return listenableFutureN;
    }
}
