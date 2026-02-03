package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujv implements Closeable {
    private Closeable a;
    private final Lock c = new ReentrantLock();
    private boolean d = true;
    private boolean b = true;

    public eujv(Closeable closeable) {
        this.a = closeable;
    }

    public static eujv b(AssetFileDescriptor assetFileDescriptor) {
        return new eujv(euhk.a(assetFileDescriptor));
    }

    public final eujl a() {
        final Lock lock = this.c;
        lock.lock();
        eugv eugvVar = new eugv(this.b, this.a, new Runnable() { // from class: euju
            @Override // java.lang.Runnable
            public final void run() {
                lock.unlock();
            }
        });
        this.b = false;
        return eugvVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.lock();
        try {
            Closeable closeable = this.a;
            boolean z = this.d;
            this.a = null;
            this.d = true;
            this.b = true;
            if (!z || closeable == null) {
                return;
            }
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("StaticModelProvider", "Failed to close the static model: ", e);
            }
        } finally {
            this.c.unlock();
        }
    }
}
