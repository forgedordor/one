package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eorg {
    private final boolean a;
    private final ekgb b;

    public eorg(boolean z, ekgb ekgbVar) {
        this.a = z;
        this.b = ekgbVar;
    }

    public final ListenableFuture a(Callable callable, Executor executor) {
        return new eoqf(this.b, this.a, executor, callable);
    }

    public final ListenableFuture b(eooy eooyVar, Executor executor) {
        return new eoqf(this.b, this.a, executor, eooyVar);
    }

    public final ListenableFuture c(Runnable runnable, Executor executor) {
        return a(new eorf(runnable), executor);
    }
}
