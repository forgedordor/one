package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ablg implements Closeable {
    private final ablf a;
    private final AtomicBoolean b;

    public ablg(ablf ablfVar, AtomicBoolean atomicBoolean) {
        this.a = ablfVar;
        this.b = atomicBoolean;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.get()) {
            return;
        }
        this.a.d();
    }
}
