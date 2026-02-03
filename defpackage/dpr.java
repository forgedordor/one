package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpr extends jbi implements jbd, jew {
    public dop a;
    public dki b;
    private dyb c;
    private dwm d;
    private boolean e;
    private boolean f;
    private dvj g;
    private dsj h;
    private boolean i;
    private dop j;
    private dxz k;
    private jbf l;
    private boolean m;
    private ebk n;

    public dpr(dyb dybVar, dwm dwmVar, boolean z, boolean z2, dvj dvjVar, ebk ebkVar, dsj dsjVar, boolean z3, dop dopVar) {
        this.c = dybVar;
        this.d = dwmVar;
        this.e = z;
        this.f = z2;
        this.g = dvjVar;
        this.n = ebkVar;
        this.h = dsjVar;
        this.i = z3;
        this.j = dopVar;
    }

    private final void g() {
        jbf jbfVar = this.l;
        if (jbfVar != null) {
            if (jbfVar.D().C) {
                return;
            }
            N(jbfVar);
            return;
        }
        if (this.i) {
            jex.a(this, new fdae() { // from class: dpq
                @Override // defpackage.fdae
                public final Object invoke() {
                    dpr dprVar = this.a;
                    dprVar.b = (dki) jbe.a(dprVar, dor.a);
                    dki dkiVar = dprVar.b;
                    dprVar.a = dkiVar != null ? dkiVar.a() : null;
                    return fctx.a;
                }
            });
        }
        dop dopVarA = a();
        if (dopVarA != null) {
            jbf jbfVarC = dopVarA.c();
            if (jbfVarC.D().C) {
                return;
            }
            N(jbfVarC);
            this.l = jbfVarC;
        }
    }

    public final dop a() {
        return this.i ? this.a : this.j;
    }

    @Override // defpackage.icr
    public final void dL() {
        boolean zE = e();
        if (this.m != zE) {
            this.m = zE;
            f(this.c, this.d, this.i, a(), this.e, this.f, this.g, this.n, this.h);
        }
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.icr
    public final void dU() {
        this.m = e();
        g();
        if (this.k == null) {
            dxz dxzVar = new dxz(this.c, a(), this.g, this.d, this.e, this.m, this.n, this.h);
            N(dxzVar);
            this.k = dxzVar;
        }
    }

    public final boolean e() {
        kji kjiVarH = kji.a;
        if (this.C) {
            kjiVarH = jbg.h(this);
        }
        dwm dwmVar = this.d;
        boolean z = this.f;
        return (kjiVarH != kji.b || dwmVar == dwm.a) ? !z : z;
    }

    public final void f(dyb dybVar, dwm dwmVar, boolean z, dop dopVar, boolean z2, boolean z3, dvj dvjVar, ebk ebkVar, dsj dsjVar) {
        boolean z4;
        this.c = dybVar;
        this.d = dwmVar;
        boolean z5 = true;
        if (this.i != z) {
            this.i = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (fdbq.f(this.j, dopVar)) {
            z5 = false;
        } else {
            this.j = dopVar;
        }
        if (z4 || (z5 && !z)) {
            jbf jbfVar = this.l;
            if (jbfVar != null) {
                M(jbfVar);
            }
            this.l = null;
            g();
        }
        this.e = z2;
        this.f = z3;
        this.g = dvjVar;
        this.n = ebkVar;
        this.h = dsjVar;
        boolean zE = e();
        this.m = zE;
        dxz dxzVar = this.k;
        if (dxzVar != null) {
            dxzVar.g(dybVar, dwmVar, a(), z2, zE, dvjVar, ebkVar, dsjVar);
        }
    }

    @Override // defpackage.jew
    public final void n() {
        dki dkiVar = (dki) jbe.a(this, dor.a);
        if (fdbq.f(dkiVar, this.b)) {
            return;
        }
        this.b = dkiVar;
        this.a = null;
        jbf jbfVar = this.l;
        if (jbfVar != null) {
            M(jbfVar);
        }
        this.l = null;
        g();
        dxz dxzVar = this.k;
        if (dxzVar != null) {
            dxzVar.g(this.c, this.d, a(), this.e, this.m, this.g, this.n, this.h);
        }
    }

    @Override // defpackage.icr
    public final void s() {
        jbf jbfVar = this.l;
        if (jbfVar != null) {
            M(jbfVar);
        }
    }
}
