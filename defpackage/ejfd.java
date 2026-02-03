package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfd {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hml r13, int r14) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejfd.a(hml, int):void");
    }

    public static final void b(final ejfj ejfjVar, hml hmlVar, final int i) {
        int i2;
        ejfjVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(649063004);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(ejfjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            c(hxe.d(-924132166, new ejez(ejfjVar, hro.a(ejfjVar.g, hmlVarC), hro.a(ejfjVar.h, hmlVarC)), hmlVarC), hmlVarC, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejep
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ejfd.b(ejfjVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1505318404);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdauVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = dkl.a(ics.e, ije.a, ikj.a);
            iby ibyVar = ibw.e;
            ics icsVarC = egq.c(icsVarA, 1.0f);
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = ejeo.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
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
            fdauVar.a(edf.a, hmlVarC, Integer.valueOf(((i2 << 3) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejex
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ejfd.c(fdauVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final fdae fdaeVar, final ejga ejgaVar, hml hmlVar, final int i) {
        int i2;
        String strB;
        hml hmlVar2;
        fdaeVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1781942150);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.B(ejgaVar.ordinal()) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            int iOrdinal = ejgaVar.ordinal();
            if (iOrdinal == 0) {
                hmlVarC.v(1245561912);
                strB = jqu.b(R.string.dialog_body_segmentation_empty_result, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    hmlVarC.v(1245550572);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(1245558385);
                strB = jqu.b(R.string.dialog_body_segmentation_error, hmlVarC);
                ((hmw) hmlVarC).ab();
            }
            knl knlVar = new knl(false, 5);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdae() { // from class: ejer
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            fyh.a((fdae) objS, hxe.d(1638961346, new ejfb(fdaeVar), hmlVarC), null, null, null, null, hxe.d(-1306105593, new ejfc(strB), hmlVarC), null, 0L, 0L, 0L, 0L, 0.0f, knlVar, hmlVar2, 1572918, 3072, 8124);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejes
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    int i4 = i;
                    ejfd.d(fdaeVar2, ejgaVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final ede edeVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(692654656);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarJ = efy.j(edeVar.a(egq.d(ics.e, 1.0f), ibw.h), 0.0f, 0.0f, 0.0f, 32.0f, 7);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = ejeo.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
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
            fdauVar.a(egp.a, hmlVarC, Integer.valueOf((i2 & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejet
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    ejfd.e(edeVar2, fdauVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final ede edeVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1569104243);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(edeVar.a(ics.e, ibw.b), 1.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = ejeo.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf((i2 >> 3) & 14));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejeq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ede edeVar2 = edeVar;
                    int i4 = i;
                    ejfd.f(edeVar2, fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1923824034);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarC = egq.c(ics.e, 1.0f);
            long j = ejfu.a;
            ics icsVarA = dkl.a(icsVarC, ejfu.b, ikj.a);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = ejeo.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf(i2 & 14));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ejeu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ejfd.g(fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
