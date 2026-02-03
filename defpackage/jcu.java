package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcu implements imz, imw {
    public jbp a;
    private final imu b;

    public jcu() {
        this(null);
    }

    @Override // defpackage.imz
    public final void A(iiy iiyVar, float f, long j, long j2, ina inaVar) {
        this.b.A(iiyVar, f, j, j2, inaVar);
    }

    @Override // defpackage.imz
    public final void B(long j, float f, float f2, long j2, long j3, ina inaVar) {
        this.b.B(j, f, f2, j2, j3, inaVar);
    }

    @Override // defpackage.imz
    public final void C(iiy iiyVar, float f, long j, ina inaVar) {
        this.b.C(iiyVar, f, j, inaVar);
    }

    @Override // defpackage.imz
    public final void D(ijp ijpVar, long j, long j2, float f, ina inaVar, ijf ijfVar, int i, int i2) {
        this.b.D(ijpVar, j, j2, f, inaVar, ijfVar, i, i2);
    }

    @Override // defpackage.imz
    public final void E(ijp ijpVar, ina inaVar, ijf ijfVar) {
        imu imuVar = this.b;
        imuVar.a.c.t(ijpVar, imu.v(imuVar, null, inaVar, 1.0f, ijfVar, 3));
    }

    @Override // defpackage.imz
    public final void F(iiy iiyVar, long j, long j2, float f, float f2) {
        imu imuVar = this.b;
        ijb ijbVar = imuVar.a.c;
        ikb ikbVarP = imuVar.p();
        if (iiyVar != null) {
            iiyVar.a(imy.b(imuVar), ikbVarP, f2);
        } else if (ikbVarP.a() != f2) {
            ikbVarP.i(f2);
        }
        iii iiiVar = (iii) ikbVarP;
        if (!fdbq.f(iiiVar.d, null)) {
            ikbVarP.l(null);
        }
        if (!iis.b(iiiVar.b, 3)) {
            ikbVarP.j(3);
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
        ijbVar.e(j, j2, ikbVarP);
    }

    @Override // defpackage.imz
    public final void G(long j, long j2, long j3, float f, float f2, int i) {
        this.b.G(j, j2, j3, f, f2, i);
    }

    @Override // defpackage.imz
    public final void H(ikd ikdVar, long j, float f, ina inaVar) {
        this.b.H(ikdVar, j, f, inaVar);
    }

    @Override // defpackage.imz
    public final void I(iiy iiyVar, long j, long j2, long j3, float f, ina inaVar) {
        int i = (int) (j & 4294967295L);
        imu imuVar = this.b;
        int i2 = (int) (j >> 32);
        imuVar.a.c.h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), imu.v(imuVar, iiyVar, inaVar, f, null, 3));
    }

    @Override // defpackage.imz
    public final long a() {
        return imy.a(this.b);
    }

    @Override // defpackage.imz
    public final long b() {
        return imy.b(this.b);
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.b.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.b.ee();
    }

    @Override // defpackage.kiy
    public final float eg(long j) {
        return kix.a(this.b, j);
    }

    @Override // defpackage.kio
    public final float eh(float f) {
        return kin.a(this.b, f);
    }

    @Override // defpackage.kio
    public final float el(int i) {
        return kin.b(this.b, i);
    }

    @Override // defpackage.kio
    public final float em(long j) {
        return kin.c(this.b, j);
    }

    @Override // defpackage.kio
    public final float en(float f) {
        return kin.d(this.b, f);
    }

    @Override // defpackage.kio
    public final int eo(long j) {
        return kin.e(this.b, j);
    }

    @Override // defpackage.kio
    public final int ep(float f) {
        return kin.f(this.b, f);
    }

    @Override // defpackage.kio
    public final long eq(long j) {
        return kin.g(this.b, j);
    }

    @Override // defpackage.kio
    public final long er(long j) {
        return kin.h(this.b, j);
    }

    @Override // defpackage.kiy
    public final long es(float f) {
        return kix.b(this.b, f);
    }

    @Override // defpackage.kio
    public final long et(float f) {
        return kin.i(this.b, f);
    }

    @Override // defpackage.imw
    public final void p() {
        ijb ijbVarB = t().b();
        jbp jbpVar = this.a;
        if (jbpVar == null) {
            itw.b("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new fcta();
        }
        icr icrVarA = jbpVar.D().w;
        if (icrVarA == null || (icrVarA.u & 4) == 0) {
            icrVarA = null;
        } else {
            while (icrVarA != null) {
                int i = icrVarA.t;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    icrVarA = icrVarA.w;
                }
            }
            icrVarA = null;
        }
        if (icrVarA == null) {
            jer jerVarE = jbg.e(jbpVar, 4);
            if (jerVarE.A() == jbpVar.D()) {
                jerVarE = jerVarE.w;
                jerVarE.getClass();
            }
            jerVarE.F(ijbVarB, t().a);
            return;
        }
        hum humVar = null;
        while (icrVarA != null) {
            if (icrVarA instanceof jbp) {
                jbp jbpVar2 = (jbp) icrVarA;
                ini iniVar = t().a;
                jer jerVarE2 = jbg.e(jbpVar2, 4);
                jerVarE2.t.t().u(ijbVarB, kjh.d(jerVarE2.c), jerVarE2, jbpVar2, iniVar);
            } else if ((icrVarA.t & 4) != 0 && (icrVarA instanceof jbi)) {
                int i2 = 0;
                for (icr icrVar = ((jbi) icrVarA).E; icrVar != null; icrVar = icrVar.w) {
                    if ((icrVar.t & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            icrVarA = icrVar;
                        } else {
                            if (humVar == null) {
                                humVar = new hum(new icr[16]);
                            }
                            if (icrVarA != null) {
                                humVar.n(icrVarA);
                            }
                            humVar.n(icrVar);
                            icrVarA = null;
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            icrVarA = jbg.a(humVar);
        }
    }

    @Override // defpackage.imz
    public final kji q() {
        return this.b.q();
    }

    @Override // defpackage.imz
    public final void r(long j, long j2, long j3, float f, ina inaVar, ijf ijfVar, int i) {
        this.b.r(j, j2, j3, f, inaVar, ijfVar, i);
    }

    @Override // defpackage.imz
    public final void s(ini iniVar, long j, fdap fdapVar) {
        iniVar.g(this, q(), j, new jct(this, this.a, fdapVar));
    }

    @Override // defpackage.imz
    public final imt t() {
        return this.b.b;
    }

    public final void u(ijb ijbVar, long j, jer jerVar, jbp jbpVar, ini iniVar) {
        jbp jbpVar2 = this.a;
        this.a = jbpVar;
        imu imuVar = this.b;
        imt imtVar = imuVar.b;
        kji kjiVarQ = jerVar.q();
        kio kioVarC = imtVar.c();
        kji kjiVarD = imtVar.d();
        ijb ijbVarB = imtVar.b();
        long jA = imtVar.a();
        ini iniVar2 = imtVar.a;
        imtVar.f(jerVar);
        imtVar.g(kjiVarQ);
        imtVar.e(ijbVar);
        imtVar.h(j);
        imtVar.a = iniVar;
        ijbVar.l();
        try {
            jbpVar.r(this);
            ijbVar.j();
            imt imtVar2 = imuVar.b;
            imtVar2.f(kioVarC);
            imtVar2.g(kjiVarD);
            imtVar2.e(ijbVarB);
            imtVar2.h(jA);
            imtVar2.a = iniVar2;
            this.a = jbpVar2;
        } catch (Throwable th) {
            ijbVar.j();
            imt imtVar3 = imuVar.b;
            imtVar3.f(kioVarC);
            imtVar3.g(kjiVarD);
            imtVar3.e(ijbVarB);
            imtVar3.h(jA);
            imtVar3.a = iniVar2;
            throw th;
        }
    }

    @Override // defpackage.imz
    public final void w(long j, float f, long j2, float f2, ina inaVar, int i) {
        this.b.w(j, f, j2, f2, inaVar, i);
    }

    @Override // defpackage.imz
    public final void x(ikd ikdVar, iiy iiyVar, float f, ina inaVar, int i) {
        this.b.x(ikdVar, iiyVar, f, inaVar, i);
    }

    @Override // defpackage.imz
    public final void y(iiy iiyVar, long j, long j2, float f, ina inaVar, int i) {
        this.b.y(iiyVar, j, j2, f, inaVar, i);
    }

    @Override // defpackage.imz
    public final void z(long j, long j2, long j3, long j4, ina inaVar, float f, int i) {
        this.b.z(j, j2, j3, j4, inaVar, f, i);
    }

    public /* synthetic */ jcu(byte[] bArr) {
        this.b = new imu();
    }
}
