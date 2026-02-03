package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bpw implements ListenableFuture {
    private final ListenableFuture a;
    kog b;

    public bpw() {
        this.a = kol.a(new bpv(this));
    }

    public static bpw a(ListenableFuture listenableFuture) {
        return listenableFuture instanceof bpw ? (bpw) listenableFuture : new bpw(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        this.a.b(runnable, executor);
    }

    final void c(Throwable th) {
        kog kogVar = this.b;
        if (kogVar != null) {
            kogVar.c(th);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public bpw(ListenableFuture listenableFuture) {
        lcg.i(listenableFuture);
        this.a = listenableFuture;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
