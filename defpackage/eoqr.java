package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoqr {
    private final AtomicReference b = new AtomicReference(eorv.a);
    public eoqq a = new eoqq();

    public final ListenableFuture a(Callable callable, Executor executor) {
        callable.getClass();
        executor.getClass();
        return b(new eoqm(callable), executor);
    }

    public final ListenableFuture b(eooy eooyVar, Executor executor) {
        executor.getClass();
        final eoqp eoqpVar = new eoqp(executor, this);
        eoqn eoqnVar = new eoqn(eoqpVar, eooyVar);
        AtomicReference atomicReference = this.b;
        final SettableFuture settableFutureCreate = SettableFuture.create();
        final ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(settableFutureCreate);
        final eotc eotcVar = new eotc(eoqnVar);
        listenableFuture.b(eotcVar, eoqpVar);
        final ListenableFuture listenableFutureJ = eork.j(eotcVar);
        Runnable runnable = new Runnable() { // from class: eoql
            @Override // java.lang.Runnable
            public final void run() {
                eotc eotcVar2 = eotcVar;
                if (eotcVar2.isDone()) {
                    settableFutureCreate.o(listenableFuture);
                } else if (listenableFutureJ.isCancelled() && eoqpVar.compareAndSet(eoqo.NOT_RUN, eoqo.CANCELLED)) {
                    eotcVar2.cancel(false);
                }
            }
        };
        eoqg eoqgVar = eoqg.a;
        listenableFutureJ.b(runnable, eoqgVar);
        eotcVar.b(runnable, eoqgVar);
        return listenableFutureJ;
    }
}
