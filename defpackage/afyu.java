package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afyu {
    public static final void a(final dihq dihqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-751004654);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            int i4 = adc.a;
            ach achVarA = adc.a(hmlVarC);
            if (achVarA == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final ace aceVarC = achVarA.c();
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(aceVarC) | ((i2 & 14) == 4) | hmlVarC.F(lvjVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: afym
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((hny) obj).getClass();
                        dihq dihqVar2 = dihqVar;
                        afyp afypVar = new afyp(dihqVar2, dihqVar2.f);
                        aceVarC.b(lvjVar, afypVar);
                        return new afyq(afypVar);
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.c(dihqVar, (fdap) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afyn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    afyu.a(dihqVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdvc fdvcVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-383786493);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hsf hsfVarA = hro.a(fdvcVar, hmlVarC);
            dloh dlohVar = d(hsfVarA).a;
            List list = d(hsfVarA).c;
            afvt afvtVar = d(hsfVarA).b;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new igr();
                hmwVar.af(objS);
            }
            igr igrVar = (igr) objS;
            hmwVar.ab();
            a(d(hsfVarA).a.b, hmlVarC, 0);
            hmlVarC.v(548386496);
            ics icsVarA = d(hsfVarA).d.a ? dkl.a(ics.e, glz.a(hmlVarC).G, ikj.a) : ics.e;
            hmwVar.ab();
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-710744059);
            ije ijeVar = d(hsfVarA).d.a ? new ije(glz.a(hmlVarC).G) : null;
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dlor.c(dlohVar, null, null, igrVar, false, ijeVar, hmlVar2, 3072, 22);
            hmlVar2.v(-710738010);
            if (afvtVar.b.isEmpty()) {
                boolean z = d(hsfVarA).d.a;
                afyh afyhVar = d(hsfVarA).d;
                afuz.a(list, false, z, hmlVar2, 0, 2);
            }
            hmwVar.ab();
            afxo.a(afvtVar, hmlVar2, 0);
            hmlVar2.n();
            if (dlohVar.a instanceof dlnn) {
                d(hsfVarA);
                c(igrVar, hmlVar2, 6);
            }
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afyo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    afyu.b(fdvcVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(igr igrVar, hml hmlVar, final int i) {
        int i2;
        final igr igrVar2;
        igrVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1689991980);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(igrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            igrVar2 = igrVar;
        } else {
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            dpir dpirVar = (dpir) hmlVarC.e(dpjg.a);
            hmlVarC.v(-1746271574);
            boolean z = (i2 & 14) == 4;
            boolean zF = hmlVarC.F(dpirVar) | z | hmlVarC.F(view);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new afyr(igrVar, dpirVar, view, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(igrVar, (fdat) objS, hmlVarC);
            hmlVarC.v(-988684931);
            final lvj lvjVar = (lvj) hmlVarC.e(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            Object obj = hmk.a;
            if (objS2 == obj) {
                hpl hplVar = new hpl(lva.ON_ANY, hsi.a);
                hmwVar.af(hplVar);
                objS2 = hplVar;
            }
            final hox hoxVar = (hox) objS2;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            boolean zF2 = hmlVarC.F(lvjVar);
            Object objS3 = hmwVar.S();
            if (zF2 || objS3 == obj) {
                objS3 = new fdap() { // from class: afyl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((hny) obj2).getClass();
                        final hox hoxVar2 = hoxVar;
                        lvh lvhVar = new lvh() { // from class: afyk
                            @Override // defpackage.lvh
                            public final void gL(lvj lvjVar2, lva lvaVar) {
                                hoxVar2.b(lvaVar);
                            }
                        };
                        lvj lvjVar2 = lvjVar;
                        lvjVar2.P().c(lvhVar);
                        return new afyt(lvjVar2, lvhVar);
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            hob.c(lvjVar, (fdap) objS3, hmlVarC);
            lva lvaVar = (lva) hoxVar.a();
            hmwVar.ab();
            hmlVarC.v(-1224400529);
            boolean zB = hmlVarC.B(lvaVar.ordinal()) | z | hmlVarC.F(dpirVar) | hmlVarC.F(view);
            Object objS4 = hmwVar.S();
            if (zB || objS4 == obj) {
                igrVar2 = igrVar;
                afys afysVar = new afys(lvaVar, igrVar2, dpirVar, view, null);
                hmwVar.af(afysVar);
                objS4 = afysVar;
            } else {
                igrVar2 = igrVar;
            }
            hmwVar.ab();
            hob.g(lvaVar, (fdat) objS4, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afyj
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    afyu.c(igrVar2, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final afyi d(hsf hsfVar) {
        return (afyi) hsfVar.a();
    }
}
