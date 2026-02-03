package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwil {
    public static final hpt a = new hsg(new fdae() { // from class: cwhy
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = cwil.a;
            throw new IllegalStateException("PopupCameraLoader must be provided");
        }
    });

    public static final cwhg a(hsf hsfVar) {
        return (cwhg) hsfVar.a();
    }

    public static final void b(final fdvc fdvcVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1953143001);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hsf hsfVarA = hro.a(fdvcVar, hmlVarC);
            if (a(hsfVarA) == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cwhw
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int iA = hpy.a(i | 1);
                            cwil.b(fdvcVar, (hml) obj, iA);
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            cwhg cwhgVarA = a(hsfVarA);
            cwhgVarA.getClass();
            cwhs cwhsVar = cwhgVarA.a;
            cwfq cwfqVar = cwhsVar.h;
            cwhe cwheVar = cwfqVar != null ? cwfqVar.e : null;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            cwem cwemVar = cwhsVar.i;
            hmlVarC.v(-1746271574);
            boolean zD = hmlVarC.D(cwhsVar) | hmlVarC.B(cwheVar == null ? -1 : cwheVar.ordinal());
            Object objS2 = hmwVar.S();
            if (zD || objS2 == obj) {
                objS2 = new cwia(cwhsVar, cwheVar, hoxVar, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.f(cwheVar, cwemVar, (fdat) objS2, hmlVarC);
            dcr.b(null, hxe.d(-1090895593, new cwid(hoxVar, cwhsVar, hsfVarA), hmlVarC), hmlVarC, 48);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: cwhx
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int iA = hpy.a(i | 1);
                    cwil.b(fdvcVar, (hml) obj2, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dbs dbsVar, final cwhg cwhgVar, final cyg cygVar, hml hmlVar, final int i) {
        int i2;
        gun gunVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(714857759);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(cwhgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(cygVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            cwhs cwhsVar = cwhgVar.a;
            dpn dpnVarA = dpc.a(0, hmlVarC, 6, 0);
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            cwhr cwhrVar = cwhsVar.j;
            float fMin = Math.min(dpnVarA.c() / kioVar.en(true != cwhrVar.a ? 64.0f : 96.0f), 1.0f);
            hmlVarC.v(-216431086);
            if (cwhrVar.c) {
                hmlVarC.v(1849434622);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (objS == hmk.a) {
                    objS = new gun();
                    hmwVar.af(objS);
                }
                gunVar = (gun) objS;
                hmwVar.ab();
                e(cwhgVar.c, gunVar, hmlVarC, 48);
            } else {
                gunVar = null;
            }
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            ics icsVarA = dkl.a(egq.c(ics.e, 1.0f), ije.g, ikj.a);
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar2.S();
            if (objS2 == hmk.a) {
                objS2 = new fdap() { // from class: cwht
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        hpt hptVar = cwil.a;
                        jtoVar.getClass();
                        jtl.a(jtoVar);
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS2);
            }
            hmwVar2.ab();
            hmlVar2 = hmlVarC;
            dtgq.a(jsh.c(icsVarA, false, (fdap) objS2), hxe.d(-397212701, new cwie(dbsVar, cwhsVar, cygVar, fMin), hmlVarC), null, hxe.d(899242213, new cwif(gunVar), hmlVarC), null, 0, 0L, 0L, new eee(), hxe.d(-2097726418, new cwih(cwhgVar, dpnVarA, dbsVar, cwhsVar, cygVar, fMin), hmlVarC), hmlVar2, 805309488, 244);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwhu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbs dbsVar2 = dbsVar;
                    int i4 = i;
                    cwhg cwhgVar2 = cwhgVar;
                    int iA = hpy.a(i4 | 1);
                    cwil.c(dbsVar2, cwhgVar2, cygVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final cwhs cwhsVar, hml hmlVar, final int i) {
        int i2;
        cvwp cvwpVar;
        cvwp cvwpVar2;
        hml hmlVarC = hmlVar.c(1956115426);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(cwhsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1368747665);
            boolean z = cwhsVar.j.b;
            if (z && (cvwpVar2 = cwhsVar.e) != null) {
                cvwu.a(cvwpVar2, hmlVarC, 0);
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            cwjj.a(cwhsVar.b, hmlVarC, 0);
            cvwb.a(cwhsVar.d, hmlVarC, 0);
            cvxo.a(cwhsVar.c, hmlVarC, 0);
            cwey.a(cwhsVar.f, hmlVarC, 0);
            cvyy cvyyVar = (cvyy) hsb.b(cwhsVar.g, null, null, hmlVarC, 2).a();
            hmlVarC.v(-1368730078);
            if (cvyyVar != null) {
                cvzc.a(cvyyVar, hmlVarC, 0);
            }
            hmwVar.ab();
            if (!z && (cvwpVar = cwhsVar.e) != null) {
                cvwu.a(cvwpVar, hmlVarC, 0);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwhv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = hpy.a(i | 1);
                    cwil.d(cwhsVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final fduj fdujVar, final gun gunVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2125738159);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdujVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(gunVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(fdujVar) | ((i2 & 112) == 32);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new cwik(fdujVar, gunVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(gunVar, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwhz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    fduj fdujVar2 = fdujVar;
                    int iA = hpy.a(i4 | 1);
                    cwil.e(fdujVar2, gunVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }
}
