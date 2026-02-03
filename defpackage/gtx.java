package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtx implements dvi {
    public fdae a;
    public fdap b;
    public final float[] c;
    public boolean d;
    public dwm e;
    public final fdae f;
    public final duv g;
    public final dok h;
    public final fddm i;
    public final hri j;
    public final hri k;
    public final hri l;
    public final hri m;
    private boolean n;
    private final hox o;
    private final hrg p;
    private final hrg q;
    private final hrg r;

    public gtx() {
        this(0.0f, null, new fddm(0.0f, 1.0f));
    }

    @Override // defpackage.dvi
    public final Object a(dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        Object objA = fdjy.a(new gtv(this, dodVar, fdatVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final float b() {
        fddm fddmVar = this.i;
        return gtt.a(((Number) fddmVar.c()).floatValue(), ((Number) fddmVar.b()).floatValue(), fddu.e(d(), ((Number) fddmVar.c()).floatValue(), ((Number) fddmVar.b()).floatValue()));
    }

    public final float c() {
        return this.q.c();
    }

    public final float d() {
        return this.p.c();
    }

    public final int e() {
        return this.m.c();
    }

    public final int f() {
        return this.l.c();
    }

    public final int g() {
        return this.j.c();
    }

    public final void h(float f) {
        float fMax;
        float fMin;
        if (this.e == dwm.a) {
            fMax = Math.max(this.k.c() - (e() / 2.0f), 0.0f);
            fMin = Math.min(e() / 2.0f, fMax);
        } else {
            fMax = Math.max(g() - (f() / 2.0f), 0.0f);
            fMin = Math.min(f() / 2.0f, fMax);
        }
        this.q.h(c() + f + this.r.c());
        j(0.0f);
        float fC = c();
        fddm fddmVar = this.i;
        izp izpVar = gtt.a;
        float fB = gtt.b(fMin, fMax, fC, ((Number) fddmVar.c()).floatValue(), ((Number) fddmVar.b()).floatValue());
        if (fB == d()) {
            return;
        }
        fdap fdapVar = this.b;
        if (fdapVar != null) {
            fdapVar.invoke(Float.valueOf(fB));
        } else {
            k(fB);
        }
    }

    public final void i(boolean z) {
        this.o.b(Boolean.valueOf(z));
    }

    public final void j(float f) {
        this.r.h(f);
    }

    public final void k(float f) {
        if (this.n) {
            fddm fddmVar = this.i;
            f = fddu.e(f, ((Number) fddmVar.c()).floatValue(), ((Number) fddmVar.b()).floatValue());
            ((Number) fddmVar.c()).floatValue();
            ((Number) fddmVar.b()).floatValue();
            izp izpVar = gtt.a;
        }
        this.p.h(f);
    }

    public final boolean l() {
        return ((Boolean) this.o.a()).booleanValue();
    }

    public gtx(float f, fdae fdaeVar, fddm fddmVar) {
        this.a = fdaeVar;
        this.i = fddmVar;
        this.p = new hpf(f);
        this.n = true;
        izp izpVar = gtt.a;
        this.c = new float[0];
        this.j = new hph(0);
        this.k = new hph(0);
        this.l = new hph(0);
        this.m = new hph(0);
        this.e = dwm.b;
        this.o = new hpl(false, hsi.a);
        this.f = new fdae() { // from class: gtu
            @Override // defpackage.fdae
            public final Object invoke() {
                fdae fdaeVar2;
                gtx gtxVar = this.a;
                if (!gtxVar.l() && (fdaeVar2 = gtxVar.a) != null) {
                    fdaeVar2.invoke();
                }
                return fctx.a;
            }
        };
        this.q = new hpf(gtt.b(((Number) fddmVar.c()).floatValue(), ((Number) fddmVar.b()).floatValue(), f, 0.0f, 0.0f));
        this.r = new hpf(0.0f);
        this.g = new gtw(this);
        this.h = new dok();
    }
}
