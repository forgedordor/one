package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xtn {
    public static final xsi a(hsf hsfVar) {
        return (xsi) hsfVar.a();
    }

    public static final xsi b(hox hoxVar) {
        return (xsi) hoxVar.a();
    }

    public static final void c(final xsk xskVar, final xsi xsiVar, final xsi xsiVar2, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-523252814);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(xskVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(xsiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(xsiVar2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(ics.e, 1.0f);
            evm evmVar = xsl.a;
            ics icsVarE = efy.e(dkl.a(icsVarD, xsl.a(hmlVarC), ikj.a), 20.0f, 20.0f);
            ixm ixmVarA = egk.a(ecr.g, ibw.m, hmlVarC, 6);
            int iA = xso.a(hmg.b(hmlVarC));
            hmw hmwVar2 = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
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
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            Object objS = hmwVar2.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: xsy
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        xsk xskVar2 = xskVar;
                        if (xskVar2 != null) {
                            xskVar2.b.invoke();
                        }
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS);
            }
            hmwVar2.ab();
            dtdi.e((fdae) objS, null, true, null, null, null, xsh.b, hmlVarC, 805306752, 506);
            boolean z = !fdbq.f(xsiVar, xsiVar2);
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(xsiVar) | (i4 == 4);
            Object objS2 = hmwVar2.S();
            if (zF || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: xsz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        xsk xskVar2 = xskVar;
                        if (xskVar2 != null) {
                            xskVar2.a.invoke(xsiVar);
                        }
                        return fctx.a;
                    }
                };
                hmwVar = hmwVar2;
                hmwVar.af(objS2);
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            dtdi.a((fdae) objS2, null, z, null, null, null, null, null, xsh.c, hmlVarC, 805306368, 506);
            hmlVarC = hmlVarC;
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xta
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xsk xskVar2 = xskVar;
                    xsi xsiVar3 = xsiVar;
                    int i5 = i;
                    xtn.c(xskVar2, xsiVar3, xsiVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final ede edeVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-303734284);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            String strB = jqu.b(R.string.default_theme, hmlVarC);
            ics icsVarJ = efy.j(edeVar.a(ics.e, ibw.h), 0.0f, 0.0f, 0.0f, 10.0f, 7);
            evm evmVar = xsl.a;
            hmlVar2 = hmlVarC;
            dthx.b(strB, efy.i(icsVarJ, xsl.b, 0.0f, 2), glz.a(hmlVarC).q, kjm.c(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, jyq.y((jyq) hmlVarC.e(gyj.a), 0L, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 2, 12582911), hmlVar2, 3072, 0, 65520);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xsv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    xtn.d(edeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[PHI: r14
      0x0015: PHI (r14v1 int) = (r14v0 int), (r14v3 int) binds: [B:3:0x0007, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.hml r13, final int r14) {
        /*
            r0 = 2140918273(0x7f9bd201, float:NaN)
            hml r11 = r13.c(r0)
            if (r14 != 0) goto L15
            boolean r13 = r11.I()
            r14 = 0
            if (r13 != 0) goto L11
            goto L15
        L11:
            r11.s()
            goto L3b
        L15:
            evm r13 = defpackage.xsl.a
            long r3 = defpackage.xsl.b(r11)
            gsa r13 = defpackage.glz.c(r11)
            eve r2 = r13.e
            ico r13 = defpackage.ics.e
            r0 = 1101004800(0x41a00000, float:20.0)
            r1 = 1098907648(0x41800000, float:16.0)
            ics r13 = defpackage.efy.e(r13, r0, r1)
            ics r1 = defpackage.egq.t(r13)
            fdat r10 = defpackage.xsh.a
            r12 = 120(0x78, float:1.68E-43)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            defpackage.gvk.c(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
        L3b:
            hpx r13 = r11.L()
            if (r13 == 0) goto L48
            xsq r0 = new xsq
            r0.<init>()
            r13.d = r0
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtn.e(hml, int):void");
    }

    public static final void f(final ede edeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1316561616);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            long j = glz.a(hmlVarC).v;
            evm evmVar = evn.a;
            evm evmVar2 = xsl.a;
            dky dkyVarA = dkz.a(2.0f, xsl.a(hmlVarC));
            ics icsVarA = edeVar.a(egq.k(ics.e, 40.0f), ibw.h);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdau() { // from class: xte
                    @Override // defpackage.fdau
                    public final Object a(Object obj, Object obj2, Object obj3) {
                        ixp ixpVar = (ixp) obj;
                        ixk ixkVar = (ixk) obj2;
                        ixpVar.getClass();
                        ixkVar.getClass();
                        final iyl iylVarE = ixkVar.e(((kil) obj3).a);
                        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: xtd
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj4) {
                                iyk iykVar = (iyk) obj4;
                                iykVar.getClass();
                                iyl iylVar = iylVarE;
                                iykVar.s(iylVar, 0, iylVar.b / 2, 0.0f);
                                return fctx.a;
                            }
                        });
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            gvk.c(iwl.a(icsVarA, (fdau) objS), evmVar, j, 0L, 0.0f, 0.0f, dkyVarA, xsh.d, hmlVarC, 56);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xtf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    xtn.f(edeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final xsn xsnVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(2067937244);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(xsnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hsf hsfVarB = hsb.b(xsnVar.a, null, null, hmlVarC, 2);
            xsi xsiVarA = a(hsfVarB);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(xsiVarA);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                hpl hplVar = new hpl(a(hsfVarB), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            hmlVarC.v(5004770);
            boolean zD2 = hmlVarC.D(hoxVar);
            Object objS2 = hmwVar.S();
            if (zD2 || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: xsw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        hoxVar.b((xsi) obj);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            fdap fdapVar = (fdap) objS2;
            hmwVar.ab();
            xsi xsiVarB = b(hoxVar);
            i(xsiVarB != null ? xsiVarB.b : null, hxe.d(-1616234550, new xtj(xsnVar, fdapVar, hsfVarB, hoxVar), hmlVarC), hmlVarC, 48);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xsx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    xtn.g(xsnVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final List list, final xsk xskVar, final xsi xsiVar, final xsi xsiVar2, final fdap fdapVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2068574092);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(xskVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(xsiVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(xsiVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdapVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            evm evmVar = xsl.a;
            ics icsVarD = egq.d(dkl.a(icoVar, xsl.a(hmlVarC), evn.c(20.0f, 20.0f, 0.0f, 0.0f)), 1.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = xso.a(hmg.b(hmlVarC));
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
            ekg ekgVar = new ekg();
            ecj ecjVarG = ecr.g(16.0f);
            ecj ecjVarG2 = ecr.g(18.0f);
            ics icsVarA = joj.a(edp.b(efy.i(icoVar, 20.0f, 0.0f, 2), 1.0f, true), "ThemeGrid");
            hmlVarC.v(-1746271574);
            boolean zF = hmlVarC.F(list) | hmlVarC.F(xsiVar2);
            boolean z = (57344 & i2) == 16384;
            Object objS = hmwVar.S();
            if ((zF | z) || objS == hmk.a) {
                objS = new fdap() { // from class: xtg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ekq ekqVar = (ekq) obj;
                        ekqVar.getClass();
                        List list2 = list;
                        elr.a(ekqVar, list2.size() + 1, null, new hxd(-1549134481, true, new xtm(list2, xsiVar2, fdapVar)), 14);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ekn.b(ekgVar, icsVarA, null, null, ecjVarG, ecjVarG2, null, false, null, (fdap) objS, hmlVarC, 1769472, 0, 924);
            c(xskVar, xsiVar2, xsiVar, hmlVarC, (i2 & 896) | ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xsp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    xsk xskVar2 = xskVar;
                    xsi xsiVar3 = xsiVar;
                    xsi xsiVar4 = xsiVar2;
                    xtn.h(list2, xskVar2, xsiVar3, xsiVar4, fdapVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final dtic dticVar, fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        fdat fdatVar2;
        final fdat fdatVar3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-359584400);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dticVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdatVar3 = fdatVar;
        } else {
            hmlVarC.v(-1963219860);
            if (dticVar == null) {
                fdatVar2 = null;
            } else {
                hmlVarC.v(5004770);
                boolean zF = hmlVarC.F(dticVar);
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                if (zF || objS == hmk.a) {
                    objS = new fdat() { // from class: xss
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Boolean) obj2).booleanValue();
                            ((Context) obj).getClass();
                            return dticVar;
                        }
                    };
                    hmwVar.af(objS);
                }
                fdatVar2 = (fdat) objS;
                hmwVar.ab();
            }
            fdat fdatVar4 = fdatVar2;
            ((hmw) hmlVarC).ab();
            fdatVar3 = fdatVar;
            cuit.a(null, fdatVar4, dljt.h(hmlVarC), null, false, fdatVar3, hmlVarC, (i2 << 12) & 458752, 25);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xst
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dtic dticVar2 = dticVar;
                    int i4 = i;
                    xtn.i(dticVar2, fdatVar3, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final defpackage.dkkr r19, defpackage.ics r20, final boolean r21, final defpackage.fdau r22, defpackage.hml r23, final int r24) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtn.j(dkkr, ics, boolean, fdau, hml, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.ics r18, java.lang.String r19, boolean r20, defpackage.hml r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtn.k(ics, java.lang.String, boolean, hml, int, int):void");
    }

    public static final void l(final ics icsVar, final String str, final boolean z, final boolean z2, final String str2, final fdae fdaeVar, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1919960412);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(str2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(icsVar2, 1.0f);
            evm evmVar = xsl.a;
            ics icsVarJ = efy.j(icsVarD, 0.0f, 0.0f, 0.0f, 20.0f, 7);
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = xso.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
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
            edf edfVar = edf.a;
            ico icoVar = ics.e;
            ics icsVarO = egq.o(egq.e(egq.d(icoVar, 1.0f), 180.0f), 112.0f);
            long jB = xsl.b(hmlVarC);
            evm evmVar2 = xsl.a;
            ics icsVarA = iex.a(dkl.a(icsVarO, jB, evmVar2), evmVar2);
            hmlVarC.v(5004770);
            int i4 = 458752 & i2;
            Object objS = hmwVar.S();
            if (i4 == 131072 || objS == hmk.a) {
                objS = new fdae() { // from class: xtb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarA2 = dihi.a(joj.a(efy.e(dli.e(icsVarA, false, null, (fdae) objS, 15), xsl.b, 40.0f), str2), str, true);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA2 = xso.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarA2);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
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
            k(efy.j(icoVar, 0.0f, 0.0f, 0.0f, 8.0f, 7), null, false, hmlVarC, 6, 14);
            k(null, null, true, hmlVarC, 3072, 7);
            hmlVarC.n();
            if (z2 && !z) {
                hmlVarC.v(-957586076);
                d(edfVar, hmlVarC, 6);
                hmwVar.ab();
            } else if (z) {
                hmlVarC.v(-957532477);
                f(edfVar, hmlVarC, 6);
                hmwVar.ab();
            } else {
                hmlVarC.v(-957500764);
                hmwVar.ab();
            }
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: xtc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    String str3 = str;
                    boolean z3 = z;
                    boolean z4 = z2;
                    String str4 = str2;
                    xtn.l(icsVar3, str3, z3, z4, str4, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
