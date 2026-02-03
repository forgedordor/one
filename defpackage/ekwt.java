package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekwt implements Closeable {
    private static final ThreadLocal b = new ekws();
    public int a = 0;

    public static ekwt a() {
        return (ekwt) b.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.a = i - 1;
    }
}
