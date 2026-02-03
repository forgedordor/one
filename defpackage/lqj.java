package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lqj {
    public final Context a;
    public final lat b;
    public final Object c = new Object();
    public Executor d;
    public ThreadPoolExecutor e;
    lpy f;

    public lqj(Context context, lat latVar) {
        lcg.j(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = latVar;
    }

    public final void a() {
        synchronized (this.c) {
            this.f = null;
            ThreadPoolExecutor threadPoolExecutor = this.e;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.d = null;
            this.e = null;
        }
    }
}
