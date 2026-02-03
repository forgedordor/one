package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eujl implements Closeable {
    public abstract Object a();

    public abstract Runnable b();

    public abstract boolean c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().run();
    }
}
