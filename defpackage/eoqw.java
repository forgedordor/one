package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eoqw<V> extends eker implements Future<V> {
    protected eoqw() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return gN().cancel(z);
    }

    protected abstract Future gN();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return gN().get();
    }

    @Override // defpackage.eker
    protected /* bridge */ /* synthetic */ Object hp() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return gN().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return gN().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return gN().get(j, timeUnit);
    }
}
