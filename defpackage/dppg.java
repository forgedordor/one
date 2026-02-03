package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dppg {
    public static final void a(final dpov dpovVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-143754347);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dpovVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfz.a(hxe.d(-697892, new dppb(dpovVar), hmlVarC), dpovVar.c, null, null, false, null, null, hmlVarC, 6, 508);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpoz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dppg.a(dpovVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dpov dpovVar, final fdat fdatVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(1123971087);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(dpovVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                fdatVar = dpou.a;
            }
            dtfk.b(dpovVar.c, null, false, null, null, hxe.d(-801074588, new dppc(dpovVar, fdatVar), hmlVarC), hmlVarC, 1572864, 62);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpoy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpov dpovVar2 = dpovVar;
                    int i6 = i;
                    dppg.b(dpovVar2, fdatVar, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final List list, final fddq fddqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1950783650);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fddqVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            djrr djrrVar = djrr.cC;
            String strB = jqu.b(R.string.toolbar_more_content_description, hmlVarC);
            hmlVarC.v(5004770);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdae() { // from class: dpow
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dppg.d(hoxVar, true);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            b(new dpov(djrrVar, strB, (fdae) objS2), hxe.d(1447217041, new dppf(hoxVar, fddqVar, list), hmlVarC), hmlVarC, 48, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpox
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    List list2 = list;
                    int i4 = i;
                    dppg.c(list2, fddqVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void e(final ego egoVar, final List list, final int i, hml hmlVar, final int i2) {
        hml hmlVarC = hmlVar.c(-1902066011);
        int i3 = ((i2 & 48) == 0 ? (true != hmlVarC.F(list) ? 16 : 32) | i2 : i2) | 384;
        if ((i3 & 145) == 144 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int size = list.size() <= 3 ? list.size() : 2;
            hmlVarC.v(1770645589);
            for (int i4 = 0; i4 < size; i4++) {
                b((dpov) list.get(i4), null, hmlVarC, 0, 2);
            }
            ((hmw) hmlVarC).ab();
            if (size < list.size()) {
                c(list, fddu.r(size, list.size()), hmlVarC, (i3 >> 3) & 14);
            }
            i = 3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dppa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    List list2 = list;
                    int i5 = i2;
                    dppg.e(egoVar2, list2, i, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
