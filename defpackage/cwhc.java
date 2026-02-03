package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhc {
    public static final float a(hsf hsfVar) {
        return ((Number) hsfVar.a()).floatValue();
    }

    public static final void b(final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-176963545);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdae() { // from class: cwfu
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtfk.b((fdae) objS, null, false, null, null, cwfd.a, hmlVarC, 1572864, 62);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwfv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    cwhc.b(fdaeVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dbs dbsVar, final List list, final etv etvVar, final boolean z, final boolean z2, final cyg cygVar, hml hmlVar, final int i) {
        int i2;
        boolean z3;
        ics icsVarC;
        esa erzVar;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-707362796);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(etvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(cygVar) ? 65536 : 131072;
        }
        int i4 = i2;
        if ((74899 & i4) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            cwhd cwhdVar = (cwhd) list.get(etvVar.j());
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            hmwVar.ab();
            kio kioVar = (kio) hmlVarC.e(jmh.e);
            hmlVarC.v(-1170798928);
            ico icoVar = ics.e;
            if (z) {
                z3 = false;
                icsVarC = dbsVar.c(icoVar, dbsVar.b("photoSelector_0", hmlVarC), cygVar, dae.l(dea.c(500, 0, new den(0.2f, 0.0f, 0.0f, 1.0f), 2), 2), dae.m(dea.c(150, 0, new den(0.2f, 0.0f, 0.0f, 1.0f), 2), 2), dcr.d, dbq.a(), dbp.a, dcr.c);
            } else {
                z3 = false;
                icsVarC = icoVar;
            }
            hmwVar.ab();
            ixm ixmVarA = ecz.a(ibw.a, z3);
            int iA = cwfr.a(hmg.b(hmlVarC));
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
            ics icsVarA = idb.a(egq.d(icoVar, 1.0f), 10.0f);
            if (i(hoxVar) != null) {
                kir kirVarI = i(hoxVar);
                kirVarI.getClass();
                erzVar = new erz(kirVarI.a);
            } else {
                erzVar = ery.a;
            }
            hmlVar2 = hmlVarC;
            esp.c(etvVar, icsVarA, null, erzVar, 0, 0.0f, null, null, false, null, null, null, hxe.d(1711609691, new cwgn(etvVar, list, kioVar, hoxVar, z2, cwhdVar), hmlVarC), hmlVar2, ((i4 >> 6) & 14) | 48, 24576, 16372);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwgd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbs dbsVar2 = dbsVar;
                    List list2 = list;
                    etv etvVar2 = etvVar;
                    boolean z4 = z;
                    boolean z5 = z2;
                    cwhc.c(dbsVar2, list2, etvVar2, z4, z5, cygVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final dbs dbsVar, final cwfq cwfqVar, final cyg cygVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(160957385);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(cwfqVar) : hmlVarC.F(cwfqVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(cygVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtff.a(dtdu.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15), null, null, hxe.d(871282531, new cwgu(cwfqVar, dbsVar, cygVar), hmlVarC), hmlVarC, 3072, 6);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwfw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbs dbsVar2 = dbsVar;
                    cwfq cwfqVar2 = cwfqVar;
                    int i4 = i;
                    cwhc.d(dbsVar2, cwfqVar2, cygVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.dbs r29, final java.util.List r30, final defpackage.cwfb r31, defpackage.cwhe r32, final boolean r33, final defpackage.cyg r34, defpackage.hml r35, final int r36) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwhc.e(dbs, java.util.List, cwfb, cwhe, boolean, cyg, hml, int):void");
    }

    public static final void f(final String str, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1936361453);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hwv hwvVarD = hxe.d(-325933647, new cwgy(str), hmlVarC);
            hwv hwvVarD2 = hxe.d(59928755, new cwgz(fdaeVar), hmlVarC);
            hck hckVarB = dtil.b(ije.g, 0L, 0L, 0L, 0L, hmlVarC, 62);
            hmlVarC = hmlVarC;
            dtct.a(hwvVarD, null, hwvVarD2, null, 0.0f, null, hckVarB, null, hmlVarC, 390, 186);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwfz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    cwhc.f(str2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final boolean z, final cwfb cwfbVar, final chpq chpqVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1715959082);
        if (i3 == 0) {
            i2 = (true != hmlVarC.E(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(cwfbVar) : hmlVarC.F(cwfbVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.B(chpqVar.ordinal()) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (z) {
            hmlVarC.v(-1436104022);
            hmlVarC.v(-1633490746);
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && hmlVarC.F(cwfbVar));
            boolean z3 = (i2 & 896) == 256;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z3 | z2) || objS == hmk.a) {
                objS = new fdae() { // from class: cwge
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        cwfbVar.b.invoke(chpqVar);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtdi.a((fdae) objS, dihi.a(ics.e, cwfbVar.a, true), false, null, null, null, null, null, hxe.d(-1928920597, new cwha(cwfbVar), hmlVarC), hmlVarC, 805306368, 508);
            hmlVarC = hmlVarC;
            hmwVar.ab();
        } else {
            hmlVarC.v(-1435909001);
            hmlVarC.v(1849434622);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS2 = hmwVar2.S();
            if (objS2 == hmk.a) {
                objS2 = new fdae() { // from class: cwfs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS2);
            }
            hmwVar2.ab();
            dtdi.b((fdae) objS2, null, false, null, null, null, null, hxe.d(-435577800, new cwhb(cwfbVar), hmlVarC), hmlVarC, 805306758, 506);
            hmwVar2.ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwft
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    cwfb cwfbVar2 = cwfbVar;
                    int i4 = i;
                    cwhc.g(z4, cwfbVar2, chpqVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final etv etvVar, hml hmlVar, final int i) {
        int i2;
        long jF;
        String strB;
        hml hmlVarC = hmlVar.c(-1886508190);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(etvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(true) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int iB = etvVar.b();
            final int i4 = 0;
            while (i4 < iB) {
                if (etvVar.j() == i4) {
                    hmlVarC.v(-296480709);
                    jF = glz.a(hmlVarC).q;
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(-296478875);
                    long j = glz.a(hmlVarC).q;
                    jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.35f, ije.f(j));
                    ((hmw) hmlVarC).ab();
                }
                hmw hmwVar = (hmw) hmlVarC;
                Object objS = hmwVar.S();
                Object obj = hmk.a;
                if (objS == obj) {
                    objS = hob.a(fcyi.a, hmlVarC);
                    hmwVar.af(objS);
                }
                final fdjx fdjxVar = (fdjx) objS;
                hmlVarC.v(-1224400529);
                boolean zF = ((i2 & 112) == 32) | hmlVarC.F(fdjxVar) | ((i2 & 14) == i3) | hmlVarC.B(i4);
                Object objS2 = hmwVar.S();
                if (zF || objS2 == obj) {
                    objS2 = new fdae() { // from class: cwga
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            auvw.k(fdjxVar, null, null, new cwgf(etvVar, i4, null), 3);
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS2);
                }
                final fdae fdaeVar = (fdae) objS2;
                hmwVar.ab();
                ics icsVarA = idb.a(ics.e, 100.0f);
                hmlVarC.v(5004770);
                boolean zD = hmlVarC.D(fdaeVar);
                Object objS3 = hmwVar.S();
                if (zD || objS3 == obj) {
                    objS3 = new fdae() { // from class: cwgb
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdaeVar.invoke();
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS3);
                }
                hmwVar.ab();
                ics icsVarD = efy.d(dli.e(icsVarA, false, null, (fdae) objS3, 15), 12.0f);
                evm evmVar = evn.a;
                ics icsVarC = dkr.c(egq.k(dkl.a(iex.a(icsVarD, evmVar), jF, ikj.a), 24.0f), 1.0f, glz.a(hmlVarC).q, evmVar);
                int iJ = etvVar.j();
                if (iJ == i4) {
                    hmlVarC.v(-296453019);
                    strB = jqu.b(R.string.current_picture_navigation_button_content_description, hmlVarC);
                    hmwVar.ab();
                } else if (iJ == 0) {
                    hmlVarC.v(-296449726);
                    strB = jqu.b(R.string.next_picture_navigation_button_content_description, hmlVarC);
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-296445914);
                    strB = jqu.b(R.string.previous_picture_navigation_button_content_description, hmlVarC);
                    hmwVar.ab();
                }
                ecz.b(dihi.a(icsVarC, strB, true), hmlVarC, 0);
                i4++;
                i3 = 4;
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cwgc
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i5 = i;
                    cwhc.h(etvVar, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    private static final kir i(hox hoxVar) {
        return (kir) hoxVar.a();
    }

    private static final chpq j(hox hoxVar) {
        return (chpq) hoxVar.a();
    }
}
