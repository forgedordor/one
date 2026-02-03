package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqf {
    public static final void a(final dpll dpllVar, final ics icsVar, final dpqk dpqkVar, boolean z, hml hmlVar, final int i, final int i2) {
        int i3;
        dpqs dpqsVar;
        dpqs dpqsVar2;
        dppy dppyVar;
        boolean z2 = z;
        dpqkVar.getClass();
        int i4 = i & 6;
        hml hmlVarC = hmlVar.c(-1965804175);
        if (i4 == 0) {
            i3 = (true != hmlVarC.F(dpllVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != ((i & 512) == 0 ? hmlVarC.D(dpqkVar) : hmlVarC.F(dpqkVar)) ? 128 : 256;
        }
        int i5 = i2 & 4;
        boolean z3 = i5 == 0;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            z2 &= z3;
            if (Build.VERSION.SDK_INT >= 31) {
                ics icsVarA = ien.a(icsVar, ((Number) ddu.c((((Boolean) dpllVar.a.b()).booleanValue() && !z2) ? 1.0f : 0.0f, new dtgd().a(), null, hmlVarC, 0, 28).a()).floatValue());
                hmlVarC.v(-1719049184);
                float f = dpqkVar.b;
                if (f > 0.0f) {
                    Object obj = dpqkVar.a;
                    dpqsVar = new dpqs(obj instanceof dppy ? (dppy) obj : null, 1.0f - f);
                    Object obj2 = dpqkVar.c;
                    dpqsVar2 = new dpqs(obj2 instanceof dppy ? (dppy) obj2 : null, f);
                } else if (f < 0.0f) {
                    Object obj3 = dpqkVar.c;
                    dpqsVar = new dpqs(obj3 instanceof dppy ? (dppy) obj3 : null, -f);
                    Object obj4 = dpqkVar.a;
                    dpqsVar2 = new dpqs(obj4 instanceof dppy ? (dppy) obj4 : null, f + 1.0f);
                } else {
                    Object obj5 = dpqkVar.a;
                    dpqsVar = new dpqs(obj5 instanceof dppy ? (dppy) obj5 : null, 1.0f);
                    Object obj6 = dpqkVar.c;
                    dpqsVar2 = new dpqs(obj6 instanceof dppy ? (dppy) obj6 : null, 0.0f);
                }
                hmlVarC.v(1307071392);
                hmlVarC.v(1849434622);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                Object obj7 = hmk.a;
                if (objS == obj7) {
                    hpl hplVar = new hpl(null, hsi.a);
                    hmwVar.af(hplVar);
                    objS = hplVar;
                }
                hox hoxVar = (hox) objS;
                hmwVar.ab();
                hmlVarC.v(1849434622);
                Object objS2 = hmwVar.S();
                if (objS2 == obj7) {
                    hpl hplVar2 = new hpl(null, hsi.a);
                    hmwVar.af(hplVar2);
                    objS2 = hplVar2;
                }
                hox hoxVar2 = (hox) objS2;
                hmwVar.ab();
                dppy dppyVar2 = dpqsVar.a;
                if ((dppyVar2 == null || !fdbq.f(dppyVar2, f(hoxVar2))) && ((dppyVar = dpqsVar2.a) == null || !fdbq.f(dppyVar, e(hoxVar)))) {
                    dpqs dpqsVar3 = dpqsVar;
                    dpqsVar = dpqsVar2;
                    dpqsVar2 = dpqsVar3;
                }
                dppy dppyVar3 = dpqsVar2.a;
                if (dppyVar3 != null) {
                    hoxVar.b(dppyVar3);
                }
                dppy dppyVar4 = dpqsVar.a;
                if (dppyVar4 != null) {
                    hoxVar2.b(dppyVar4);
                }
                fcti fctiVar = new fcti(g(dpqsVar2, e(hoxVar)), g(dpqsVar, f(hoxVar2)));
                hmwVar.ab();
                hmwVar.ab();
                dpqs dpqsVar4 = (dpqs) fctiVar.a;
                dpqs dpqsVar5 = (dpqs) fctiVar.b;
                if (dpqsVar4.a != null || dpqsVar5.a != null) {
                    long j = glz.a(hmlVarC).v;
                    final long jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.4f, ije.f(j));
                    hmlVarC.v(5004770);
                    boolean zC = hmlVarC.C(jF);
                    Object objS3 = hmwVar.S();
                    if (zC || objS3 == obj7) {
                        objS3 = new fdap() { // from class: dpqb
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj8) {
                                imw imwVar = (imw) obj8;
                                imwVar.getClass();
                                imwVar.p();
                                imwVar.r(jF, 0L, (126 & 4) != 0 ? imy.c(imwVar.b(), 0L) : 0L, (126 & 8) != 0 ? 1.0f : 0.0f, (126 & 16) != 0 ? inc.a : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? 3 : 0);
                                return fctx.a;
                            }
                        };
                        hmwVar.af(objS3);
                    }
                    hmwVar.ab();
                    gvk.c(ifb.c(icsVarA, (fdap) objS3), null, 0L, 0L, 0.0f, 0.0f, null, hxe.d(-126540096, new dpqd(dpllVar, icsVarA, dpqsVar4, dpqsVar5), hmlVarC), hmlVarC, 126);
                    hmlVarC = hmlVarC;
                }
            }
        }
        final boolean z4 = z2;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpqc
                @Override // defpackage.fdat
                public final Object a(Object obj8, Object obj9) {
                    ((Integer) obj9).intValue();
                    dpll dpllVar2 = dpllVar;
                    ics icsVar2 = icsVar;
                    dpqk dpqkVar2 = dpqkVar;
                    dpqf.a(dpllVar2, icsVar2, dpqkVar2, z4, (hml) obj8, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(dpll dpllVar, final ics icsVar, dppy dppyVar, hml hmlVar, final int i) {
        int i2;
        final dpll dpllVar2;
        final dppy dppyVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1719099910);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dpllVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dppyVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            dpllVar2 = dpllVar;
            dppyVar2 = dppyVar;
        } else {
            dpllVar2 = dpllVar;
            dppyVar2 = dppyVar;
            dprw.a(dpllVar2, iep.a(icsVar, 50.0f, 50.0f, null), dppyVar2, iuz.a, "BlurredRendererBackground", hmlVarC, (i2 & 14) | 27648 | (i2 & 896), 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpqa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpll dpllVar3 = dpllVar2;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dpqf.b(dpllVar3, icsVar2, dppyVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dpll dpllVar, final ics icsVar, final dppy dppyVar, final float f, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1704380817);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dpllVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(dppyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cye.b(dppyVar != null, null, null, null, null, hxe.d(-614536377, new dpqe(dppyVar, dpllVar, icsVar, f), hmlVarC), hmlVarC, 196608, 30);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dppz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpll dpllVar2 = dpllVar;
                    ics icsVar2 = icsVar;
                    dppy dppyVar2 = dppyVar;
                    dpqf.c(dpllVar2, icsVar2, dppyVar2, f, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final dppy e(hox hoxVar) {
        return (dppy) hoxVar.a();
    }

    private static final dppy f(hox hoxVar) {
        return (dppy) hoxVar.a();
    }

    private static final dpqs g(dpqs dpqsVar, dppy dppyVar) {
        return (dpqsVar.a != null || dppyVar == null) ? dpqsVar : new dpqs(dppyVar, 0.0f);
    }
}
