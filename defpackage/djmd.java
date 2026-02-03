package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmd {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.ics r16, final defpackage.fdae r17, final java.lang.String r18, boolean r19, defpackage.hml r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djmd.a(ics, fdae, java.lang.String, boolean, hml, int, int):void");
    }

    public static final void b(final dktq dktqVar, final dktq dktqVar2, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-746255723);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dktqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dktqVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(icoVar, 24.0f, 24.0f, 24.0f, 0.0f, 8);
            ixm ixmVarA = egk.a(ecr.b, ibw.m, hmlVarC, 6);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            egt.a(egp.a.a(icoVar, 1.0f, true), hmlVarC);
            hmlVarC.v(-2117559163);
            if (dktqVar2 != null) {
                a(null, dktqVar2.c, dktqVar2.a, dktqVar2.b, hmlVarC, 0, 1);
            }
            hmwVar2.ab();
            hmlVarC.v(-2117554727);
            if (dktqVar != null) {
                hmwVar = hmwVar2;
                a(efy.j(icoVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), dktqVar.c, dktqVar.a, dktqVar.b, hmlVarC, 6, 0);
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djlt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dktq dktqVar3 = dktqVar;
                    int i5 = i;
                    djmd.b(dktqVar3, dktqVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final djrr djrrVar, final ije ijeVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(2134529896);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(ijeVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                ijeVar = null;
            }
            inz inzVarB = djrs.b(djrrVar, hmlVarC);
            hmlVarC.v(-1711133367);
            long j = ijeVar == null ? ((ije) hmlVarC.e(gea.a)).i : ijeVar.i;
            ((hmw) hmlVarC).ab();
            dtfn.a(inzVarB, null, null, j, hmlVarC, 0, 4);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djls
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    int i6 = i;
                    djmd.c(djrrVar2, ijeVar, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ics r13, boolean r14, final defpackage.fdae r15, defpackage.knl r16, final defpackage.fdau r17, defpackage.hml r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djmd.d(ics, boolean, fdae, knl, fdau, hml, int, int):void");
    }

    public static final void e(final ics icsVar, final List list, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(978261951);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
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
            ejy ejyVarA = ekb.a(0, hmlVarC, 3);
            ics icsVarF = egq.f(efy.j(icsVar, true != ((Boolean) dljt.b(hmlVarC).k.invoke()).booleanValue() ? 8.0f : 0.0f, 24.0f, true == ((Boolean) dljt.b(hmlVarC).k.invoke()).booleanValue() ? 0.0f : 8.0f, 0.0f, 8), 84.0f, 252.0f);
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(list);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: djlq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        List list2 = list;
                        eioVar.a(list2.size(), null, new djlz(list2), new hxd(802480018, true, new djma(list2)));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            eig.a(icsVarF, ejyVarA, null, false, null, null, null, false, null, (fdap) objS, hmlVar2, 0, 508);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djlr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    djmd.e(icsVar2, list, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-651317604);
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
            int i4 = i2;
            hmlVar2 = hmlVarC;
            dthx.b(str, efy.i(egq.d(ics.e, 1.0f), 24.0f, 0.0f, 2), dtcj.e(hmlVar2), 0L, null, null, 0L, z ? new khk(3) : null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).f, hmlVar2, (i4 & 14) | 48, 0, 65016);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djlx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    djmd.f(str2, z, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final float g(hml hmlVar) {
        hmlVar.v(-851504799);
        float f = ((Configuration) hmlVar.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
        hmlVar.o();
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r30, final java.util.List r31, defpackage.ics r32, defpackage.hml r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djmd.h(java.lang.String, java.util.List, ics, hml, int, int):void");
    }

    public static final void i(final dktq dktqVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1231953501);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dktqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            a(icoVar, dktqVar.c, dktqVar.a, dktqVar.b, hmlVarC, (i3 >> 3) & 14, 0);
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djlw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dktq dktqVar2 = dktqVar;
                    int i4 = i;
                    djmd.i(dktqVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
