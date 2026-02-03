package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlnj {
    public static final void a(final dihq dihqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(910636515);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djrr djrrVar = dihqVar.b;
            if (djrrVar != null) {
                hmlVarC.v(1759085021);
                d(dihqVar.c, hxe.d(1155135947, new dlmw(dihqVar, djrrVar), hmlVarC), hmlVarC, 48);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(1759186019);
                e(dihqVar, hmlVarC, i2 & 14);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlmq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlnj.a(dihqVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dihq dihqVar, final djrr djrrVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1841323421);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.B(djrrVar.ordinal()) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
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
            hmlVarC.v(-1633490746);
            int i4 = i2 & 14;
            Object objS2 = hmwVar.S();
            if (i4 == 4 || objS2 == obj) {
                objS2 = new fdae() { // from class: dlmk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dihq dihqVar2 = dihqVar;
                        if (dihqVar2.g.isEmpty()) {
                            dihqVar2.k.invoke();
                        } else {
                            dlnj.c(hoxVar, true);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            fdae fdaeVar = (fdae) objS2;
            hmwVar.ab();
            List list = dihqVar.g;
            hmlVar2 = hmlVarC;
            dtfk.b(fdaeVar, null, list.isEmpty() ? dihqVar.f : true, null, null, hxe.d(1258538175, new dlmx(djrrVar, dihqVar), hmlVarC), hmlVar2, 1572864, 58);
            boolean z = dihqVar.h;
            boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
            hmlVar2.v(5004770);
            Object objS3 = hmwVar.S();
            if (objS3 == obj) {
                objS3 = new fdae() { // from class: dlml
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dlnj.c(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            k(list, z, zBooleanValue, (fdae) objS3, hmlVar2, 3072);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlmm
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dihq dihqVar2 = dihqVar;
                    int i5 = i;
                    dlnj.b(dihqVar2, djrrVar, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void d(final boolean z, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-649054573);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (z) {
            hmlVarC.v(-41884008);
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = dlmh.a(hmg.b(hmlVarC));
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
            edf edfVar = edf.a;
            dtcv.a(efs.b(edfVar.a(icoVar, ibw.c), -10.0f, 10.0f), 0L, 0L, hmlVarC, 0);
            fdauVar.a(edfVar, hmlVarC, Integer.valueOf((i2 & 112) | 6));
            hmlVarC.n();
            hmwVar.ab();
        } else {
            hmlVarC.v(-41670449);
            int i4 = i2 << 6;
            ico icoVar2 = ics.e;
            ixm ixmVarA2 = ecz.a(ibw.a, false);
            int iA2 = dlmh.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk2 = hmwVar2.ak();
            ics icsVarB2 = icj.b(hmlVarC, icoVar2);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, jbb.e);
            hsk.b(hmlVarC, hxiVarAk2, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar2.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            fdauVar.a(edf.a, hmlVarC, Integer.valueOf((((i4 & 7168) >> 6) & 112) | 6));
            hmlVarC.n();
            hmwVar2.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlmi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    int i5 = i;
                    dlnj.d(z2, fdauVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final dihq dihqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1914539188);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
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
            hmlVarC.v(-1633490746);
            int i4 = i2 & 14;
            Object objS2 = hmwVar.S();
            if (i4 == 4 || objS2 == obj) {
                objS2 = new fdae() { // from class: dlmu
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dihq dihqVar2 = dihqVar;
                        if (dihqVar2.g.isEmpty()) {
                            dihqVar2.k.invoke();
                        } else {
                            dlnj.f(hoxVar, true);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            fdae fdaeVar = (fdae) objS2;
            hmwVar.ab();
            dtdi.e(fdaeVar, null, dihqVar.g.isEmpty() ? dihqVar.f : true, null, null, null, hxe.d(493951241, new dlmz(dihqVar, hoxVar), hmlVarC), hmlVarC, 805306368, 506);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlmv
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i5 = i;
                    dlnj.e(dihqVar, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void g(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void h(final dihq dihqVar, final boolean z, final boolean z2, hml hmlVar, final int i) {
        int i2;
        djrr djrrVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1270813441);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (!z && dihqVar.f && (djrrVar = dihqVar.b) != null) {
            fdae fdaeVar = dihqVar.k;
            ics icsVarC = ics.e;
            if (z2) {
                icsVarC = efs.c(efy.j(icsVarC, 4.0f, 0.0f, 0.0f, 0.0f, 14), -4.0f, 0.0f, 2);
            }
            dtfk.b(fdaeVar, icsVarC, false, null, null, hxe.d(67325946, new dlnc(djrrVar, dihqVar), hmlVarC), hmlVarC, 1572864, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlmn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dihq dihqVar2 = dihqVar;
                    boolean z3 = z;
                    int i4 = i;
                    dlnj.h(dihqVar2, z3, z2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final dihq dihqVar, final boolean z, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        djrr djrrVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1384131308);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dihqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z2 = dihqVar.f;
            hmlVarC.v(1289682243);
            hwv hwvVarD = null;
            if (z && (djrrVar = dihqVar.b) != null) {
                hwvVarD = hxe.d(1667525449, new dlnh(djrrVar, dihqVar), hmlVarC);
            }
            ((hmw) hmlVarC).ab();
            dtfz.a(hxe.d(-1977622716, new dlni(dihqVar), hmlVarC), fdaeVar, null, hwvVarD, z2, null, null, hmlVarC, ((i2 >> 3) & 112) | 6, 468);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlmj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dihq dihqVar2 = dihqVar;
                    boolean z3 = z;
                    int i4 = i;
                    dlnj.i(dihqVar2, z3, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final List list, hml hmlVar, final int i) {
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(-6680137);
        int i3 = i2 == 0 ? (true != hmlVarC.F(list) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.E(false) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
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
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((dihq) obj2).d) {
                    arrayList.add(obj2);
                } else {
                    arrayList2.add(obj2);
                }
            }
            fcti fctiVar = new fcti(arrayList, arrayList2);
            List list2 = (List) fctiVar.a;
            List list3 = (List) fctiVar.b;
            hmlVarC.v(-2124635279);
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                a((dihq) it.next(), hmlVarC, 0);
            }
            hmwVar.ab();
            if (!list2.isEmpty()) {
                hmlVarC.v(5004770);
                Object objS2 = hmwVar.S();
                if (objS2 == obj) {
                    objS2 = new fdae() { // from class: dlmr
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dlnj.g(hoxVar, true);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                hmwVar.ab();
                dtfk.b((fdae) objS2, null, false, null, null, hxe.d(-451910032, new dlnb(list2, hoxVar), hmlVarC), hmlVarC, 1572870, 62);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlms
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    int i4 = i;
                    dlnj.j(list, (hml) obj3, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final List list, final boolean z, final boolean z2, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        boolean z3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-381484834);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= true != hmlVarC.E(z3) ? 128 : 256;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (list.isEmpty()) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    final boolean z4 = z3;
                    hpxVarL.d = new fdat() { // from class: dlmo
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            List list2 = list;
                            boolean z5 = z;
                            boolean z6 = z4;
                            dlnj.k(list2, z5, z6, fdaeVar, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            dtfz.b(z2, fdaeVar, null, 0L, null, null, null, 0L, 0.0f, hxe.d(-357660455, new dlne(list, z, fdaeVar), hmlVarC), hmlVarC, (i2 >> 6) & 126, 48, 2044);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dlmp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    boolean z5 = z;
                    boolean z6 = z2;
                    dlnj.k(list2, z5, z6, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final List list, final boolean z, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1967271891);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = i2 >> 6;
            dtfz.b(z, fdaeVar, egq.x(ics.e, 192.0f, 0.0f, 2), 0L, null, null, glz.c(hmlVarC).f, 0L, 0.0f, hxe.d(-1943447512, new dlng(list, fdaeVar), hmlVarC), hmlVarC, (i4 & 14) | 384 | (i4 & 112), 48, 1976);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlmt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    boolean z2 = z;
                    int i5 = i;
                    dlnj.l(list2, z2, fdaeVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
