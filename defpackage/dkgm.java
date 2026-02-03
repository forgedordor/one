package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgm {
    public static final float a(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final float b(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final int c(hox hoxVar) {
        return ((Number) hoxVar.a()).intValue();
    }

    public static final int d(hsf hsfVar) {
        return ((Number) hsfVar.a()).intValue();
    }

    public static final int e(hox hoxVar) {
        return ((Number) hoxVar.a()).intValue();
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [dew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [dew, java.lang.Object] */
    public static final void f(final dkgv dkgvVar, ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        Object objE;
        int i3;
        hox hoxVar;
        Object objE2;
        Float f;
        dib dibVar;
        int i4;
        int i5;
        Object objE3;
        hzg hzgVarA;
        fdap fdapVarK;
        hzg hzgVarB;
        dkgvVar.getClass();
        fdatVar.getClass();
        hml hmlVarC = hmlVar.c(2057031737);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.B(dkgvVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 384) == 0) {
            i6 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i6 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = ics.e;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(0, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar2 = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                hpl hplVar2 = new hpl(0, hsi.a);
                hmwVar.af(hplVar2);
                objS2 = hplVar2;
            }
            hox hoxVar3 = (hox) objS2;
            hmwVar.ab();
            if (c(hoxVar2) == 0 && e(hoxVar3) == 0) {
                int i7 = i6 & 112;
                int i8 = i6 >> 6;
                hmlVarC.v(439497386);
                hmlVarC.v(-1633490746);
                Object objS3 = hmwVar.S();
                if (objS3 == hmk.a) {
                    objS3 = new dkge(hoxVar2, hoxVar3);
                    hmwVar.af(objS3);
                }
                ixm ixmVar = (ixm) objS3;
                hmwVar.ab();
                int iA = dkfv.a(hmg.b(hmlVarC));
                hxi hxiVarAk = hmwVar.ak();
                ics icsVarB = icj.b(hmlVarC, icsVar2);
                int i9 = (((((i8 & 14) | 384) | i7) << 6) & 896) | 6;
                fdae fdaeVar = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVar, jbb.e);
                hsk.b(hmlVarC, hxiVarAk, jbb.d);
                fdat fdatVar2 = jbb.f;
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                    Integer numValueOf = Integer.valueOf(iA);
                    hmwVar.af(numValueOf);
                    hmlVarC.h(numValueOf, fdatVar2);
                }
                hsk.b(hmlVarC, icsVarB, jbb.c);
                fdatVar.a(hmlVarC, Integer.valueOf((i9 >> 6) & 14));
                hmlVarC.n();
                hmwVar.ab();
            } else {
                hmlVarC.v(440744516);
                hmlVarC.v(1849434622);
                Object objS4 = hmwVar.S();
                if (objS4 == obj) {
                    objS4 = new dfw(false);
                    hmwVar.af(objS4);
                }
                dfw dfwVar = (dfw) objS4;
                hmwVar.ab();
                dfwVar.d(true);
                dhk dhkVarB = dhy.b(dfwVar, "transition bubble", hmlVarC, 48, 0);
                dkgk dkgkVar = dkgk.a;
                dib dibVar2 = diu.a;
                if (dhkVarB.t()) {
                    hmlVarC.v(1666852333);
                    hmwVar.ab();
                    objE = dhkVarB.e();
                } else {
                    hmlVarC.v(1666598288);
                    boolean zD = hmlVarC.D(dhkVarB);
                    objE = hmwVar.S();
                    if (zD || objE == obj) {
                        hzgVarA = hzf.a();
                        fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                        hzgVarB = hzf.b(hzgVarA);
                        try {
                            Object objE4 = dhkVarB.e();
                            hzf.e(hzgVarA, hzgVarB, fdapVarK);
                            hmwVar.af(objE4);
                            objE = objE4;
                        } finally {
                        }
                    }
                    hmwVar.ab();
                }
                boolean zBooleanValue = ((Boolean) objE).booleanValue();
                hmlVarC.v(237296477);
                float f2 = true != zBooleanValue ? 1.0f : 0.0f;
                hmwVar.ab();
                Float fValueOf = Float.valueOf(f2);
                boolean zD2 = hmlVarC.D(dhkVarB);
                Object objS5 = hmwVar.S();
                if (zD2 || objS5 == hmk.a) {
                    dkfx dkfxVar = new dkfx(dhkVarB);
                    hxn hxnVar = hrp.a;
                    objS5 = new hnt(dkfxVar, null);
                    hmwVar.af(objS5);
                }
                boolean zBooleanValue2 = ((Boolean) ((hsf) objS5).a()).booleanValue();
                hmlVarC.v(237296477);
                float f3 = true != zBooleanValue2 ? 1.0f : 0.0f;
                hmwVar.ab();
                Float fValueOf2 = Float.valueOf(f3);
                boolean zD3 = hmlVarC.D(dhkVarB);
                Object objS6 = hmwVar.S();
                if (zD3 || objS6 == hmk.a) {
                    dkfy dkfyVar = new dkfy(dhkVarB);
                    hxn hxnVar2 = hrp.a;
                    i3 = i6;
                    hnt hntVar = new hnt(dkfyVar, null);
                    hmwVar.af(hntVar);
                    objS6 = hntVar;
                } else {
                    i3 = i6;
                }
                hsf hsfVarF = dhy.f(dhkVarB, fValueOf, fValueOf2, dkgkVar.a(((hsf) objS6).a(), hmlVarC, 0), dibVar2, hmlVarC, 0);
                dkgl dkglVar = dkgl.a;
                dib dibVar3 = diu.a;
                if (dhkVarB.t()) {
                    hoxVar = hoxVar2;
                    hmlVarC.v(1666852333);
                    hmwVar.ab();
                    objE2 = dhkVarB.e();
                } else {
                    hmlVarC.v(1666598288);
                    boolean zD4 = hmlVarC.D(dhkVarB);
                    objE2 = hmwVar.S();
                    if (zD4 || objE2 == hmk.a) {
                        hzgVarA = hzf.a();
                        fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                        hzgVarB = hzf.b(hzgVarA);
                        hoxVar = hoxVar2;
                        try {
                            Object objE5 = dhkVarB.e();
                            hzf.e(hzgVarA, hzgVarB, fdapVarK);
                            hmwVar.af(objE5);
                            objE2 = objE5;
                        } finally {
                        }
                    } else {
                        hoxVar = hoxVar2;
                    }
                    hmwVar.ab();
                }
                boolean zBooleanValue3 = ((Boolean) objE2).booleanValue();
                hmlVarC.v(-126512911);
                float f4 = (!zBooleanValue3 || a(hsfVarF) > 0.1f) ? 0.0f : 1.0f;
                hmwVar.ab();
                Float fValueOf3 = Float.valueOf(f4);
                boolean zD5 = hmlVarC.D(dhkVarB);
                Object objS7 = hmwVar.S();
                if (zD5 || objS7 == hmk.a) {
                    dkfz dkfzVar = new dkfz(dhkVarB);
                    hxn hxnVar3 = hrp.a;
                    hnt hntVar2 = new hnt(dkfzVar, null);
                    hmwVar.af(hntVar2);
                    objS7 = hntVar2;
                }
                boolean zBooleanValue4 = ((Boolean) ((hsf) objS7).a()).booleanValue();
                hmlVarC.v(-126512911);
                float f5 = (!zBooleanValue4 || a(hsfVarF) > 0.1f) ? 0.0f : 1.0f;
                hmwVar.ab();
                Float fValueOf4 = Float.valueOf(f5);
                boolean zD6 = hmlVarC.D(dhkVarB);
                Object objS8 = hmwVar.S();
                if (zD6 || objS8 == hmk.a) {
                    dkga dkgaVar = new dkga(dhkVarB);
                    hxn hxnVar4 = hrp.a;
                    f = fValueOf3;
                    objS8 = new hnt(dkgaVar, null);
                    hmwVar.af(objS8);
                } else {
                    f = fValueOf3;
                }
                hsf hsfVarF2 = dhy.f(dhkVarB, f, fValueOf4, dkglVar.a(((hsf) objS8).a(), hmlVarC, 0), dibVar3, hmlVarC, 0);
                dkgj dkgjVar = dkgj.a;
                dib dibVar4 = diu.b;
                if (dhkVarB.t()) {
                    dibVar = dibVar4;
                    i4 = i3 & 112;
                    i5 = i3 >> 6;
                    hmlVarC.v(1666852333);
                    hmwVar.ab();
                    objE3 = dhkVarB.e();
                } else {
                    hmlVarC.v(1666598288);
                    boolean zD7 = hmlVarC.D(dhkVarB);
                    objE3 = hmwVar.S();
                    if (zD7 || objE3 == hmk.a) {
                        hzgVarA = hzf.a();
                        fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
                        hzgVarB = hzf.b(hzgVarA);
                        dibVar = dibVar4;
                        try {
                            Object objE6 = dhkVarB.e();
                            hzf.e(hzgVarA, hzgVarB, fdapVarK);
                            hmwVar.af(objE6);
                            objE3 = objE6;
                        } finally {
                        }
                    } else {
                        dibVar = dibVar4;
                    }
                    i4 = i3 & 112;
                    i5 = i3 >> 6;
                    hmwVar.ab();
                }
                int i10 = i4;
                int i11 = i5;
                boolean zBooleanValue5 = ((Boolean) objE3).booleanValue();
                hmlVarC.v(-1542204915);
                int iE = zBooleanValue5 ? e(hoxVar3) : c(hoxVar);
                hmwVar.ab();
                Integer numValueOf2 = Integer.valueOf(iE);
                boolean zD8 = hmlVarC.D(dhkVarB);
                Object objS9 = hmwVar.S();
                if (zD8 || objS9 == hmk.a) {
                    dkgb dkgbVar = new dkgb(dhkVarB);
                    hxn hxnVar5 = hrp.a;
                    objS9 = new hnt(dkgbVar, null);
                    hmwVar.af(objS9);
                }
                boolean zBooleanValue6 = ((Boolean) ((hsf) objS9).a()).booleanValue();
                hmlVarC.v(-1542204915);
                int iE2 = zBooleanValue6 ? e(hoxVar3) : c(hoxVar);
                hmwVar.ab();
                Integer numValueOf3 = Integer.valueOf(iE2);
                boolean zD9 = hmlVarC.D(dhkVarB);
                Object objS10 = hmwVar.S();
                if (zD9 || objS10 == hmk.a) {
                    dkgc dkgcVar = new dkgc(dhkVarB);
                    hxn hxnVar6 = hrp.a;
                    objS10 = new hnt(dkgcVar, null);
                    hmwVar.af(objS10);
                }
                hsf hsfVarF3 = dhy.f(dhkVarB, numValueOf2, numValueOf3, dkgjVar.a(((hsf) objS10).a(), hmlVarC, 0), dibVar, hmlVarC, 0);
                hmlVarC.v(-1224400529);
                boolean zD10 = hmlVarC.D(hsfVarF) | hmlVarC.D(hsfVarF3) | ((i3 & 14) == 4) | hmlVarC.D(hsfVarF2);
                Object objS11 = hmwVar.S();
                if (zD10 || objS11 == hmk.a) {
                    objS11 = new dkgi(hsfVarF, hsfVarF3, dkgvVar, hsfVarF2);
                    hmwVar.af(objS11);
                }
                ixm ixmVar2 = (ixm) objS11;
                hmwVar.ab();
                int iA2 = dkfv.a(hmg.b(hmlVarC));
                hxi hxiVarAk2 = hmwVar.ak();
                ics icsVarB2 = icj.b(hmlVarC, icsVar2);
                int i12 = ((((i11 & 14) | i10) << 6) & 896) | 6;
                fdae fdaeVar2 = jbb.a;
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar2);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVar2, jbb.e);
                hsk.b(hmlVarC, hxiVarAk2, jbb.d);
                fdat fdatVar3 = jbb.f;
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                    Integer numValueOf4 = Integer.valueOf(iA2);
                    hmwVar.af(numValueOf4);
                    hmlVarC.h(numValueOf4, fdatVar3);
                }
                hsk.b(hmlVarC, icsVarB2, jbb.c);
                fdatVar.a(hmlVarC, Integer.valueOf((i12 >> 6) & 14));
                hmlVarC.n();
                hmwVar.ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkfw
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dkgv dkgvVar2 = dkgvVar;
                    ics icsVar3 = icsVar2;
                    int i13 = i;
                    dkgm.f(dkgvVar2, icsVar3, fdatVar, (hml) obj2, hpy.a(i13 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
