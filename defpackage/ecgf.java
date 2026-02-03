package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgf implements Closeable {
    public Closeable a;

    public ecgf(Closeable closeable) {
        this.a = closeable;
    }

    public final Closeable a() {
        Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
