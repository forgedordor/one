package defpackage;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahy {
    public static final void a(final dlht dlhtVar, final dew dewVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-336694401);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlhtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(dewVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            Object obj2 = objS;
            if (objS == obj) {
                dfw dfwVar = new dfw(false);
                dfwVar.d(true);
                hmwVar.af(dfwVar);
                obj2 = dfwVar;
            }
            dfw dfwVar2 = (dfw) obj2;
            hmwVar.ab();
            ics icsVarA = ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() ? idb.a(ics.e, 2.0f) : ics.e;
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: aahu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        return Integer.valueOf(-((Integer) obj3).intValue());
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            cye.a(dfwVar2, icsVarA, dae.e(dewVar, (fdap) objS2), null, null, hxe.d(-826734681, new aahw(dlhtVar), hmlVarC), hmlVarC, 196608, 24);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aahv
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dlht dlhtVar2 = dlhtVar;
                    int i4 = i;
                    aahy.a(dlhtVar2, dewVar, (hml) obj3, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        fdaeVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1330771994);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(lvjVar) | ((i2 & 14) == 4);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: aahp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        final fdae fdaeVar2 = fdaeVar;
                        lvh lvhVar = new lvh() { // from class: aaho
                            @Override // defpackage.lvh
                            public final void gL(lvj lvjVar2, lva lvaVar) {
                                if (lvaVar == lva.ON_RESUME) {
                                    fdaeVar2.invoke();
                                }
                            }
                        };
                        lvj lvjVar2 = lvjVar;
                        lvjVar2.P().c(lvhVar);
                        return new aahx(lvjVar2, lvhVar);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.c(fdaeVar, (fdap) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aahq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aahy.b(fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dlht dlhtVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(531409262);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlhtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dlhs.c(dlhtVar, joj.a(idb.a(ics.e, 2.0f), "results_bar"), hmlVarC, (i2 & 14) | 48);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aahr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aahy.c(dlhtVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final aahn aahnVar, final ics icsVar, hcn hcnVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        List arrayList;
        final hcn hcnVar2 = hcnVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1639834145);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(aahnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(hcnVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hsf hsfVarA = hro.a(aahnVar.b, hmlVarC);
            hro.a(aahnVar.a, hmlVarC);
            hsf hsfVarA2 = hro.a(aahnVar.c, hmlVarC);
            hsf hsfVarA3 = hro.a(aahnVar.d, hmlVarC);
            hsf hsfVarA4 = hro.a(aahnVar.e, hmlVarC);
            hmlVarC.v(372401975);
            if (f(hsfVarA4) && e(hsfVarA) != null) {
                dloh dlohVarE = e(hsfVarA);
                dlohVarE.getClass();
                dloh dlohVarE2 = e(hsfVarA);
                dlohVarE2.getClass();
                acx.a(dlohVarE.b.f, dlohVarE2.b.k, hmlVarC, 0, 0);
            }
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            Object objS = hmwVar2.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: aahs
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ivy ivyVar = (ivy) obj;
                        ivyVar.getClass();
                        aahnVar.f.invoke(Integer.valueOf((int) (ivyVar.g() & 4294967295L)));
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS);
            }
            hmwVar2.ab();
            ics icsVarA = ixy.a(icsVar, (fdap) objS);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i5 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-395520516);
            dloh dlohVarE3 = e(hsfVarA);
            if (dlohVarE3 == null) {
                hcnVar2 = hcnVar;
                hmwVar = hmwVar2;
            } else {
                hmwVar = hmwVar2;
                hcnVar2 = hcnVar;
                dlor.c(dlohVarE3, idb.a(ics.e, true != ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue() ? 3.0f : 1.0f), hcnVar2, null, (hmlVarC.e(aidp.a) == aidm.b) & (!f(hsfVarA4)), null, hmlVarC, i2 & 896, 40);
            }
            hmwVar.ab();
            dlht dlhtVar = (dlht) hsfVarA2.a();
            hmlVarC.v(402895842);
            if (dlhtVar != null) {
                dew dewVar = dljt.d(hmlVarC).c;
                hmlVarC.v(-691062112);
                a(dlhtVar, dewVar, hmlVarC, 0);
                hmwVar.ab();
            }
            hmwVar.ab();
            tdf.b((tcy) hsfVarA3.a(), idb.a(ics.e, 1.0f), hmlVarC, 48);
            hmlVarC.n();
            hmlVarC.v(-1338725679);
            dloh dlohVarE4 = e(hsfVarA);
            if (dlohVarE4 != null) {
                arrayList = new ArrayList();
                Iterator it = dlohVarE4.c.iterator();
                while (it.hasNext()) {
                    fdae fdaeVar2 = ((dihq) it.next()).j;
                    if (fdaeVar2 != null) {
                        arrayList.add(fdaeVar2);
                    }
                }
            } else {
                arrayList = fcvo.a;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                b((fdae) it2.next(), hmlVarC, 0);
            }
            hmwVar.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaht
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    aahn aahnVar2 = aahnVar;
                    ics icsVar2 = icsVar;
                    int i6 = i;
                    aahy.d(aahnVar2, icsVar2, hcnVar2, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final dloh e(hsf hsfVar) {
        return (dloh) hsfVar.a();
    }

    private static final boolean f(hsf hsfVar) {
        return ((Boolean) hsfVar.a()).booleanValue();
    }
}
