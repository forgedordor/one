package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faj {
    private final hox A;
    private final hox B;
    public fbf a;
    public final kdp b = new kdp();
    public kfl c;
    public final hox d;
    public final hox e;
    public ivy f;
    public final hox g;
    public juo h;
    public final hox i;
    public final hox j;
    public final hox k;
    public boolean l;
    public final fab m;
    public final hox n;
    public fdap o;
    public final fdap p;
    public final fdap q;
    public final fdap r;
    public final ikb s;
    public long t;
    public final jmj u;
    public final hpx v;
    private final hox w;
    private final hox x;
    private final hox y;
    private final hox z;

    public faj(fbf fbfVar, hpx hpxVar, jmj jmjVar) {
        this.a = fbfVar;
        this.v = hpxVar;
        this.u = jmjVar;
        hsi hsiVar = hsi.a;
        this.d = new hpl(false, hsiVar);
        this.e = new hpl(new kir(0.0f), hsiVar);
        this.g = new hpl(null, hsiVar);
        this.w = new hpl(ezm.a, hsiVar);
        this.x = new hpl(false, hsiVar);
        this.i = new hpl(false, hsiVar);
        this.j = new hpl(false, hsiVar);
        this.k = new hpl(false, hsiVar);
        this.l = true;
        this.y = new hpl(true, hsiVar);
        this.m = new fab(jmjVar);
        this.n = new hpl(false, hsiVar);
        this.z = new hpl(false, hsiVar);
        this.o = new fdap() { // from class: faf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return fctx.a;
            }
        };
        this.p = new fdap() { // from class: fag
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                kew kewVar = (kew) obj;
                String strA = kewVar.a();
                faj fajVar = this.a;
                juo juoVar = fajVar.h;
                if (!fdbq.f(strA, juoVar != null ? juoVar.b : null)) {
                    fajVar.h(ezm.a);
                    if (fajVar.q()) {
                        fajVar.j(false);
                    } else {
                        fajVar.f(false);
                    }
                }
                long j = jyo.a;
                fajVar.k(j);
                fajVar.g(j);
                fajVar.o.invoke(kewVar);
                fajVar.v.a();
                return fctx.a;
            }
        };
        this.q = new fdap() { // from class: fah
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                this.a.m.c(((kdw) obj).a);
                return fctx.a;
            }
        };
        this.r = new fdap() { // from class: fai
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(this.a.m.c(((kdw) obj).a));
            }
        };
        this.s = new iii();
        this.t = ije.h;
        long j = jyo.a;
        this.A = new hpl(new jyo(j), hsiVar);
        this.B = new hpl(new jyo(j), hsiVar);
    }

    public final long a() {
        return ((jyo) this.B.a()).b;
    }

    public final long b() {
        return ((jyo) this.A.a()).b;
    }

    public final ezm c() {
        return (ezm) this.w.a();
    }

    public final fda d() {
        return (fda) this.g.a();
    }

    public final ivy e() {
        ivy ivyVar = this.f;
        if (ivyVar == null || !ivyVar.u()) {
            return null;
        }
        return ivyVar;
    }

    public final void f(boolean z) {
        this.n.b(Boolean.valueOf(z));
    }

    public final void g(long j) {
        this.B.b(new jyo(j));
    }

    public final void h(ezm ezmVar) {
        this.w.b(ezmVar);
    }

    public final void i(boolean z) {
        this.y.b(Boolean.valueOf(z));
    }

    public final void j(boolean z) {
        this.z.b(Boolean.valueOf(z));
    }

    public final void k(long j) {
        this.A.b(new jyo(j));
    }

    public final void l(boolean z) {
        this.k.b(Boolean.valueOf(z));
    }

    public final void m(boolean z) {
        this.x.b(Boolean.valueOf(z));
    }

    public final void n(boolean z) {
        this.j.b(Boolean.valueOf(z));
    }

    public final void o(boolean z) {
        this.i.b(Boolean.valueOf(z));
    }

    public final boolean p() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.z.a()).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) this.x.a()).booleanValue();
    }

    public final boolean s() {
        return ((Boolean) this.y.a()).booleanValue();
    }
}
