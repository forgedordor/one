package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdf {
    public static final void a(final tcy tcyVar, final dew dewVar, final dew dewVar2, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1698094240);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(tcyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(dewVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dewVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1840106499);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(tcyVar, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            if (tcyVar != null && !fdbq.f(tcyVar, d(hoxVar))) {
                hoxVar.b(tcyVar);
            }
            fcti fctiVar = new fcti(d(hoxVar), Boolean.valueOf(tcyVar != null));
            hmwVar.ab();
            tcy tcyVar2 = (tcy) fctiVar.a;
            boolean zBooleanValue = ((Boolean) fctiVar.b).booleanValue();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: tdb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(-((Integer) obj2).intValue());
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            dap dapVarE = dae.e(dewVar, (fdap) objS2);
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new fdap() { // from class: tdc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        return Integer.valueOf(-((Integer) obj2).intValue());
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            cye.b(zBooleanValue, null, dapVarE, dae.h(dewVar2, (fdap) objS3), null, hxe.d(-351007864, new tde(tcyVar2, icsVar), hmlVarC), hmlVarC, 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: tdd
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    tcy tcyVar3 = tcyVar;
                    dew dewVar3 = dewVar;
                    dew dewVar4 = dewVar2;
                    tdf.a(tcyVar3, dewVar3, dewVar4, icsVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(tcy tcyVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final tcy tcyVar2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1916634779);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(tcyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            tcyVar2 = tcyVar;
            icsVar2 = icsVar;
        } else {
            dew dewVar = dljt.d(hmlVarC).a;
            dew dewVar2 = dljt.d(hmlVarC).b;
            hmlVarC.v(-1171157853);
            tcyVar2 = tcyVar;
            icsVar2 = icsVar;
            a(tcyVar2, dewVar, dewVar2, icsVar2, hmlVarC, (i2 & 14) | ((i2 << 6) & 7168));
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: tda
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tcy tcyVar3 = tcyVar2;
                    int i4 = i;
                    tdf.b(tcyVar3, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final tcy tcyVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(285504848);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(tcyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (tcyVar != null) {
            if (tcyVar instanceof teg) {
                hmlVarC.v(1604949418);
                tej.a((teg) tcyVar, icsVar, hmlVarC, i2 & 112);
                ((hmw) hmlVarC).ab();
            } else if (tcyVar instanceof tel) {
                hmlVarC.v(1604951375);
                ten.a((tel) tcyVar, icsVar, hmlVarC, i2 & 112);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-1786079182);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: tcz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tcy tcyVar2 = tcyVar;
                    int i4 = i;
                    tdf.c(tcyVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final tcy d(hox hoxVar) {
        return (tcy) hoxVar.a();
    }
}
