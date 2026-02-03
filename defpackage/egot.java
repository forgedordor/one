package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egot {
    public static ListenableFuture a(ListenableFuture listenableFuture, Callable callable, Executor executor) {
        eosa eosaVar = new eosa(callable);
        listenableFuture.b(eosaVar, executor);
        b(listenableFuture, eosaVar);
        return eosaVar;
    }

    public static void b(final ListenableFuture listenableFuture, final ListenableFuture listenableFuture2) {
        listenableFuture2.b(new Runnable() { // from class: egoq
            @Override // java.lang.Runnable
            public final void run() {
                if (listenableFuture2.isCancelled()) {
                    listenableFuture.cancel(true);
                }
            }
        }, eoqg.a);
    }
}
