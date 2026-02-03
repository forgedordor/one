package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eopm extends IdentityHashMap implements Closeable {
    public final eopt a = new eopt(this);
    private volatile boolean b;
    private volatile CountDownLatch c;

    final ListenableFuture a(eopo eopoVar, Object obj) {
        eopm eopmVar = new eopm();
        try {
            return eork.i(eopoVar.a(eopmVar.a, obj));
        } finally {
            b(eopmVar, eoqg.a);
        }
    }

    public final void b(AutoCloseable autoCloseable, Executor executor) {
        executor.getClass();
        if (autoCloseable == null) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                eopy.l(autoCloseable, executor);
            } else {
                put(autoCloseable, executor);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            for (Map.Entry entry : entrySet()) {
                eopy.l((AutoCloseable) entry.getKey(), (Executor) entry.getValue());
            }
            clear();
        }
    }
}
