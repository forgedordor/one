package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eika {
    public static eijz a(Iterable iterable) {
        return new eijz(eork.a(iterable));
    }

    @SafeVarargs
    public static eijz b(ListenableFuture... listenableFutureArr) {
        return new eijz(eork.b(listenableFutureArr));
    }

    public static eijz c(Iterable iterable) {
        return new eijz(eork.c(iterable));
    }

    @SafeVarargs
    public static eijz d(ListenableFuture... listenableFutureArr) {
        return new eijz(eork.d(listenableFutureArr));
    }

    public static ListenableFuture e(ListenableFuture listenableFuture, Class cls, ejvr ejvrVar, Executor executor) {
        return eooh.f(listenableFuture, cls, eiid.a(ejvrVar), executor);
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, Class cls, eooz eoozVar, Executor executor) {
        return eooh.g(listenableFuture, cls, eiid.d(eoozVar), executor);
    }

    public static ListenableFuture g(Runnable runnable, Executor executor) {
        return eork.l(eiid.k(runnable), executor);
    }

    public static ListenableFuture h(Callable callable, Executor executor) {
        return eork.m(eiid.l(callable), executor);
    }

    public static ListenableFuture i(eooy eooyVar, Executor executor) {
        return eork.n(eiid.c(eooyVar), executor);
    }

    public static ListenableFuture j(ListenableFuture listenableFuture, ejvr ejvrVar, Executor executor) {
        return eooq.f(listenableFuture, eiid.a(ejvrVar), executor);
    }

    public static ListenableFuture k(ListenableFuture listenableFuture, eooz eoozVar, Executor executor) {
        return eooq.g(listenableFuture, eiid.d(eoozVar), executor);
    }

    public static void l(ListenableFuture listenableFuture, eora eoraVar, Executor executor) {
        eork.r(listenableFuture, eiid.h(eoraVar), executor);
    }
}
