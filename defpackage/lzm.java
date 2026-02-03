package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lzm extends lzt implements Runnable {
    boolean a;
    final /* synthetic */ lzn b;

    public lzm(lzn lznVar) {
        this.b = lznVar;
    }

    @Override // defpackage.lzt
    protected final Object a() {
        try {
            return this.b.b();
        } catch (laj e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.lzt
    protected final void b(Object obj) {
        this.b.c(this, obj);
    }

    @Override // defpackage.lzt
    protected final void c(Object obj) {
        lzn lznVar = this.b;
        if (lznVar.a != this) {
            lznVar.c(this, obj);
            return;
        }
        if (lznVar.e) {
            lznVar.e(obj);
            return;
        }
        lznVar.i();
        SystemClock.uptimeMillis();
        lznVar.a = null;
        lznVar.j(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.d();
    }
}
