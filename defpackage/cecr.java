package defpackage;

import android.util.LruCache;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cecr {
    private fdjc f;
    private final Object e = new Object();
    public final AtomicReference a = new AtomicReference("");
    public final AtomicLong b = new AtomicLong(-1);
    public final Object c = new Object();
    public final LruCache d = new LruCache(50);

    public final fdjc a() {
        fdjd fdjdVar;
        synchronized (this.e) {
            fcyh fcyhVar = this.f;
            if (fcyhVar != null) {
                ((fdme) fcyhVar).R(cecq.a);
                this.f = null;
            }
            fdjdVar = new fdjd();
            this.f = fdjdVar;
        }
        return fdjdVar;
    }

    public final void b(cecq cecqVar) {
        cecqVar.getClass();
        synchronized (this.e) {
            fcyh fcyhVar = this.f;
            if (fcyhVar != null) {
                ((fdme) fcyhVar).R(cecqVar);
            }
            this.f = null;
        }
    }
}
