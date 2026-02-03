package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drtb implements AutoCloseable {
    public static final drtb b;

    static {
        drta drtaVar = drta.a;
        ListenableFuture listenableFutureG = eork.g();
        drue drueVar = new drue();
        drueVar.a = eoqg.a;
        b = e(drtaVar, listenableFutureG, drueVar.a());
    }

    public static drtb e(drta drtaVar, ListenableFuture listenableFuture, druc drucVar) {
        eork.r(listenableFuture, drucVar, drucVar.a);
        return new drsz(drtaVar, listenableFuture, drucVar);
    }

    public abstract drta a();

    public abstract ListenableFuture b();

    public abstract druc c();

    @Override // java.lang.AutoCloseable
    public final void close() {
        b().cancel(true);
        c().close();
    }

    public final boolean d() {
        return !b().isDone();
    }
}
