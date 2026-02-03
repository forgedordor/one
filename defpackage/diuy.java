package defpackage;

import java.util.List;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diuy {
    public static final void a(final divg divgVar, final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-1408454495);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(divgVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            if (divgVar instanceof divf) {
                hmlVarC.v(-610067071);
                e((divf) divgVar, icsVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(divgVar instanceof diva)) {
                    hmlVarC.v(-1732085984);
                    ((hmw) hmlVarC).ab();
                    throw new IllegalArgumentException("This type of BottomSheetUiData is not supported by BottomSheet(). Did you mean to use CustomBottomSheet() instead?");
                }
                hmlVarC.v(-610064795);
                l((diva) divgVar, icsVar, null, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diua
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    divg divgVar2 = divgVar;
                    int i6 = i;
                    diuy.a(divgVar2, icsVar, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, final List list, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1874672293);
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
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new hpl(new khk(3), hsi.a);
                hmwVar.af(objS);
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            diju dijuVar = new diju(str, list, (String) null);
            long j = glz.a(hmlVarC).s;
            jyq jyqVarY = jyq.y(glz.d(hmlVarC).k, 0L, 0L, null, null, null, null, 0L, null, ((khk) hoxVar.a()).a, 0, 0L, null, null, 0, 16744447);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(hoxVar);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: dity
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jyi jyiVar = (jyi) obj;
                        jyiVar.getClass();
                        hoxVar.b(new khk(jyiVar.f() > 3 ? 5 : 3));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            dijr.f(dijuVar, null, null, j, jyqVarY, null, 0L, (fdap) objS2, false, null, null, null, null, hmlVar2, 0, 0, 8038);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ditz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    diuy.b(str2, list, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(ics icsVar, gsp gspVar, long j, long j2, final divg divgVar, final fdau fdauVar, hml hmlVar, final int i, final int i2) {
        ics icsVar2;
        int i3;
        gsp gspVarF;
        long jA;
        long jA2;
        fdau fdauVar2;
        long j3;
        ics icsVar3;
        ics icsVar4;
        long j4;
        hml hmlVar2;
        final long j5;
        final ics icsVar5;
        final gsp gspVar2;
        final long j6;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(1501240780);
        if (i4 != 0) {
            i3 = i | 6;
            icsVar2 = icsVar;
        } else if ((i & 6) == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if ((i2 & 2) == 0) {
                gspVarF = gspVar;
                if (hmlVarC.D(gspVarF)) {
                    i5 = 32;
                }
            } else {
                gspVarF = gspVar;
            }
            i3 |= i5;
        } else {
            gspVarF = gspVar;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0) {
                jA = j;
                if (hmlVarC.C(jA)) {
                    i6 = 256;
                }
            } else {
                jA = j;
            }
            i3 |= i6;
        } else {
            jA = j;
        }
        if ((i & 3072) == 0) {
            int i7 = 1024;
            if ((i2 & 8) == 0) {
                jA2 = j2;
                if (hmlVarC.C(jA2)) {
                    i7 = 2048;
                }
            } else {
                jA2 = j2;
            }
            i3 |= i7;
        } else {
            jA2 = j2;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.D(divgVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            fdauVar2 = fdauVar;
            i3 |= true != hmlVarC.F(fdauVar2) ? 65536 : 131072;
        } else {
            fdauVar2 = fdauVar;
        }
        if ((74899 & i3) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
            icsVar5 = icsVar2;
            gspVar2 = gspVarF;
            j6 = jA;
            j5 = jA2;
        } else {
            int i8 = i2 & 8;
            int i9 = i2 & 4;
            int i10 = i2 & 2;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                ics icsVar6 = i4 != 0 ? ics.e : icsVar2;
                if (i10 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    gspVarF = gos.f(false, hmlVarC, 0, 3);
                }
                if (i9 != 0) {
                    jA = dtcz.a(hmlVarC);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    i3 &= -7169;
                    jA2 = dtcz.a(hmlVarC);
                }
                j3 = jA;
                icsVar3 = icsVar6;
            } else {
                hmlVarC.s();
                if (i10 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i9 != 0) {
                    i3 &= -897;
                }
                if (i8 != 0) {
                    i3 &= -7169;
                }
                j3 = jA;
                icsVar3 = icsVar2;
            }
            final gsp gspVar3 = gspVarF;
            hmlVarC.l();
            egc egcVarA = ehh.a(ehv.e(hmlVarC), hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            hmlVarC.v(-416602410);
            if (divgVar.c()) {
                icsVar4 = icsVar3;
                j4 = dljt.a(hmlVarC).k;
            } else {
                icsVar4 = icsVar3;
                j4 = ije.g;
            }
            long j7 = j4;
            hmwVar.ab();
            evm evmVarC = evn.c(28.0f, 28.0f, 0.0f, 0.0f);
            eee eeeVar = new eee();
            hmlVarC.v(-1746271574);
            boolean zF = ((((i3 & 112) ^ 48) > 32 && hmlVarC.D(gspVar3)) || (i3 & 48) == 32) | hmlVarC.F(fdjxVar);
            boolean z = (57344 & i3) == 16384;
            Object objS2 = hmwVar.S();
            if ((zF | z) || objS2 == obj) {
                objS2 = new fdae() { // from class: diuh
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdlr fdlrVarD = fdil.d(fdjxVar, null, null, new diuo(gspVar3, null), 3);
                        final divg divgVar2 = divgVar;
                        fdlrVarD.hK(new fdap() { // from class: diue
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj2) {
                                divgVar2.b().invoke();
                                return fctx.a;
                            }
                        });
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            long j8 = jA2;
            ics icsVar7 = icsVar4;
            hmlVar2 = hmlVarC;
            dtgc.a((fdae) objS2, icsVar7, gspVar3, 0.0f, false, evmVarC, j3, 0L, 0.0f, j7, null, eeeVar, null, hxe.d(709735982, new diup(icsVar4, j8, egcVarA, fdauVar2), hmlVarC), hmlVar2, ((i3 << 3) & 1008) | ((i3 << 12) & 3670016), 3078, 4504);
            j5 = j8;
            icsVar5 = icsVar7;
            gspVar2 = gspVar3;
            j6 = j3;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diui
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ics icsVar8 = icsVar5;
                    gsp gspVar4 = gspVar2;
                    long j9 = j6;
                    long j10 = j5;
                    divg divgVar2 = divgVar;
                    diuy.c(icsVar8, gspVar4, j9, j10, divgVar2, fdauVar, (hml) obj2, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final boolean r19, final boolean r20, final defpackage.fdae r21, defpackage.ics r22, final defpackage.fdau r23, defpackage.hml r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diuy.d(boolean, boolean, fdae, ics, fdau, hml, int, int):void");
    }

    public static final void e(final divf divfVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1505501397);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(divfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            gsp gspVarF = gos.f(true, hmlVarC, 6, 2);
            c(icsVar, gspVarF, 0L, 0L, divfVar, hxe.d(-1458929816, new diux(divfVar, (fdjx) objS, gspVarF), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 196608 | ((i2 << 12) & 57344), 12);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ditw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    divf divfVar2 = divfVar;
                    int i4 = i;
                    diuy.e(divfVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final edp edpVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-31447233);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, efy.j(edp.a(ics.e, ibw.l), 0.0f, 0.0f, 12.0f, 0.0f, 11), false, null, null, divj.b, hmlVarC, ((i2 >> 3) & 14) | 1572864, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ditv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    int i4 = i;
                    diuy.f(edpVar2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final dktq dktqVar, final boolean z, hox hoxVar, final ics icsVar, final dktq dktqVar2, hml hmlVar, final int i) {
        int i2;
        boolean z2;
        hox hoxVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1650017042);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dktqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= true != hmlVarC.E(z2) ? 16 : 32;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            hoxVar2 = hoxVar;
            i2 |= true != hmlVarC.D(hoxVar2) ? 128 : 256;
        } else {
            hoxVar2 = hoxVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(dktqVar2) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarJ = efy.j(icsVar, 0.0f, 0.0f, 0.0f, 20.0f, 7);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = ditt.a(hmg.b(hmlVarC));
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
            ico icoVar = ics.e;
            dtdi.a(dktqVar.c, egq.d(icoVar, 1.0f), ((Boolean) hoxVar2.a()).booleanValue(), null, null, null, null, null, hxe.d(864025172, new diuk(dktqVar), hmlVarC), hmlVarC, 805306416, 504);
            hmlVarC = hmlVarC;
            hmlVarC.v(-1489569256);
            if (dktqVar2 != null) {
                boolean z3 = z2;
                d(z3, ((Boolean) hoxVar2.a()).booleanValue(), dktqVar2.c, egq.d(icoVar, 1.0f), hxe.d(2060120406, new diul(dktqVar2), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 27648, 0);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final hox hoxVar3 = hoxVar2;
            hpxVarL.d = new fdat() { // from class: diub
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dktq dktqVar3 = dktqVar;
                    boolean z4 = z;
                    hox hoxVar4 = hoxVar3;
                    ics icsVar2 = icsVar;
                    diuy.g(dktqVar3, z4, hoxVar4, icsVar2, dktqVar2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final int r16, final defpackage.dktq r17, final boolean r18, defpackage.ics r19, defpackage.dktq r20, defpackage.hox r21, defpackage.hml r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diuy.h(int, dktq, boolean, ics, dktq, hox, hml, int, int):void");
    }

    public static final void i(final dktq dktqVar, final int i, final boolean z, hox hoxVar, ics icsVar, final dktq dktqVar2, hml hmlVar, final int i2) {
        int i3;
        final hox hoxVar2;
        final ics icsVar2;
        hmw hmwVar;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(634268966);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(dktqVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            hoxVar2 = hoxVar;
            i3 |= true != hmlVarC.D(hoxVar2) ? 1024 : 2048;
        } else {
            hoxVar2 = hoxVar;
        }
        if ((i2 & 24576) == 0) {
            icsVar2 = icsVar;
            i3 |= true != hmlVarC.D(icsVar2) ? 8192 : 16384;
        } else {
            icsVar2 = icsVar;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.D(dktqVar2) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarJ = efy.j(egq.d(icsVar2, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
            ixm ixmVarA = egk.a(i == 1 ? ecr.g : ecr.b, ibw.m, hmlVarC, 0);
            int iA = ditt.a(hmg.b(hmlVarC));
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
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(1922018445);
            if (dktqVar2 != null) {
                int i5 = ((i3 >> 6) & 14) | 24576;
                hmwVar = hmwVar2;
                d(z, ((Boolean) hoxVar2.a()).booleanValue(), dktqVar2.c, null, hxe.d(605252112, new dium(dktqVar2), hmlVarC), hmlVarC, i5, 8);
                egt.a(egq.o(ics.e, 8.0f), hmlVarC);
            } else {
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            dtdi.a(dktqVar.c, null, ((Boolean) hoxVar2.a()).booleanValue(), null, null, null, null, null, hxe.d(-1469610670, new diun(dktqVar), hmlVarC), hmlVarC, 805306368, 506);
            hmlVarC = hmlVarC;
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ditx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dktq dktqVar3 = dktqVar;
                    int i6 = i;
                    boolean z2 = z;
                    hox hoxVar3 = hoxVar2;
                    ics icsVar3 = icsVar2;
                    diuy.i(dktqVar3, i6, z2, hoxVar3, icsVar3, dktqVar2, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final dkts dktsVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-1103336773);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dktsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            ics icsVarG = egq.g(egq.d(icsVar, 1.0f), 192.0f);
            hmlVarC.v(-120581706);
            dnc.a(jqq.a(((dktr) dktsVar).a, hmlVarC, 0), null, icsVarG, null, null, 0.0f, null, hmlVarC, 0, 120);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diuc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkts dktsVar2 = dktsVar;
                    int i3 = i;
                    diuy.j(dktsVar2, icsVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final String str, ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(-1300533792);
        if ((i & 6) == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
            icsVar2 = icsVar;
        } else {
            ico icoVar = ics.e;
            hmlVarC.v(5004770);
            int i4 = i3 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new hpl(new khk(3), hsi.a);
                hmwVar.af(objS);
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            long j = glz.a(hmlVarC).q;
            hmlVarC.v(22518031);
            jyq jyqVar = glz.d(hmlVarC).f;
            hmwVar.ab();
            khk khkVar = new khk(((khk) hoxVar.a()).a);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(hoxVar);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: diuj
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jyi jyiVar = (jyi) obj;
                        jyiVar.getClass();
                        hoxVar.b(new khk(jyiVar.f() > 3 ? 5 : 3));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            icsVar2 = icoVar;
            dthx.b(str, icsVar2, j, 0L, null, null, 0L, khkVar, 0L, 0, false, 0, 0, (fdap) objS2, jyqVar, hmlVar2, i3 & 126, 0, 32248);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ditu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    diuy.k(str2, icsVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final diva divaVar, final ics icsVar, fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        final fdat fdatVar2;
        hml hmlVarC = hmlVar.c(1827483916);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(divaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdatVar2 = fdatVar;
        } else {
            fdatVar2 = divj.a;
            c(icsVar, gos.f(true, hmlVarC, 6, 2), glz.a(hmlVarC).p, glz.a(hmlVarC).p, divaVar, hxe.d(-242400311, new dius(divaVar, fdatVar2), hmlVarC), hmlVarC, ((i3 << 12) & 57344) | ((i3 >> 3) & 14) | 196608, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diug
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    diva divaVar2 = divaVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    diuy.l(divaVar2, icsVar2, fdatVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
