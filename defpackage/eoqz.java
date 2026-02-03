package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eoqz extends eoqu implements AutoCloseable, eosc {
    protected eoqz() {
    }

    @Override // defpackage.eoqu, java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final ListenableFuture submit(Callable callable) {
        return h().submit(callable);
    }

    @Override // defpackage.eoqu, java.util.concurrent.ExecutorService
    /* renamed from: c */
    public final ListenableFuture submit(Runnable runnable, Object obj) {
        return h().submit(runnable, obj);
    }

    @Override // defpackage.eoqu, java.lang.AutoCloseable
    public /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.eoqu, java.util.concurrent.ExecutorService
    /* renamed from: gc */
    public final ListenableFuture submit(Runnable runnable) {
        return h().submit(runnable);
    }

    protected abstract eosc h();

    @Override // defpackage.eoqu
    protected /* bridge */ /* synthetic */ ExecutorService i() {
        throw null;
    }
}
