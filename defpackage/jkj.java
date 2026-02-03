package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkj extends fdjq {
    public static final fctc a = fctd.a(jkf.a);
    public static final ThreadLocal b = new jkg();
    public final Choreographer c;
    public final Handler d;
    public boolean h;
    public final hoq j;
    private boolean n;
    public final Object e = new Object();
    private final fcuq m = new fcuq();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public final jki i = new jki(this);

    public jkj(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new jko(choreographer, this);
    }

    private final Runnable c() {
        Runnable runnable;
        synchronized (this.e) {
            runnable = (Runnable) this.m.g();
        }
        return runnable;
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                Handler handler = this.d;
                jki jkiVar = this.i;
                handler.post(jkiVar);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(jkiVar);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            Runnable runnableC = c();
            while (runnableC != null) {
                runnableC.run();
                runnableC = c();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
