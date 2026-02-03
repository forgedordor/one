package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fra {
    public static final float a(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [dew, java.lang.Object] */
    public static final void b(final dfw dfwVar, final hox hoxVar, final dpn dpnVar, final ics icsVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1077393800);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dfwVar) : hmlVarC.F(dfwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dpnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dhk dhkVarB = dhy.b(dfwVar, "DropDownMenu", hmlVarC, (i2 & 14) | 48, 0);
            fqx fqxVar = fqx.a;
            dib dibVar = diu.a;
            boolean zBooleanValue = ((Boolean) dhkVarB.e()).booleanValue();
            hmlVarC.v(-1833869404);
            float f = true != zBooleanValue ? 0.8f : 1.0f;
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            Float fValueOf = Float.valueOf(f);
            boolean zBooleanValue2 = ((Boolean) dhkVarB.f()).booleanValue();
            hmlVarC.v(-1833869404);
            float f2 = true == zBooleanValue2 ? 1.0f : 0.8f;
            hmwVar.ab();
            final hsf hsfVarF = dhy.f(dhkVarB, fValueOf, Float.valueOf(f2), fqxVar.a(dhkVarB.d(), hmlVarC, 0), dibVar, hmlVarC, 0);
            fqw fqwVar = fqw.a;
            boolean zBooleanValue3 = ((Boolean) dhkVarB.e()).booleanValue();
            hmlVarC.v(-1578341192);
            float f3 = true != zBooleanValue3 ? 0.0f : 1.0f;
            hmwVar.ab();
            Float fValueOf2 = Float.valueOf(f3);
            int i4 = i2;
            boolean zBooleanValue4 = ((Boolean) dhkVarB.f()).booleanValue();
            hmlVarC.v(-1578341192);
            float f4 = true != zBooleanValue4 ? 0.0f : 1.0f;
            hmwVar.ab();
            boolean z = true;
            final hsf hsfVarF2 = dhy.f(dhkVarB, fValueOf2, Float.valueOf(f4), fqwVar.a(dhkVarB.d(), hmlVarC, 0), dibVar, hmlVarC, 0);
            ico icoVar = ics.e;
            boolean zD = hmlVarC.D(hsfVarF) | hmlVarC.D(hsfVarF2);
            if ((i4 & 112) != 32) {
                z = false;
            }
            Object objS = hmwVar.S();
            if ((zD | z) || objS == hmk.a) {
                objS = new fdap() { // from class: fqt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        hsf hsfVar = hsfVarF;
                        ikl iklVar = (ikl) obj;
                        iklVar.x(fra.a(hsfVar));
                        iklVar.y(fra.a(hsfVar));
                        iklVar.a(((Number) hsfVarF2.a()).floatValue());
                        iklVar.C(((ikz) hoxVar.a()).b);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            foc.a(ijn.a(icoVar, (fdap) objS), 0L, 8.0f, hxe.d(-707086267, new fqv(icsVar, dpnVar, fdauVar), hmlVarC), hmlVarC, 1769472, 30);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fqu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dfw dfwVar2 = dfwVar;
                    hox hoxVar2 = hoxVar;
                    dpn dpnVar2 = dpnVar;
                    ics icsVar2 = icsVar;
                    fra.b(dfwVar2, hoxVar2, dpnVar2, icsVar2, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fdae fdaeVar, final ics icsVar, final egc egcVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-674391690);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(egcVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
        if ((i2 & 74899) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarC = efy.c(egq.w(egq.d(dli.c(icsVar, null, fsd.a(true, 0.0f, 6), true, null, null, fdaeVar, 24), 1.0f), 112.0f, 48.0f, 280.0f, 0.0f, 8), egcVar);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = hmg.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fvx.a(fqq.c(hmlVarC).a, hxe.d(-77738101, new fqz(fdauVar, egp.a), hmlVarC), hmlVarC, 48);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fqs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    ics icsVar2 = icsVar;
                    egc egcVar2 = egcVar;
                    fra.c(fdaeVar3, icsVar2, egcVar2, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
