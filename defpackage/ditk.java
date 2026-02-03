package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ditk {
    public static final void a(final String str, final boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(549550847);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
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
            if (str == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: disv
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            ditk.a(null, z, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVar2 = hmlVarC;
            dthx.b(str, efy.j(ics.e, 0.0f, z ? 2.0f : 0.0f, 0.0f, 0.0f, 13), glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).k, hmlVar2, i2 & 14, 0, 65528);
        }
        hpx hpxVarL2 = hmlVar2.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: disw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    ditk.a(str2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final disb disbVar, final ditl ditlVar, final fdae fdaeVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1003523079);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(disbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.B(ditlVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = disbVar.f != null && ditlVar == ditl.a;
            String str = disbVar.a;
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(str);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(385743975);
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            Object obj = hmk.a;
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: diss
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((gvt) obj2).getClass();
                        return true;
                    }
                };
                hmwVar.af(objS2);
            }
            fdap fdapVar = (fdap) objS2;
            hmwVar.ab();
            hpt hptVar = jmh.e;
            kio kioVar = (kio) hmlVarC.e(hptVar);
            hmlVarC.v(-485754360);
            final kio kioVar2 = (kio) hmlVarC.e(hptVar);
            boolean zD2 = hmlVarC.D(kioVar2);
            int i4 = i2;
            Object objS3 = hmwVar.S();
            if (zD2 || objS3 == obj) {
                objS3 = new fdap() { // from class: gvl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        ((Float) obj2).floatValue();
                        return Float.valueOf(kioVar2.en(56.0f));
                    }
                };
                hmwVar.af(objS3);
            }
            fdap fdapVar2 = (fdap) objS3;
            hmwVar.ab();
            hmlVarC.v(-1633490746);
            boolean zD3 = hmlVarC.D(str) | hmlVarC.D(kioVar);
            Object objS4 = hmwVar.S();
            if (zD3 || objS4 == obj) {
                objS4 = new gvs(gvt.c, kioVar, fdapVar, fdapVar2);
                hmwVar.af(objS4);
            }
            gvs gvsVar = (gvs) objS4;
            hmwVar.ab();
            hmwVar.ab();
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(gvsVar) | ((i4 & 14) == 4) | hmlVarC.D(hoxVar);
            Object objS5 = hmwVar.S();
            if (zF || objS5 == obj) {
                objS5 = new ditd(gvsVar, disbVar, hoxVar, null);
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            hob.g(gvsVar, (fdat) objS5, hmlVarC);
            if (!((Boolean) hoxVar.a()).booleanValue()) {
                gvp.a(gvsVar, dits.a, null, z, z, false, hxe.d(400948783, new ditf(ditlVar, fdaeVar, fdatVar), hmlVarC), hmlVarC, 1572912);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dish
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    disb disbVar2 = disbVar;
                    ditl ditlVar2 = ditlVar;
                    fdae fdaeVar2 = fdaeVar;
                    ditk.b(disbVar2, ditlVar2, fdaeVar2, fdatVar, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ego egoVar, final boolean z, final boolean z2, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1513366823);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(egoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = egoVar.a(efy.f(ics.e, 16.0f, 16.0f, z2 ? 4.0f : 16.0f, z ? 0.0f : 16.0f), 1.0f, true);
            int i4 = i2 & 7168;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = disc.a(hmg.b(hmlVarC));
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
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdauVar.a(edp.a, hmlVarC, Integer.valueOf(((i4 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: disi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    ditk.c(egoVar2, z3, z4, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final disb disbVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1164519877);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(disbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 0.0f, 16.0f, 1);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = disc.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
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
            e(hmlVarC, 0);
            j(disbVar.d, false, hmlVarC, 48);
            egt.a(egq.o(icoVar, 12.0f), hmlVarC);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dist
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ditk.d(disbVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[PHI: r10
      0x0015: PHI (r10v1 int) = (r10v0 int), (r10v3 int) binds: [B:3:0x0007, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.hml r9, final int r10) {
        /*
            r0 = -1505099279(0xffffffffa64a01f1, float:-7.008546E-16)
            hml r6 = r9.c(r0)
            if (r10 != 0) goto L15
            boolean r9 = r6.I()
            r10 = 0
            if (r9 != 0) goto L11
            goto L15
        L11:
            r6.s()
            goto L40
        L15:
            ico r0 = defpackage.ics.e
            r4 = 0
            r5 = 14
            r1 = 1094713344(0x41400000, float:12.0)
            r2 = 0
            r3 = 0
            ics r9 = defpackage.efy.j(r0, r1, r2, r3, r4, r5)
            r0 = 1103101952(0x41c00000, float:24.0)
            ics r3 = defpackage.egq.e(r9, r0)
            djrr r9 = defpackage.djrr.ai
            inz r1 = defpackage.djrs.b(r9, r6)
            gda r9 = defpackage.glz.a(r6)
            long r4 = r9.q
            r9 = 2132083052(0x7f15016c, float:1.9806235E38)
            java.lang.String r2 = defpackage.jqu.b(r9, r6)
            r7 = 0
            r8 = 0
            defpackage.dtfn.a(r1, r2, r3, r4, r6, r7, r8)
        L40:
            hpx r9 = r6.L()
            if (r9 == 0) goto L4d
            disu r0 = new disu
            r0.<init>()
            r9.d = r0
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ditk.e(hml, int):void");
    }

    public static final void f(final djrr djrrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1001645541);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfn.a(djrs.b(djrrVar, hmlVarC), null, egq.h(ics.e, 24.0f), glz.a(hmlVarC).b, hmlVarC, 0, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diso
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ditk.f(djrrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final disa disaVar, final disa disaVar2, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1842873231);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(disaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(disaVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(false) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (disaVar == null && disaVar2 == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dism
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ditk.g(null, null, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(egq.d(icoVar, 1.0f), 0.0f, 12.0f, 8.0f, 6.0f, 1);
            ixm ixmVarA = egk.a(ecr.b, ibw.m, hmlVarC, 6);
            int iA = disc.a(hmg.b(hmlVarC));
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
            hmlVarC.v(-1562297884);
            if (disaVar2 != null) {
                dtdi.e(disaVar2.b, null, false, null, r(hmlVarC), null, hxe.d(-1942597391, new disz(disaVar2), hmlVarC), hmlVarC, 805306368, 494);
            }
            hmwVar.ab();
            egt.a(egq.o(icoVar, 8.0f), hmlVarC);
            hmlVarC.v(-1562292252);
            if (disaVar != null) {
                dtdi.e(disaVar.b, null, false, null, r(hmlVarC), null, hxe.d(-855529190, new dita(disaVar), hmlVarC), hmlVarC, 805306368, 494);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: disn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    disa disaVar3 = disaVar;
                    int i4 = i;
                    ditk.g(disaVar3, disaVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(fdae fdaeVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(481683502);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
            icsVar2 = icsVar;
        } else {
            if (fdaeVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: disp
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            ditk.h(null, icsVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            fdaeVar2 = fdaeVar;
            icsVar2 = icsVar;
            dtfk.b(fdaeVar2, icsVar2, false, null, null, dits.b, hmlVarC, (i2 & 14) | 1572864 | (i2 & 112), 60);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: disq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar2;
                    int i4 = i;
                    ditk.h(fdaeVar3, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final djrr djrrVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-582116076);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(false) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (z) {
            hmlVarC.v(1258044235);
            gvk.c(egq.k(efy.j(ics.e, 16.0f, 16.0f, 0.0f, 16.0f, 4), 40.0f), evn.a, q(hmlVarC), 0L, 0.0f, 0.0f, null, hxe.d(239175582, new ditg(djrrVar), hmlVarC), hmlVarC, 120);
            ((hmw) hmlVarC).ab();
        } else {
            hmlVarC.v(1258423985);
            l(djrrVar, hmlVarC, ((i2 >> 3) & 112) | (i2 & 14));
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: disk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    int i4 = i;
                    ditk.i(djrrVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final dito ditoVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(531500198);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(ditoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(false) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (ditoVar instanceof ditm) {
            hmlVarC.v(-329412976);
            i(((ditm) ditoVar).a, z, hmlVarC, i2 & 1008);
            ((hmw) hmlVarC).ab();
        } else {
            if (!(ditoVar instanceof ditn)) {
                if (ditoVar != null) {
                    hmlVarC.v(-329414395);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(-1621676330);
                ((hmw) hmlVarC).ab();
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: disx
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            ditk.j(null, z, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVarC.v(-329409489);
            p(z, hmlVarC, i2 & 112);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: disy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dito ditoVar2 = ditoVar;
                    int i4 = i;
                    ditk.j(ditoVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1843767654);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            if (str == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: disd
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            ditk.k(null, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            jyq jyqVar = glz.d(hmlVarC).h;
            hmlVarC.v(-1960771886);
            long j = glz.a(hmlVarC).q;
            ((hmw) hmlVarC).ab();
            hmlVar2 = hmlVarC;
            dthx.b(str, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyqVar, hmlVar2, i2 & 14, 0, 65530);
        }
        hpx hpxVarL2 = hmlVar2.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dise
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ditk.k(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final djrr djrrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1627886219);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfn.a(djrs.b(djrrVar, hmlVarC), null, joj.a(egq.k(efy.j(ics.e, 12.0f, 0.0f, 8.0f, 0.0f, 10), 24.0f), "Logo"), q(hmlVarC), hmlVarC, 0, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: disr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ditk.l(djrrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void m(final disb disbVar, hml hmlVar, final int i) {
        int i2;
        boolean z;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1193250576);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(disbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = disc.a(hmg.b(hmlVarC));
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
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            fdae fdaeVar2 = disbVar.f;
            ixm ixmVarA2 = egk.a(ecr.a, (fdaeVar2 == null && (disbVar.a == null || disbVar.e == null)) ? ibw.n : ibw.m, hmlVarC, 0);
            int iA2 = disc.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icoVar);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            dito ditoVar = disbVar.d;
            egp egpVar = egp.a;
            boolean z2 = true;
            j(ditoVar, true, hmlVarC, 48);
            disa disaVar = disbVar.b;
            if (disaVar == null && disbVar.c == null) {
                z = true;
                z2 = false;
            } else {
                z = true;
            }
            c(egpVar, z2, fdaeVar2 != null ? z : false, hxe.d(325530296, new dith(disbVar), hmlVarC), hmlVarC, 3078);
            h(fdaeVar2, efy.j(icoVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), hmlVarC, 48);
            hmlVarC.n();
            g(disaVar, disbVar.c, hmlVarC, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: disf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ditk.m(disbVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void n(disb disbVar, ditl ditlVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final disb disbVar2;
        final ditl ditlVar2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-337028306);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(disbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.B(ditlVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            disbVar2 = disbVar;
            ditlVar2 = ditlVar;
            fdaeVar2 = fdaeVar;
        } else {
            disbVar2 = disbVar;
            ditlVar2 = ditlVar;
            fdaeVar2 = fdaeVar;
            b(disbVar2, ditlVar2, fdaeVar2, hxe.d(1946717634, new ditj(ditlVar, disbVar), hmlVarC), hmlVarC, (i2 & 14) | 3072 | (i2 & 112) | ((i2 >> 3) & 896));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: disl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    disb disbVar3 = disbVar2;
                    ditl ditlVar3 = ditlVar2;
                    int i4 = i;
                    ditk.n(disbVar3, ditlVar3, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void o(final ditp ditpVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1537733782);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ditpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(icsVar, 1.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = disc.a(hmg.b(hmlVarC));
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
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            egt.a(egp.a.a(ics.e, 1.0f, true), hmlVarC);
            disb disbVar = ditpVar.c;
            hmlVarC.v(-1631576321);
            n(disbVar, ditpVar.a, ditpVar.b, hmlVarC, i3 & 896);
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: disg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ditp ditpVar2 = ditpVar;
                    int i4 = i;
                    ditk.o(ditpVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void p(final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1115168592);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(R.drawable.product_logo_gshield_color_48) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(5004770);
            int i4 = i2 & 112;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 32 || objS == hmk.a) {
                objS = new hpl(z ? efy.h(16.0f, 16.0f, 0.0f, 16.0f, 4) : efy.h(12.0f, 0.0f, 8.0f, 0.0f, 10), hsi.a);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dnc.a(jqq.a(R.drawable.product_logo_gshield_color_48, hmlVarC, i2 & 14), null, egq.k(efy.c(ics.e, (egc) ((hox) objS).a()), true != z ? 24.0f : 40.0f), null, null, 0.0f, null, hmlVarC, 0, 120);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: disj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    ditk.p(z, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final long q(hml hmlVar) {
        hmlVar.v(1186664705);
        hmlVar.v(-2076514936);
        long j = glz.a(hmlVar).a;
        hmw hmwVar = (hmw) hmlVar;
        hmwVar.ab();
        hmwVar.ab();
        return j;
    }

    private static final gal r(hml hmlVar) {
        hmlVar.v(-56649089);
        egc egcVar = dtdc.a;
        hmlVar.v(1394806726);
        long j = glz.a(hmlVar).a;
        hmw hmwVar = (hmw) hmlVar;
        hmwVar.ab();
        gal galVarF = dtdc.f(j, hmlVar, 13);
        hmwVar.ab();
        return galVarF;
    }
}
