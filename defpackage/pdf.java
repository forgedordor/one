package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdf extends pbg {
    public final pde a;
    public final Runnable b;
    public Point c;
    public Point d;
    public boolean e;

    public pdf(pde pdeVar) {
        lcg.a(true);
        this.a = pdeVar;
        this.b = new pdc(this);
    }

    @Override // defpackage.pbg
    public final void a() {
        this.a.b(this.b);
        this.c = null;
        this.d = null;
        this.e = false;
    }
}
