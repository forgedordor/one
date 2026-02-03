package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiz extends hgr {
    private fdlr F;
    public ddp n;
    public ddp o;
    public ddp p;
    public float q;
    public final ies r;

    public hiz(long j, long j2, ind indVar, ind indVar2, float f, float f2, float f3, float f4) {
        super(j, j2, indVar, indVar2, f, f3, f4);
        this.q = fddu.e(f2, 0.0f, 1.0f);
        ies iesVarD = ifb.d(new fdap() { // from class: hio
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                float f5;
                fdlr fdlrVar;
                final hiz hizVar = this.a;
                iew iewVar = (iew) obj;
                final float fD = kin.d(iewVar, hizVar.f);
                final float fD2 = kin.d(iewVar, hizVar.e);
                boolean z = false;
                final boolean z2 = Float.compare(hizVar.g, 0.0f) > 0 && hizVar.q > 0.0f;
                hic hicVar = hizVar.h;
                long jA = iewVar.a();
                float f6 = ((hgr) hizVar).c.a;
                float f7 = hizVar.q;
                if (f7 > 0.0f && f7 < 1.0f) {
                    z = true;
                }
                if (fD <= 0.0f) {
                    throw new IllegalArgumentException("Wavelength should be greater than zero");
                }
                if (ihz.b(jA) <= 0.0f) {
                    throw new IllegalArgumentException("Size min dimension should be greater than zero");
                }
                if (ihz.e(jA, hicVar.a) && fD == hicVar.b) {
                    if (z && hicVar.e == null) {
                        lty ltyVar = hicVar.c;
                        ltyVar.getClass();
                        lty ltyVar2 = hicVar.d;
                        ltyVar2.getClass();
                        hicVar.e = new ltr(ltyVar, ltyVar2);
                    }
                    f5 = 0.0f;
                } else {
                    f5 = 0.0f;
                    int iMax = Math.max(5, (int) Math.round((((ihz.b(jA) / 2.0f) - (f6 / 2.0f)) * 6.283185307179586d) / fD));
                    hri hriVar = hicVar.f;
                    if (iMax != hriVar.c()) {
                        hicVar.c = lua.a(iMax, 14).c();
                        hicVar.d = lua.b(iMax, 0.75f, new lsz(0.35f, 0.4f), new lsz(0.5f, 2), 226).c();
                        if (z) {
                            lty ltyVar3 = hicVar.c;
                            ltyVar3.getClass();
                            lty ltyVar4 = hicVar.d;
                            ltyVar4.getClass();
                            hicVar.e = new ltr(ltyVar3, ltyVar4);
                        }
                    }
                    hicVar.a = new ihz(jA);
                    hicVar.b = fD;
                    hriVar.i(iMax);
                }
                int i = hizVar.l;
                hri hriVar2 = hicVar.f;
                if (i != hriVar2.c()) {
                    hizVar.l = fddu.f(hriVar2.c(), 5);
                }
                if (hizVar.q > f5 && ((fdlrVar = hizVar.k) == null || fdlrVar.y())) {
                    hizVar.f();
                }
                return iewVar.p(new fdap() { // from class: hip
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        float f8;
                        float f9;
                        hiz hizVar2;
                        float f10;
                        float f11;
                        boolean z3;
                        imw imwVar;
                        imw imwVar2 = (imw) obj2;
                        hiz hizVar3 = hizVar;
                        ddp ddpVar = hizVar3.n;
                        float fFloatValue = ddpVar != null ? ((Number) ddpVar.d()).floatValue() : 0.0f;
                        ddp ddpVar2 = hizVar3.o;
                        float fFloatValue2 = ddpVar2 != null ? ((Number) ddpVar2.d()).floatValue() : 0.0f;
                        ddp ddpVar3 = hizVar3.p;
                        float fFloatValue3 = ddpVar3 != null ? ((Number) ddpVar3.d()).floatValue() : 0.1f;
                        boolean z4 = z2;
                        hib hibVar = hizVar3.i;
                        long jB = imwVar2.b();
                        hiq hiqVar = new hiq(hizVar3);
                        hir hirVar = new hir(hizVar3);
                        float f12 = hizVar3.q;
                        float fC = z4 ? hizVar3.m.c() : 0.0f;
                        float f13 = fD2;
                        float f14 = fD;
                        ind indVar3 = ((hgr) hizVar3).c;
                        ind indVar4 = hizVar3.d;
                        if (ihz.f(hibVar.c, jB) && hibVar.a == f12 && hibVar.b == f14 && fdbq.f(hibVar.g, indVar3) && fdbq.f(hibVar.h, indVar4) && hibVar.e == f13 && hibVar.k == z4) {
                            hizVar2 = hizVar3;
                            f8 = fFloatValue;
                            f9 = fFloatValue2;
                            f11 = fFloatValue3;
                            f10 = fC;
                            z3 = false;
                        } else {
                            float f15 = fC;
                            f8 = fFloatValue;
                            f9 = fFloatValue2;
                            boolean zA = iku.a(indVar3.c, 0);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jB & 4294967295L));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB >> 32));
                            hibVar.r = (!(zA && iku.a(indVar4.c, 0)) && fIntBitsToFloat <= fIntBitsToFloat2) ? Math.max(indVar3.a / 2.0f, indVar4.a / 2.0f) : 0.0f;
                            float[] fArr = hibVar.l;
                            iju.c(fArr);
                            float f16 = indVar3.a;
                            iju.g(fArr, fIntBitsToFloat2 - f16, fIntBitsToFloat - f16);
                            ikd ikdVar = hibVar.n;
                            ikdVar.l();
                            Float fValueOf = Float.valueOf(f12);
                            Float fValueOf2 = Float.valueOf(f14);
                            Float fValueOf3 = Float.valueOf(f16);
                            hizVar2 = hizVar3;
                            f10 = f15;
                            hiqVar.a(fValueOf, fValueOf2, fValueOf3, new ihz(jB), Boolean.valueOf(z4), ikdVar);
                            hib.a(ikdVar, jB, fArr);
                            iim iimVar = hibVar.s;
                            f11 = fFloatValue3;
                            iimVar.b(ikdVar, true);
                            hibVar.i = z4 ? iimVar.a() / 2.0f : iimVar.a();
                            ikd ikdVar2 = hibVar.o;
                            ikdVar2.l();
                            hirVar.a(fValueOf, fValueOf2, fValueOf3, new ihz(jB), ikdVar2);
                            hib.a(ikdVar2, jB, fArr);
                            iim iimVar2 = hibVar.t;
                            iimVar2.b(ikdVar2, true);
                            hibVar.j = iimVar2.a();
                            hibVar.c = jB;
                            hibVar.a = f12;
                            hibVar.b = f14;
                            hibVar.g = indVar3;
                            hibVar.h = indVar4;
                            hibVar.e = f13;
                            hibVar.k = z4;
                            z3 = true;
                        }
                        if (ihz.f(hibVar.c, 9205357640488583168L)) {
                            throw new IllegalArgumentException("updateDrawPaths was called before updateFullPaths");
                        }
                        if (z3 || hibVar.d != f11 || hibVar.f != f10) {
                            ikd ikdVar3 = hibVar.q;
                            ikdVar3.l();
                            ikd ikdVar4 = hibVar.p;
                            ikdVar4.l();
                            float f17 = hibVar.i;
                            float f18 = f17 * 0.0f;
                            float f19 = f11 * f17;
                            float fMin = Math.min(f19, hibVar.e);
                            float fMin2 = Math.min(f19, hibVar.r);
                            float f20 = fMin2 + fMin2 + fMin;
                            if (hibVar.k) {
                                float f21 = f10 < 0.0f ? 0.0f : f10;
                                if (f21 > 1.0f) {
                                    f21 = 1.0f;
                                }
                                float f22 = hibVar.i * f21;
                                hibVar.s.c(f18 + f22, f19 + f22, ikdVar4);
                                float f23 = (f21 * 360.0f) % 360.0f;
                                if (f23 != 0.0f) {
                                    float f24 = -Float.intBitsToFloat((int) (hibVar.n.b().a() >> 32));
                                    ikdVar4.o((Float.floatToRawIntBits(-Float.intBitsToFloat((int) (r2.a() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(f24) << 32));
                                    float[] fArr2 = hibVar.m;
                                    iju.c(fArr2);
                                    iju.d(fArr2, -f23);
                                    ikdVar4.n(fArr2);
                                    ikdVar4.o((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.a() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.a() & 4294967295L))) & 4294967295L));
                                }
                            } else {
                                hibVar.s.c(f18, f19, ikdVar4);
                            }
                            float f25 = hibVar.j;
                            if (f25 > 0.0f) {
                                hibVar.t.c((f11 * f25) + f20, f25 - f20, ikdVar3);
                            }
                            hibVar.d = f11;
                            hibVar.f = f10;
                        }
                        imt imtVarT = imwVar2.t();
                        long jA2 = imtVarT.a();
                        imtVarT.b().l();
                        try {
                            imv imvVar = imtVarT.c;
                            imvVar.c(f8 + f9 + 90.0f, iia.b(imvVar.a()));
                            hiz hizVar4 = hizVar2;
                            long j3 = ((hgr) hizVar4).a;
                            long j4 = ((hgr) hizVar4).b;
                            ind indVar5 = ((hgr) hizVar4).c;
                            ind indVar6 = hizVar4.d;
                            long j5 = ije.g;
                            if (fcts.a(j4, j5) || fcts.a(j4, ije.h)) {
                                imwVar = imwVar2;
                            } else {
                                imwVar = imwVar2;
                                imy.h(imwVar, hibVar.q, j4, indVar6, 52);
                            }
                            if (!fcts.a(j3, j5) && !fcts.a(j3, ije.h)) {
                                imy.h(imwVar, hibVar.p, j3, indVar5, 52);
                            }
                            imtVarT.b().j();
                            imtVarT.h(jA2);
                            return fctx.a;
                        } catch (Throwable th) {
                            imtVarT.b().j();
                            imtVarT.h(jA2);
                            throw th;
                        }
                    }
                });
            }
        });
        N(iesVarD);
        this.r = iesVarD;
    }

    @Override // defpackage.hgr
    public final void a() {
        jbq.a(this.r);
    }

    @Override // defpackage.icr
    public final void dU() {
        fdlr fdlrVar = this.F;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        if (this.C && fdjy.g(E())) {
            ddp ddpVarA = this.n;
            if (ddpVarA == null) {
                ddpVarA = ddq.a(0.0f);
            }
            this.n = ddpVarA;
            ddp ddpVarA2 = this.o;
            if (ddpVarA2 == null) {
                ddpVarA2 = ddq.a(0.0f);
            }
            this.o = ddpVarA2;
            ddp ddpVarA3 = this.p;
            if (ddpVarA3 == null) {
                ddpVarA3 = ddq.a(0.1f);
            }
            this.p = ddpVarA3;
            this.F = fdil.d(E(), null, null, new hiy(this, null), 3);
        }
    }

    @Override // defpackage.hgr
    public final void e() {
        this.r.a();
    }

    @Override // defpackage.hgr
    protected final boolean h() {
        return this.q > 0.0f;
    }

    @Override // defpackage.icr
    public final void s() {
        this.n = null;
        this.o = null;
        this.p = null;
        this.l = -1;
    }
}
