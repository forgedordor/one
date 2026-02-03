package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class lzt {
    private static Handler a;
    public volatile int f = 1;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();
    public final FutureTask c = new lzr(this, new lzq(this));

    protected abstract Object a();

    protected void b(Object obj) {
        throw null;
    }

    protected void c(Object obj) {
        throw null;
    }

    final void d(Object obj) {
        Handler handler;
        synchronized (lzt.class) {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        handler.post(new lzs(this, obj));
    }

    final void e(Object obj) {
        if (this.e.get()) {
            return;
        }
        d(obj);
    }

    public final boolean f() {
        return this.d.get();
    }
}
