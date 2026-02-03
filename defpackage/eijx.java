package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijx {
    public static eiju a(Iterable iterable) {
        return eiju.g(eork.e(iterable));
    }

    public static eiju b(ListenableFuture... listenableFutureArr) {
        return eiju.g(eork.f(listenableFutureArr));
    }

    public static eiju c() {
        return eiju.g(eork.g());
    }

    public static eiju d(Throwable th) {
        return eiju.g(eork.h(th));
    }

    public static eiju e(Object obj) {
        return eiju.g(eork.i(obj));
    }

    public static eiju f(Runnable runnable, Executor executor) {
        return eiju.g(eika.g(runnable, executor));
    }

    public static eiju g(final Callable callable, Executor executor) {
        return h(new eooy() { // from class: eijv
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eork.i(callable.call());
            }
        }, executor);
    }

    public static eiju h(eooy eooyVar, Executor executor) {
        return eiju.g(eika.i(eooyVar, executor));
    }

    public static eiju i(Iterable iterable) {
        return eiju.g(eork.o(iterable));
    }

    public static eijw j(Iterable iterable) {
        return new eijw(eika.a(iterable));
    }

    @SafeVarargs
    public static eijw k(ListenableFuture... listenableFutureArr) {
        return new eijw(eika.b(listenableFutureArr));
    }

    public static eijw l(Iterable iterable) {
        return new eijw(eika.c(iterable));
    }

    @SafeVarargs
    public static eijw m(ListenableFuture... listenableFutureArr) {
        return new eijw(eika.d(listenableFutureArr));
    }
}
