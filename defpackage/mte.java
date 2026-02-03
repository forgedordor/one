package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mte {
    public final mtd a;
    public int b;
    public Object c;
    public final Looper d;
    public final long e = -9223372036854775807L;
    private final mtc f;
    private boolean g;
    private boolean h;

    public mte(mtc mtcVar, mtd mtdVar, Looper looper) {
        this.f = mtcVar;
        this.a = mtdVar;
        this.d = looper;
    }

    public final synchronized void a(boolean z) {
        this.h = z | this.h;
        notifyAll();
    }

    public final synchronized void b() {
    }

    public final void c() {
        mee.c(!this.g);
        mee.a(true);
        this.g = true;
        mry mryVar = (mry) this.f;
        if (!mryVar.k && mryVar.f.getThread().isAlive()) {
            mryVar.e.d(14, this).b();
        } else {
            mff.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }

    public final void d(Object obj) {
        mee.c(!this.g);
        this.c = obj;
    }

    public final void e(int i) {
        mee.c(!this.g);
        this.b = i;
    }
}
