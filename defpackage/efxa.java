package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxa implements Closeable {
    final /* synthetic */ efxb a;

    public efxa(efxb efxbVar) {
        this.a = efxbVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ejwl.m(this.a.a.compareAndSet(true, false), "AccountOperationContext is already in the immutable state. This may be caused by concurrent access to the object, which is forbidden.");
    }
}
