package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elee implements Closeable {
    public Throwable a;
    private final Deque b = new ArrayDeque(4);

    public final void a(Closeable closeable) {
        if (closeable != null) {
            this.b.addFirst(closeable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.a;
        while (true) {
            Deque deque = this.b;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        eled.a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(String.valueOf(String.valueOf(closeable))), th2);
                    }
                }
            }
        }
        if (this.a != null || th == null) {
            return;
        }
        ejxy.d(th, IOException.class);
        ejxy.e(th);
        throw new AssertionError(th);
    }
}
