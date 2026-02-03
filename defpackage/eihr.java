package defpackage;

import java.io.Closeable;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihr implements Closeable {
    private final long a;

    public eihr(long j) {
        this.a = j;
    }

    public final void a() {
        HashMap map = eiid.b;
        synchronized (map) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ecem.d(new Runnable() { // from class: eihq
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, 5000L);
    }
}
