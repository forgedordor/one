package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypi {
    public static final Float a(hox hoxVar) {
        return (Float) hoxVar.a();
    }

    public static final void b(final ypn ypnVar, final Long l, final dikr dikrVar, final ikp ikpVar, final boolean z, final boolean z2, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1046802024);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ypnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(l) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dikrVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.E(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final yov yovVar = ypnVar.a;
            final hsf hsfVarB = hsb.b(yovVar.f(), false, null, hmlVarC, 2);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(yovVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD2 = hmlVarC.D(yovVar);
            Object objS2 = hmwVar.S();
            if (zD2 || objS2 == hmk.a) {
                hpl hplVar2 = new hpl(false, hsi.a);
                hmwVar.af(hplVar2);
                objS2 = hplVar2;
            }
            final hox hoxVar2 = (hox) objS2;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD3 = hmlVarC.D(yovVar);
            Object objS3 = hmwVar.S();
            if (zD3 || objS3 == hmk.a) {
                objS3 = new fdap() { // from class: ypa
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        Float f = (Float) obj;
                        f.floatValue();
                        if (ypi.e(hsfVarB)) {
                            hox hoxVar3 = hoxVar2;
                            yovVar.g();
                            ypi.d(hoxVar3, true);
                        }
                        ypi.c(hoxVar, f);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            fdap fdapVar = (fdap) objS3;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD4 = hmlVarC.D(yovVar);
            int i3 = i2;
            Object objS4 = hmwVar.S();
            if (zD4 || objS4 == hmk.a) {
                objS4 = new fdae() { // from class: ypb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        yov yovVar2 = yovVar;
                        hox hoxVar3 = hoxVar;
                        Float fA = ypi.a(hoxVar3);
                        if (fA != null) {
                            yovVar2.l(fA.floatValue());
                        }
                        hox hoxVar4 = hoxVar2;
                        ypi.c(hoxVar3, null);
                        if (((Boolean) hoxVar4.a()).booleanValue()) {
                            yovVar2.h();
                            ypi.d(hoxVar4, false);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            fdae fdaeVar = (fdae) objS4;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD5 = hmlVarC.D(yovVar);
            Object objS5 = hmwVar.S();
            if (zD5 || objS5 == hmk.a) {
                objS5 = new fdae() { // from class: ypc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        yov yovVar2 = yovVar;
                        if (ypi.e(hsfVarB)) {
                            yovVar2.g();
                        } else {
                            yovVar2.h();
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            fdae fdaeVar2 = (fdae) objS5;
            hmwVar.ab();
            dikq dikqVar = new dikq(g(a(hoxVar), l, yovVar.a()), fdapVar, fdaeVar);
            List list = ypnVar.k;
            dipu dipuVar = (list == null || list.isEmpty()) ? null : new dipu(list, new dipk(dikqVar.a, dikqVar.b, dikqVar.c));
            String str = ypnVar.c;
            dlro dlroVar = ypnVar.j;
            boolean z3 = ypnVar.d;
            boolean zE = e(hsfVarB);
            long jH = h(a(hoxVar), l, yovVar.a());
            dkpc dkpcVar = ypnVar.l;
            ypm ypmVar = ypnVar.m;
            boolean z4 = ypmVar.a;
            boolean z5 = ypmVar.b;
            dioo.a(new diot(new dikl(str, dikrVar, dlroVar, z, z2, z3, zE, jH, fdaeVar2, dikqVar, null, dkpcVar, dipuVar, null, new diki(z4, z5), 9216), new dios(z4, z5), str, z3, (fdae) null, 48), null, ikpVar, hmlVarC, (i3 >> 3) & 896, 2);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ypd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ypn ypnVar2 = ypnVar;
                    Long l2 = l;
                    dikr dikrVar2 = dikrVar;
                    ikp ikpVar2 = ikpVar;
                    boolean z6 = z;
                    ypi.b(ypnVar2, l2, dikrVar2, ikpVar2, z6, z2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(hox hoxVar, Float f) {
        hoxVar.b(f);
    }

    public static final void d(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final boolean e(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }

    public static final void f(final ypn ypnVar, ikp ikpVar, boolean z, hml hmlVar, final int i) {
        int i2;
        int i3;
        dlps dlpsVar;
        hsf hsfVar;
        dikr dikrVar;
        hsf hsfVar2;
        dipu dipuVar;
        hml hmlVar2;
        final ikp ikpVar2 = ikpVar;
        final boolean z2 = z;
        hml hmlVarC = hmlVar.c(-1444251918);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ypnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ikpVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new ype(ypnVar, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(ypnVar, (fdat) objS, hmlVarC);
            yov yovVar = ypnVar.a;
            hsf hsfVarB = hsb.b(yovVar.e(), false, null, hmlVarC, 2);
            hsf hsfVarB2 = hsb.b(yovVar.c(), false, null, hmlVarC, 2);
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            Object obj = hmk.a;
            if (objS2 == obj) {
                objS2 = new yph(null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hsf hsfVarA = hrt.a(false, (fdat) objS2, hmlVarC);
            hmlVarC.v(5004770);
            Object objS3 = hmwVar.S();
            if (i4 == 4 || objS3 == obj) {
                objS3 = new fdap() { // from class: yox
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((hny) obj2).getClass();
                        return new ypg(ypnVar);
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            hob.c(yovVar, (fdap) objS3, hmlVarC);
            yqc yqcVar = ypnVar.h;
            hmlVarC.v(5004770);
            Object objS4 = hmwVar.S();
            if (i4 == 4 || objS4 == obj) {
                objS4 = new fdap() { // from class: yoy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((hny) obj2).getClass();
                        yqc yqcVar2 = ypnVar.h;
                        if (yqcVar2 != null) {
                            yqcVar2.e.invoke();
                        }
                        return new ypf();
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            hob.c(yqcVar, (fdap) objS4, hmlVarC);
            dlpo dlpoVar = yqcVar != null ? yqcVar.b : null;
            hmlVarC.v(-651632974);
            if (yqcVar == null) {
                i3 = i2;
                dlpsVar = null;
            } else {
                hmlVarC.v(-651631616);
                dlps dlpqVar = yqcVar.a;
                if (dlpqVar instanceof dlpq) {
                    hmlVarC.v(283257466);
                    i3 = i2;
                    dlpqVar = new dlpq(((Boolean) hsfVarA.a()).booleanValue(), ((Number) hsb.b(yqcVar.d, Float.valueOf(0.0f), null, hmlVarC, 2).a()).floatValue(), ((dlpq) dlpqVar).a);
                    hmwVar.ab();
                } else {
                    i3 = i2;
                    if (dlpqVar instanceof dlpp) {
                        hmlVarC.v(191250495);
                        dlpp dlppVar = (dlpp) dlpqVar;
                        dlpp dlppVar2 = new dlpp(dlppVar.a, ((Boolean) hro.a(yqcVar.c, hmlVarC).a()).booleanValue(), dlppVar.c, dlppVar.d);
                        hmwVar.ab();
                        dlpqVar = dlppVar2;
                    } else {
                        hmlVarC.v(283267718);
                        hmwVar.ab();
                    }
                }
                hmwVar.ab();
                dlpsVar = dlpqVar;
            }
            hmwVar.ab();
            dikr dikrVar2 = dlpsVar != null ? new dikr(dlpsVar, dlpoVar) : null;
            hsf hsfVarB3 = hsb.b(yovVar.b(), null, null, hmlVarC, 2);
            hsf hsfVarB4 = hsb.b(yovVar.d(), null, null, hmlVarC, 2);
            List list = ypnVar.k;
            if (list == null || list.isEmpty()) {
                hsfVar = hsfVarB3;
                dikrVar = dikrVar2;
                hsfVar2 = hsfVarB4;
                dipuVar = null;
            } else {
                hsfVar = hsfVarB3;
                dikrVar = dikrVar2;
                hsfVar2 = hsfVarB4;
                dipuVar = new dipu(list, new dipk(g(i(hsfVarB4), j(hsfVar), yovVar.a()), 6));
            }
            if (((Boolean) hsfVarB2.a()).booleanValue()) {
                hmlVarC.v(-651592278);
                boolean z3 = ypnVar.e;
                boolean z4 = ypnVar.d;
                String str = ypnVar.c;
                ypm ypmVar = ypnVar.m;
                boolean z5 = ypmVar.a;
                boolean z6 = ypmVar.b;
                diot diotVar = new diot(new dikg(str, dikrVar, z3, z2, z4, null, new diki(z5, z6), 196), new dios(z5, z6), str, z4, (fdae) null, 48);
                ikpVar2 = ikpVar;
                hmlVar2 = hmlVarC;
                dioo.a(diotVar, null, ikpVar2, hmlVar2, (i3 << 3) & 896, 2);
                hmwVar.ab();
            } else {
                dikr dikrVar3 = dikrVar;
                if (((Boolean) hsfVarB.a()).booleanValue()) {
                    hmlVarC.v(-651556574);
                    boolean z7 = ypnVar.e;
                    boolean z8 = ypnVar.d;
                    String str2 = ypnVar.c;
                    long jH = h(i(hsfVar2), j(hsfVar), yovVar.a());
                    dkpc dkpcVar = ypnVar.l;
                    ypm ypmVar2 = ypnVar.m;
                    boolean z9 = ypmVar2.a;
                    boolean z10 = ypmVar2.b;
                    diot diotVar2 = new diot(new dikp(str2, dikrVar3, ypnVar.j, z7, z, z8, dkpcVar, jH, dipuVar, new diki(z9, z10)), new dios(z9, z10), str2, z8, (fdae) null, 48);
                    ikpVar2 = ikpVar;
                    hmlVar2 = hmlVarC;
                    dioo.a(diotVar2, null, ikpVar2, hmlVar2, (i3 << 3) & 896, 2);
                    hmwVar.ab();
                } else if (ypnVar.f) {
                    hmlVarC.v(-651509174);
                    boolean z11 = ypnVar.e;
                    boolean z12 = ypnVar.d;
                    String str3 = ypnVar.c;
                    dlro dlroVar = ypnVar.j;
                    dkpc dkpcVar2 = ypnVar.l;
                    ypm ypmVar3 = ypnVar.m;
                    boolean z13 = ypmVar3.a;
                    boolean z14 = ypmVar3.b;
                    diot diotVar3 = new diot(new dikn(str3, dikrVar3, dlroVar, z11, z, z12, dkpcVar2, new diki(z13, z14)), new dios(z13, z14), str3, z12, (fdae) null, 48);
                    ikpVar2 = ikpVar;
                    hmlVar2 = hmlVarC;
                    dioo.a(diotVar3, null, ikpVar2, hmlVar2, (i3 << 3) & 896, 2);
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-651471893);
                    ikpVar2 = ikpVar;
                    b(ypnVar, j(hsfVar), dikrVar3, ikpVar2, ypnVar.e, z, hmlVarC, ((i3 << 6) & 7168) | i4 | ((i3 << 9) & 458752));
                    hmlVar2 = hmlVarC;
                    z2 = z;
                    hmwVar.ab();
                }
            }
            z2 = z;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: yoz
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ypn ypnVar2 = ypnVar;
                    ikp ikpVar3 = ikpVar2;
                    int i5 = i;
                    ypi.f(ypnVar2, ikpVar3, z2, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final float g(Float f, Long l, long j) {
        if (f != null) {
            return f.floatValue();
        }
        if (j <= 0 || l == null) {
            return 0.0f;
        }
        return l.longValue() / j;
    }

    private static final long h(Float f, Long l, long j) {
        if (f != null) {
            return (long) (f.floatValue() * j);
        }
        return l == null ? j : l.longValue();
    }

    private static final Float i(hsf hsfVar) {
        return (Float) hsfVar.a();
    }

    private static final Long j(hsf hsfVar) {
        return (Long) hsfVar.a();
    }
}
