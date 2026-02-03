package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikl implements kio {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public ikp o;
    public boolean p;
    public int q;
    public long r;
    public kio s;
    public kji t;
    public ikk u;
    public ijf v;
    public int w;
    public ijz x;

    public ikl() {
        long j = ijo.a;
        this.h = j;
        this.i = j;
        this.m = 8.0f;
        this.n = ikz.a;
        this.o = ikj.a;
        this.q = 0;
        this.r = 9205357640488583168L;
        this.s = new kip(1.0f);
        this.t = kji.a;
        this.w = 3;
    }

    public final void A(ikp ikpVar) {
        if (fdbq.f(this.o, ikpVar)) {
            return;
        }
        this.a |= 8192;
        this.o = ikpVar;
    }

    public final void B(long j) {
        long j2 = this.i;
        long j3 = ije.a;
        if (fcts.a(j2, j)) {
            return;
        }
        this.a |= 128;
        this.i = j;
    }

    public final void C(long j) {
        if (ikz.d(this.n, j)) {
            return;
        }
        this.a |= 4096;
        this.n = j;
    }

    public final void D(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void E(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    public final void F() {
        if (fdbq.f(null, null)) {
            return;
        }
        this.a |= 262144;
        this.v = null;
    }

    public final void a(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void b(long j) {
        long j2 = this.h;
        long j3 = ije.a;
        if (fcts.a(j2, j)) {
            return;
        }
        this.a |= 64;
        this.h = j;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.s.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.s.ee();
    }

    @Override // defpackage.kiy
    public final /* synthetic */ float eg(long j) {
        return kix.a(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float eh(float f) {
        return kin.a(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float el(int i) {
        return kin.b(this, i);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float em(long j) {
        return kin.c(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float en(float f) {
        return kin.d(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int eo(long j) {
        return kin.e(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int ep(float f) {
        return kin.f(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long eq(long j) {
        return kin.g(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long er(long j) {
        return kin.h(this, j);
    }

    @Override // defpackage.kiy
    public final /* synthetic */ long es(float f) {
        return kix.b(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long et(float f) {
        return kin.i(this, f);
    }

    public final void p(int i) {
        if (iis.b(this.w, i)) {
            return;
        }
        this.a |= 524288;
        this.w = i;
    }

    public final void q(float f) {
        if (this.m == f) {
            return;
        }
        this.a |= 2048;
        this.m = f;
    }

    public final void r(boolean z) {
        if (this.p != z) {
            this.a |= 16384;
            this.p = z;
        }
    }

    public final void s(int i) {
        if (ijk.b(this.q, i)) {
            return;
        }
        this.a |= 32768;
        this.q = i;
    }

    public final void t(ikk ikkVar) {
        if (fdbq.f(this.u, ikkVar)) {
            return;
        }
        this.a |= 131072;
        this.u = ikkVar;
    }

    public final void u(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 256;
        this.j = f;
    }

    public final void v(float f) {
        if (this.k == f) {
            return;
        }
        this.a |= 512;
        this.k = f;
    }

    public final void w(float f) {
        if (this.l == f) {
            return;
        }
        this.a |= 1024;
        this.l = f;
    }

    public final void x(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void y(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void z(float f) {
        if (this.g == f) {
            return;
        }
        this.a |= 32;
        this.g = f;
    }
}
