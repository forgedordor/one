package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoqv extends eoqt {
    private final ListenableFuture a;

    public eoqv(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.a = listenableFuture;
    }

    @Override // defpackage.eooi, com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        this.a.b(runnable, executor);
    }

    @Override // defpackage.eooi, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.eooi, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.eooi, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.eooi, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.eooi
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.eooi, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
