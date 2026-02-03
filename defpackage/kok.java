package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kok implements ListenableFuture {
    final WeakReference a;
    public final koe b = new koj(this);

    public kok(kog kogVar) {
        this.a = new WeakReference(kogVar);
    }

    final boolean a(Throwable th) {
        return this.b.h(th);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        kog kogVar = (kog) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || kogVar == null) {
            return zCancel;
        }
        kogVar.a = null;
        kogVar.b = null;
        kogVar.c.g(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
