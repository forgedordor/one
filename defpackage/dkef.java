package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkef {
    public static final void a(final dkeg dkegVar, final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        dkegVar.getClass();
        hml hmlVarC = hmlVar.c(1056716189);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(dkegVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i4 != 0) {
                icsVar = ics.e;
            }
            fdae fdaeVar = dkegVar.h;
            ics icsVarA = fdaeVar != null ? icsVar.a(dli.e(ics.e, false, null, fdaeVar, 15)) : icsVar;
            if (fdaeVar == null) {
                icsVarA = icsVarA.a(ien.a(ics.e, 0.38f));
            }
            ics icsVar2 = icsVarA;
            dkdm dkdmVar = dkegVar.f;
            hmlVarC.v(1891986672);
            hwv hwvVarD = dkdmVar == null ? null : hxe.d(-1747431576, new dkea(dkdmVar), hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            String str = dkegVar.c;
            hmlVarC.v(1891989521);
            hwv hwvVarD2 = str == null ? null : hxe.d(2059262728, new dkeb(str), hmlVarC);
            hmwVar.ab();
            String str2 = dkegVar.b;
            hmlVarC.v(1891995720);
            hwv hwvVarD3 = str2 == null ? null : hxe.d(-1780478062, new dkec(str2, dkegVar), hmlVarC);
            hmwVar.ab();
            hmlVarC.v(1892000487);
            hwv hwvVarD4 = (dkegVar.g == null && dkegVar.e == null) ? null : hxe.d(1655782784, new dked(dkegVar), hmlVarC);
            hmwVar.ab();
            dtfr.a(hxe.d(723071103, new dkee(dkegVar), hmlVarC), icsVar2, hwvVarD2, hwvVarD3, hwvVarD, hwvVarD4, dtfp.a(ije.g, hmlVarC, 510), hmlVarC, 6, 384);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkeg dkegVar2 = dkegVar;
                    int i5 = i;
                    dkef.a(dkegVar2, icsVar, (hml) obj, hpy.a(i5 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, final List list, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1404581764);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dijr.f(new diju(str, list, 4), null, null, ((ije) hmlVarC.e(gea.a)).i, (jyq) hmlVarC.e(gyj.a), null, 0L, null, false, null, null, null, null, hmlVar2, 0, 0, 8166);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dkef.b(str2, list, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final int i, hml hmlVar, final int i2) throws Resources.NotFoundException {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1532416540);
        if (i4 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String quantityString = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(R.plurals.abc_text_list_item_count_description, i, Integer.valueOf(i));
            quantityString.getClass();
            ics icsVarA = dihi.a(ics.e, quantityString, false);
            hmlVarC.v(-521476743);
            String strValueOf = i < 100 ? String.valueOf(i) : jqu.b(R.string.abc_text_list_item_many_items, hmlVarC);
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dthx.b(strValueOf, icsVarA, glz.a(hmlVarC).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, 0, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    int i5 = i2;
                    dkef.c(i, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final int i, final boolean z, final boolean z2, hml hmlVar, final int i2) throws Resources.NotFoundException {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(94260436);
        if (i4 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String quantityString = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(R.plurals.abc_text_list_item_count_description, i, Integer.valueOf(i));
            quantityString.getClass();
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(icoVar, 0.0f, 0.0f, z ? 8.0f : 0.0f, 0.0f, 11);
            if (!z2) {
                icsVarJ = icsVarJ.a(ien.a(icoVar, 0.38f));
            }
            ics icsVarA = dihi.a(icsVarJ, quantityString, false);
            hmlVarC.v(389982929);
            String strValueOf = i < 100 ? String.valueOf(i) : jqu.b(R.string.abc_text_list_item_many_items, hmlVarC);
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dthx.b(strValueOf, icsVarA, glz.a(hmlVarC).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, 0, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    boolean z3 = z;
                    int i6 = i2;
                    dkef.d(i5, z3, z2, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dkdm dkdmVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(183938540);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkdmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else if (dkdmVar instanceof dkdj) {
            hmlVarC.v(671284993);
            hmlVar2 = hmlVarC;
            dtgm.a(egq.k(ics.e, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, hmlVar2, 390, 58);
            ((hmw) hmlVar2).ab();
        } else {
            hmlVar2 = hmlVarC;
            if (dkdmVar instanceof dkdk) {
                hmlVar2.v(671288923);
                g((dkdk) dkdmVar, hmlVar2, 0);
                ((hmw) hmlVar2).ab();
            } else {
                if (!(dkdmVar instanceof dkdl)) {
                    hmlVar2.v(671282556);
                    ((hmw) hmlVar2).ab();
                    throw new fctg();
                }
                hmlVar2.v(671292441);
                dtfu.a(egq.k(ics.e, 24.0f), 0L, null, hmlVar2, 6);
                ((hmw) hmlVar2).ab();
            }
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkef.e(dkdmVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final dkdm dkdmVar, final ije ijeVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1980678175);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkdmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (dkdmVar instanceof dkdj) {
            hmlVarC.v(761222644);
            dtgm.a(egq.k(ics.e, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, hmlVarC, 390, 58);
            ((hmw) hmlVarC).ab();
        } else if (dkdmVar instanceof dkdk) {
            hmlVarC.v(761226804);
            h((dkdk) dkdmVar, ijeVar, z, hmlVarC, i2 & 1008);
            ((hmw) hmlVarC).ab();
        } else {
            if (!(dkdmVar instanceof dkdl)) {
                hmlVarC.v(761220251);
                ((hmw) hmlVarC).ab();
                throw new fctg();
            }
            hmlVarC.v(761231500);
            dtfu.a(egq.k(ics.e, 24.0f), 0L, null, hmlVarC, 6);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkdm dkdmVar2 = dkdmVar;
                    ije ijeVar2 = ijeVar;
                    int i4 = i;
                    dkef.f(dkdmVar2, ijeVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final dkdk dkdkVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-406491058);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkdkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ibx ibxVar = ibw.k;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
            int iA = dkdn.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
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
            dtfn.a(djrs.b(dkdkVar.a, hmlVarC), null, egq.k(icoVar, 24.0f), 0L, hmlVarC, 384, 8);
            String str = dkdkVar.b;
            hmlVarC.v(-1427175280);
            if (str != null) {
                dlfw.a(str, egq.x(icoVar, 0.0f, 24.0f, 1), 0L, new khk(3), 2, 1, dljt.e(hmlVarC).e, hmlVarC, 221232, 4);
                hmlVarC = hmlVarC;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkds
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkef.g(dkdkVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final dkdk dkdkVar, final ije ijeVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2128654081);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkdkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            float f = z ? 1.0f : 0.38f;
            hmlVarC.v(1232146003);
            long j = ijeVar == null ? glz.a(hmlVarC).s : ijeVar.i;
            hmw hmwVar2 = (hmw) hmlVarC;
            hmwVar2.ab();
            ibx ibxVar = ibw.k;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
            int iA = dkdn.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dtfn.a(djrs.b(dkdkVar.a, hmlVarC), null, ien.a(egq.k(icoVar, 24.0f), f), j, hmlVarC, 0, 0);
            String str = dkdkVar.b;
            hmlVarC.v(723330119);
            if (str != null) {
                hmwVar = hmwVar2;
                dlfw.a(str, egq.x(ien.a(icoVar, f), 0.0f, 24.0f, 1), j, new khk(3), 2, 1, dljt.e(hmlVarC).e, hmlVarC, 221184, 0);
                hmlVarC = hmlVarC;
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkdk dkdkVar2 = dkdkVar;
                    ije ijeVar2 = ijeVar;
                    int i4 = i;
                    dkef.h(dkdkVar2, ijeVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(477780371);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 16.0f, 0.0f, 2);
            if (!z) {
                icsVarI = icsVarI.a(ien.a(icoVar, 0.38f));
            }
            hmlVar2 = hmlVarC;
            dthx.b(str, icsVarI, glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).o, hmlVar2, i2 & 14, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dkef.i(str2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final String str, final List list, final boolean z, final jyq jyqVar, final ije ijeVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-877402214);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(ijeVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 16.0f, 0.0f, 2);
            if (!z) {
                icsVarI = icsVarI.a(ien.a(icoVar, 0.38f));
            }
            ics icsVar = icsVarI;
            diju dijuVar = new diju(str, list, 4);
            hmlVarC.v(-1369922970);
            long j = ijeVar == null ? glz.a(hmlVarC).q : ijeVar.i;
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dijr.f(dijuVar, null, icsVar, j, jyqVar, null, 0L, null, false, null, null, null, null, hmlVar2, (i2 << 3) & 57344, 0, 8162);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    List list2 = list;
                    boolean z2 = z;
                    jyq jyqVar2 = jyqVar;
                    dkef.j(str2, list2, z2, jyqVar2, ijeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0372 A[LOOP:1: B:207:0x036c->B:209:0x0372, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010c  */
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final defpackage.dkeg r30, defpackage.ics r31, defpackage.jyq r32, defpackage.ije r33, defpackage.ije r34, defpackage.kir r35, defpackage.kir r36, defpackage.ibx r37, defpackage.hml r38, final int r39, final int r40, final int r41) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkef.k(dkeg, ics, jyq, ije, ije, kir, kir, ibx, hml, int, int, int):void");
    }

    public static final void l(final String str, final List list, final boolean z, final jyq jyqVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1291155890);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(null) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 16.0f, 0.0f, 2);
            if (!z) {
                icsVarI = icsVarI.a(ien.a(icoVar, 0.38f));
            }
            ics icsVar = icsVarI;
            diju dijuVar = new diju(str, list, 4);
            hmlVarC.v(-444723483);
            long j = glz.a(hmlVarC).s;
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dijr.f(dijuVar, null, icsVar, j, jyqVar, null, 0L, null, false, null, null, null, null, hmlVar2, (i2 << 3) & 57344, 0, 8162);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkdo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    List list2 = list;
                    boolean z2 = z;
                    dkef.l(str2, list2, z2, jyqVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
