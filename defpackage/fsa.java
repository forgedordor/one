package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsa {
    public static final den a = new den(0.2f, 0.0f, 0.8f, 1.0f);
    public static final den b = new den(0.4f, 0.0f, 1.0f, 1.0f);
    public static final den c = new den(0.0f, 0.0f, 0.65f, 1.0f);
    public static final den d = new den(0.1f, 0.0f, 0.45f, 1.0f);

    static {
        new den(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final float a(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final float b(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final float c(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final float d(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final void e(final ics icsVar, long j, long j2, hml hmlVar, final int i) {
        int i2;
        long j3;
        final long jF;
        final long j4;
        final long j5;
        hml hmlVarC = hmlVar.c(1501635280);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            j5 = j;
            j4 = j2;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                long jH = fqq.a(hmlVarC).h();
                j3 = jH;
                jF = ijg.f(ije.d(jH), ije.c(jH), ije.b(jH), 0.24f, ije.f(jH));
            } else {
                hmlVarC.s();
                j3 = j;
                jF = j2;
            }
            hmlVarC.l();
            dfm dfmVarB = dfq.b(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: frr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        dft dftVar = (dft) obj2;
                        den denVar = fsa.a;
                        dftVar.a = 1800;
                        dftVar.a(Float.valueOf(0.0f), 0).b = fsa.a;
                        dftVar.a(Float.valueOf(1.0f), 750);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            final hsf hsfVarA = dfq.a(dfmVarB, 0.0f, 1.0f, dea.d(dea.a((fdap) objS), 0, 0L, 6), hmlVarC);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: frs
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        dft dftVar = (dft) obj2;
                        den denVar = fsa.a;
                        dftVar.a = 1800;
                        dftVar.a(Float.valueOf(0.0f), 333).b = fsa.b;
                        dftVar.a(Float.valueOf(1.0f), 1183);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            final hsf hsfVarA2 = dfq.a(dfmVarB, 0.0f, 1.0f, dea.d(dea.a((fdap) objS2), 0, 0L, 6), hmlVarC);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new fdap() { // from class: frt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        dft dftVar = (dft) obj2;
                        den denVar = fsa.a;
                        dftVar.a = 1800;
                        dftVar.a(Float.valueOf(0.0f), 1000).b = fsa.c;
                        dftVar.a(Float.valueOf(1.0f), 1567);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            final long j6 = j3;
            final hsf hsfVarA3 = dfq.a(dfmVarB, 0.0f, 1.0f, dea.d(dea.a((fdap) objS3), 0, 0L, 6), hmlVarC);
            Object objS4 = hmwVar.S();
            if (objS4 == obj) {
                objS4 = new fdap() { // from class: fru
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        dft dftVar = (dft) obj2;
                        den denVar = fsa.a;
                        dftVar.a = 1800;
                        dftVar.a(Float.valueOf(0.0f), 1267).b = fsa.d;
                        dftVar.a(Float.valueOf(1.0f), 1800);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            final hsf hsfVarA4 = dfq.a(dfmVarB, 0.0f, 1.0f, dea.d(dea.a((fdap) objS4), 0, 0L, 6), hmlVarC);
            ics icsVarM = egq.m(dpa.a(efy.i(jsh.c(iwl.a(icsVar, new fdau() { // from class: fry
                @Override // defpackage.fdau
                public final Object a(Object obj2, Object obj3, Object obj4) {
                    ixp ixpVar = (ixp) obj2;
                    den denVar = fsa.a;
                    final int iEp = ixpVar.ep(10.0f);
                    long j7 = ((kil) obj4).a;
                    int i3 = iEp + iEp;
                    final iyl iylVarE = ((ixk) obj3).e(kim.h(j7, 0, i3));
                    return ixpVar.ej(iylVarE.a, iylVarE.b - i3, fcvp.a, new fdap() { // from class: frx
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj5) {
                            den denVar2 = fsa.a;
                            ((iyk) obj5).s(iylVarE, 0, -iEp, 0.0f);
                            return fctx.a;
                        }
                    });
                }
            }), true, new fdap() { // from class: frz
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    den denVar = fsa.a;
                    return fctx.a;
                }
            }), 0.0f, 10.0f, 1)), 240.0f, 4.0f);
            boolean zC = hmlVarC.C(jF) | hmlVarC.B(0) | hmlVarC.D(hsfVarA) | hmlVarC.D(hsfVarA2) | hmlVarC.C(j6) | hmlVarC.D(hsfVarA3) | hmlVarC.D(hsfVarA4);
            Object objS5 = hmwVar.S();
            if (zC || objS5 == obj) {
                fdap fdapVar = new fdap() { // from class: frv
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        long j7;
                        imz imzVar = (imz) obj2;
                        den denVar = fsa.a;
                        long jB = imzVar.b();
                        long j8 = jF;
                        long j9 = j6;
                        float fA = ihz.a(jB);
                        fsa.f(imzVar, 0.0f, 1.0f, j8, fA);
                        hsf hsfVar = hsfVarA;
                        float fD = fsa.d(hsfVar);
                        hsf hsfVar2 = hsfVarA2;
                        if (fD - fsa.a(hsfVar2) > 0.0f) {
                            j7 = j9;
                            fsa.f(imzVar, fsa.d(hsfVar), fsa.a(hsfVar2), j7, fA);
                        } else {
                            j7 = j9;
                        }
                        hsf hsfVar3 = hsfVarA4;
                        hsf hsfVar4 = hsfVarA3;
                        if (fsa.b(hsfVar4) - fsa.c(hsfVar3) > 0.0f) {
                            fsa.f(imzVar, fsa.b(hsfVar4), fsa.c(hsfVar3), j7, fA);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(fdapVar);
                objS5 = fdapVar;
            }
            dlb.a(icsVarM, (fdap) objS5, hmlVarC, 0);
            j4 = jF;
            j5 = j6;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: frw
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    hml hmlVar2 = (hml) obj2;
                    ((Integer) obj3).intValue();
                    ics icsVar2 = icsVar;
                    int i3 = i;
                    fsa.e(icsVar2, j5, j4, hmlVar2, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(imz imzVar, float f, float f2, long j, float f3) {
        float fC = ihz.c(imzVar.b());
        float fA = ihz.a(imzVar.b());
        float f4 = fA / 2.0f;
        boolean z = imzVar.q() == kji.a;
        float f5 = (z ? f : 1.0f - f2) * fC;
        float f6 = (z ? f2 : 1.0f - f) * fC;
        if (iku.a(0, 0) || fA > fC) {
            imy.l(imzVar, j, iht.a(f5, f4), iht.a(f6, f4), f3, 0, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        fddm fddmVar = new fddm(f7, fC - f7);
        float fFloatValue = ((Number) fddu.t(Float.valueOf(f5), fddmVar)).floatValue();
        float fFloatValue2 = ((Number) fddu.t(Float.valueOf(f6), fddmVar)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            imy.l(imzVar, j, iht.a(fFloatValue, f4), iht.a(fFloatValue2, f4), f3, 0, 480);
        }
    }
}
