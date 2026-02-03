package defpackage;

import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxd {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public nww r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final int a() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public final void b(int i) {
        this.d = i;
        this.e = true;
    }

    public final void c(int i) {
        this.b = i;
        this.c = true;
    }

    public final void d(nxd nxdVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (nxdVar != null) {
            if (!this.c && nxdVar.c) {
                c(nxdVar.b);
            }
            if (this.h == -1) {
                this.h = nxdVar.h;
            }
            if (this.i == -1) {
                this.i = nxdVar.i;
            }
            if (this.a == null && (str = nxdVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = nxdVar.f;
            }
            if (this.g == -1) {
                this.g = nxdVar.g;
            }
            if (this.n == -1) {
                this.n = nxdVar.n;
            }
            if (this.o == null && (alignment2 = nxdVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = nxdVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = nxdVar.q;
            }
            if (this.j == -1) {
                this.j = nxdVar.j;
                this.k = nxdVar.k;
            }
            if (this.r == null) {
                this.r = nxdVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = nxdVar.s;
            }
            if (this.t == null) {
                this.t = nxdVar.t;
            }
            if (this.u == null) {
                this.u = nxdVar.u;
            }
            if (!this.e && nxdVar.e) {
                b(nxdVar.d);
            }
            if (this.m != -1 || (i = nxdVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
