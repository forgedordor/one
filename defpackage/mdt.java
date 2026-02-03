package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdt {
    public CharSequence a;
    public Bitmap b;
    public Layout.Alignment c;
    public Layout.Alignment d;
    public int e;
    public float f;
    public int g;
    public float h;
    public float i;
    public int j;
    public float k;
    public int l;
    private float m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private int r;

    public mdt() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = -3.4028235E38f;
        this.n = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f = -3.4028235E38f;
        this.g = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.p = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.q = false;
        this.r = -16777216;
        this.j = Integer.MIN_VALUE;
    }

    public final mdu a() {
        return new mdu(this.a, this.c, this.d, this.b, this.m, this.n, this.e, this.f, this.g, this.o, this.p, this.h, this.i, this.q, this.r, this.j, this.k, this.l);
    }

    public final void b() {
        this.q = false;
    }

    public final void c(float f, int i) {
        this.m = f;
        this.n = i;
    }

    public final void d(float f, int i) {
        this.p = f;
        this.o = i;
    }

    public final void e(int i) {
        this.r = i;
        this.q = true;
    }

    public mdt(mdu mduVar) {
        this.a = mduVar.u;
        this.b = mduVar.x;
        this.c = mduVar.v;
        this.d = mduVar.w;
        this.m = mduVar.y;
        this.n = mduVar.z;
        this.e = mduVar.A;
        this.f = mduVar.B;
        this.g = mduVar.C;
        this.o = mduVar.H;
        this.p = mduVar.I;
        this.h = mduVar.D;
        this.i = mduVar.E;
        this.q = mduVar.F;
        this.r = mduVar.G;
        this.j = mduVar.J;
        this.k = mduVar.K;
        this.l = mduVar.L;
    }
}
