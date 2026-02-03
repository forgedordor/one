package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imu implements imz {
    public final ims a = new ims(imx.a, kji.a, inb.a);
    public final imt b = new imt(this);
    private ikb c;
    private ikb d;

    private final ikb J(iiy iiyVar, ina inaVar, float f, ijf ijfVar, int i, int i2) {
        ikb ikbVarK = K(inaVar);
        if (iiyVar != null) {
            iiyVar.a(imy.b(this), ikbVarK, f);
        } else {
            if (((iii) ikbVarK).c != null) {
                ikbVarK.n(null);
            }
            long jG = ikbVarK.g();
            long j = ije.a;
            if (!fcts.a(jG, j)) {
                ikbVarK.k(j);
            }
            if (ikbVarK.a() != f) {
                ikbVarK.i(f);
            }
        }
        iii iiiVar = (iii) ikbVarK;
        if (!fdbq.f(iiiVar.d, ijfVar)) {
            ikbVarK.l(ijfVar);
        }
        if (!iis.b(iiiVar.b, i)) {
            ikbVarK.j(i);
        }
        if (!ijl.a(ikbVarK.d(), i2)) {
            ikbVarK.m(i2);
        }
        return ikbVarK;
    }

    private final ikb K(ina inaVar) {
        if (fdbq.f(inaVar, inc.a)) {
            ikb ikbVar = this.c;
            if (ikbVar != null) {
                return ikbVar;
            }
            iii iiiVar = new iii();
            iiiVar.s(0);
            this.c = iiiVar;
            return iiiVar;
        }
        if (!(inaVar instanceof ind)) {
            throw new fctg();
        }
        ikb ikbVarP = p();
        float fC = ikbVarP.c();
        ind indVar = (ind) inaVar;
        float f = indVar.a;
        if (fC != f) {
            ikbVarP.r(f);
        }
        int iE = ikbVarP.e();
        int i = indVar.c;
        if (!iku.a(iE, i)) {
            ikbVarP.o(i);
        }
        float fB = ikbVarP.b();
        float f2 = indVar.b;
        if (fB != f2) {
            ikbVarP.q(f2);
        }
        int iF = ikbVarP.f();
        int i2 = indVar.d;
        if (!ikv.a(iF, i2)) {
            ikbVarP.p(i2);
        }
        if (!fdbq.f(null, null)) {
            ikbVarP.t();
        }
        return ikbVarP;
    }

    private static final long L(long j, float f) {
        return f == 1.0f ? j : ijg.f(ije.d(j), ije.c(j), ije.b(j), ije.a(j) * f, ije.f(j));
    }

    static /* synthetic */ ikb u(imu imuVar, long j, ina inaVar, float f, ijf ijfVar, int i) {
        ikb ikbVarK = imuVar.K(inaVar);
        long jL = L(j, f);
        long jG = ikbVarK.g();
        long j2 = ije.a;
        if (!fcts.a(jG, jL)) {
            ikbVarK.k(jL);
        }
        iii iiiVar = (iii) ikbVarK;
        if (iiiVar.c != null) {
            ikbVarK.n(null);
        }
        if (!fdbq.f(iiiVar.d, ijfVar)) {
            ikbVarK.l(ijfVar);
        }
        if (!iis.b(iiiVar.b, i)) {
            ikbVarK.j(i);
        }
        if (!ijl.a(ikbVarK.d(), 1)) {
            ikbVarK.m(1);
        }
        return ikbVarK;
    }

    public static /* synthetic */ ikb v(imu imuVar, iiy iiyVar, ina inaVar, float f, ijf ijfVar, int i) {
        return imuVar.J(iiyVar, inaVar, f, ijfVar, i, 1);
    }

    @Override // defpackage.imz
    public final void A(iiy iiyVar, float f, long j, long j2, ina inaVar) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        this.a.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)), 270.0f, f, v(this, iiyVar, inaVar, 1.0f, null, 3));
    }

    @Override // defpackage.imz
    public final void B(long j, float f, float f2, long j2, long j3, ina inaVar) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, u(this, j, inaVar, 1.0f, null, 3));
    }

    @Override // defpackage.imz
    public final void C(iiy iiyVar, float f, long j, ina inaVar) {
        this.a.c.d(j, f, v(this, iiyVar, inaVar, 1.0f, null, 3));
    }

    @Override // defpackage.imz
    public final void D(ijp ijpVar, long j, long j2, float f, ina inaVar, ijf ijfVar, int i, int i2) {
        this.a.c.u(ijpVar, j, j2, J(null, inaVar, f, ijfVar, i, i2));
    }

    @Override // defpackage.imz
    public final void E(ijp ijpVar, ina inaVar, ijf ijfVar) {
        throw null;
    }

    @Override // defpackage.imz
    public final void F(iiy iiyVar, long j, long j2, float f, float f2) {
        throw null;
    }

    @Override // defpackage.imz
    public final void G(long j, long j2, long j3, float f, float f2, int i) {
        ijb ijbVar = this.a.c;
        ikb ikbVarP = p();
        long jL = L(j, f2);
        long jG = ikbVarP.g();
        long j4 = ije.a;
        if (!fcts.a(jG, jL)) {
            ikbVarP.k(jL);
        }
        iii iiiVar = (iii) ikbVarP;
        if (iiiVar.c != null) {
            ikbVarP.n(null);
        }
        if (!fdbq.f(iiiVar.d, null)) {
            ikbVarP.l(null);
        }
        if (!iis.b(iiiVar.b, i)) {
            ikbVarP.j(i);
        }
        if (ikbVarP.c() != f) {
            ikbVarP.r(f);
        }
        if (ikbVarP.b() != 4.0f) {
            ikbVarP.q(4.0f);
        }
        if (!iku.a(ikbVarP.e(), 0)) {
            ikbVarP.o(0);
        }
        if (!ikv.a(ikbVarP.f(), 0)) {
            ikbVarP.p(0);
        }
        if (!fdbq.f(null, null)) {
            ikbVarP.t();
        }
        if (!ijl.a(ikbVarP.d(), 1)) {
            ikbVarP.m(1);
        }
        ijbVar.e(j2, j3, ikbVarP);
    }

    @Override // defpackage.imz
    public final void H(ikd ikdVar, long j, float f, ina inaVar) {
        this.a.c.f(ikdVar, u(this, j, inaVar, f, null, 3));
    }

    @Override // defpackage.imz
    public final void I(iiy iiyVar, long j, long j2, long j3, float f, ina inaVar) {
        throw null;
    }

    @Override // defpackage.imz
    public final /* synthetic */ long a() {
        return imy.a(this);
    }

    @Override // defpackage.imz
    public final /* synthetic */ long b() {
        return imy.b(this);
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.a.a.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.a.a.ee();
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

    public final ikb p() {
        ikb ikbVar = this.d;
        if (ikbVar != null) {
            return ikbVar;
        }
        iii iiiVar = new iii();
        iiiVar.s(1);
        this.d = iiiVar;
        return iiiVar;
    }

    @Override // defpackage.imz
    public final kji q() {
        return this.a.b;
    }

    @Override // defpackage.imz
    public final void r(long j, long j2, long j3, float f, ina inaVar, ijf ijfVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.g(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L)), u(this, j, inaVar, f, ijfVar, i));
    }

    @Override // defpackage.imz
    public final /* synthetic */ void s(ini iniVar, long j, fdap fdapVar) {
        throw null;
    }

    @Override // defpackage.imz
    public final imt t() {
        return this.b;
    }

    @Override // defpackage.imz
    public final void w(long j, float f, long j2, float f2, ina inaVar, int i) {
        this.a.c.d(j2, f, u(this, j, inaVar, f2, null, i));
    }

    @Override // defpackage.imz
    public final void x(ikd ikdVar, iiy iiyVar, float f, ina inaVar, int i) {
        this.a.c.f(ikdVar, v(this, iiyVar, inaVar, f, null, i));
    }

    @Override // defpackage.imz
    public final void y(iiy iiyVar, long j, long j2, float f, ina inaVar, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = (int) (j >> 32);
        this.a.c.g(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 & 4294967295L)), v(this, iiyVar, inaVar, f, null, i));
    }

    @Override // defpackage.imz
    public final void z(long j, long j2, long j3, long j4, ina inaVar, float f, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.h(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), u(this, j, inaVar, f, null, i));
    }
}
