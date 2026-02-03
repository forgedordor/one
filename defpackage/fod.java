package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fod {
    private final hox a;
    private final hox b;
    private final hox c;
    private final hox d;
    private final hox e;
    private final hox f;
    private final hox g;
    private final hox h;
    private final hox i;
    private final hox j;
    private final hox k;
    private final hox l;
    private final hox m;

    public fod(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        ije ijeVar = new ije(j);
        hsi hsiVar = hsi.a;
        this.a = new hpl(ijeVar, hsiVar);
        this.b = new hpl(new ije(j2), hsiVar);
        this.c = new hpl(new ije(j3), hsiVar);
        this.d = new hpl(new ije(j4), hsiVar);
        this.e = new hpl(new ije(j5), hsiVar);
        this.f = new hpl(new ije(j6), hsiVar);
        this.g = new hpl(new ije(j7), hsiVar);
        this.h = new hpl(new ije(j8), hsiVar);
        this.i = new hpl(new ije(j9), hsiVar);
        this.j = new hpl(new ije(j10), hsiVar);
        this.k = new hpl(new ije(j11), hsiVar);
        this.l = new hpl(new ije(j12), hsiVar);
        this.m = new hpl(true, hsiVar);
    }

    public final long a() {
        return ((ije) this.e.a()).i;
    }

    public final long b() {
        return ((ije) this.g.a()).i;
    }

    public final long c() {
        return ((ije) this.j.a()).i;
    }

    public final long d() {
        return ((ije) this.l.a()).i;
    }

    public final long e() {
        return ((ije) this.h.a()).i;
    }

    public final long f() {
        return ((ije) this.i.a()).i;
    }

    public final long g() {
        return ((ije) this.k.a()).i;
    }

    public final long h() {
        return ((ije) this.a.a()).i;
    }

    public final long i() {
        return ((ije) this.b.a()).i;
    }

    public final long j() {
        return ((ije) this.c.a()).i;
    }

    public final long k() {
        return ((ije) this.d.a()).i;
    }

    public final long l() {
        return ((ije) this.f.a()).i;
    }

    public final boolean m() {
        return ((Boolean) this.m.a()).booleanValue();
    }

    public final String toString() {
        return "Colors(primary=" + ((Object) ije.g(h())) + ", primaryVariant=" + ((Object) ije.g(i())) + ", secondary=" + ((Object) ije.g(j())) + ", secondaryVariant=" + ((Object) ije.g(k())) + ", background=" + ((Object) ije.g(a())) + ", surface=" + ((Object) ije.g(l())) + ", error=" + ((Object) ije.g(b())) + ", onPrimary=" + ((Object) ije.g(e())) + ", onSecondary=" + ((Object) ije.g(f())) + ", onBackground=" + ((Object) ije.g(c())) + ", onSurface=" + ((Object) ije.g(g())) + ", onError=" + ((Object) ije.g(d())) + ", isLight=" + m() + ')';
    }
}
