package defpackage;

import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacz {
    public static final Integer a(hsf hsfVar) {
        return (Integer) hsfVar.a();
    }

    public static final void b(final String str, final List list, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-806978987);
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
                objS2 = new fdap() { // from class: aacb
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
            hpxVarL.d = new fdat() { // from class: aacc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    aacz.b(str2, list, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final String str, final List list, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(463280869);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dijr.f(new diju(str, list, 4), null, icsVar, glz.a(hmlVarC).s, glz.d(hmlVarC).l, null, 0L, null, false, null, null, null, null, hmlVar2, i2 & 896, 0, 8162);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aacd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    List list2 = list;
                    int i4 = i;
                    aacz.c(str2, list2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djwc djwcVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1195929231);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djwcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(djwcVar.a, null, glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 2, false, djwcVar.g, 0, null, glz.d(hmlVarC).j, hmlVar2, 0, 48, 55290);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aacn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aacz.d(djwcVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2049081790);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).l, hmlVar2, i2 & 14, 0, 65530);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaci
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aacz.e(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1206716380);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).j, hmlVar2, i2 & 14, 0, 65534);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aach
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    aacz.f(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final djwc djwcVar, ebk ebkVar, hml hmlVar, final int i) {
        int i2;
        final ebk ebkVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(966942438);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djwcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ebkVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            ebkVar2 = ebkVar;
        } else {
            boolean z = djwcVar.d;
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: aabw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((Boolean) obj).booleanValue();
                        djwcVar.f.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ebkVar2 = ebkVar;
            dtdp.a(z, (fdap) objS, null, false, null, ebkVar2, hmlVarC, (i2 << 12) & 458752, 28);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aabx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djwc djwcVar2 = djwcVar;
                    int i5 = i;
                    aacz.g(djwcVar2, ebkVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final ics icsVar, final ebk ebkVar, final boolean z, final fdae fdaeVar, final icc iccVar, final fdau fdauVar, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1931031385);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ebkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 1024 : 2048;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(iccVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarJ = efy.j(dli.c(iex.a(egq.u(egq.d(icsVar2, 1.0f), 56.0f, 0.0f, 2), evn.b(24.0f)), ebkVar, grb.a(false, 0.0f, 0L, 7), false, null, null, fdaeVar2, 28), z ? 8.0f : 2.0f, 0.0f, z ? 2.0f : 8.0f, 0.0f, 10);
            int i4 = (i2 >> 6) & 8064;
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVarC, (i4 >> 3) & 112);
            int iA = aabv.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar3);
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
            fdauVar.a(egp.a, hmlVarC, Integer.valueOf(((i4 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaco
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    ebk ebkVar2 = ebkVar;
                    boolean z2 = z;
                    fdae fdaeVar4 = fdaeVar;
                    icc iccVar2 = iccVar;
                    aacz.h(icsVar3, ebkVar2, z2, fdaeVar4, iccVar2, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final edp edpVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-247044623);
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
            dtfk.b(fdaeVar2, efy.j(edp.a(ics.e, ibw.l), 0.0f, 0.0f, 12.0f, 0.0f, 11), false, null, null, aadb.a, hmlVarC, ((i2 >> 3) & 14) | 1572864, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aacm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    edp edpVar2 = edpVar;
                    int i4 = i;
                    aacz.i(edpVar2, fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final ics icsVar, final ebk ebkVar, final fdae fdaeVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1840581241);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ebkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarC = dli.c(efy.e(egq.d(icsVar, 1.0f), 4.0f, 4.0f), ebkVar, grb.a(false, 0.0f, 0L, 7), false, null, null, fdaeVar, 28);
            int i4 = (i2 & 7168) | 384;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = aabv.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
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
            fdauVar.a(egp.a, hmlVarC, Integer.valueOf(((i4 >> 6) & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aaby
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    ebk ebkVar2 = ebkVar;
                    fdae fdaeVar3 = fdaeVar;
                    aacz.j(icsVar2, ebkVar2, fdaeVar3, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void k(final dktq dktqVar, final boolean z, final ics icsVar, final fdjx fdjxVar, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1953532905);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dktqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdjxVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            final gsp gspVarF = gos.f(true, hmlVarC, 6, 2);
            ics icsVarJ = efy.j(icsVar, 0.0f, 8.0f, 0.0f, 16.0f, 5);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = aabv.a(hmg.b(hmlVarC));
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
            hmlVarC.v(233842367);
            if (dktqVar == null) {
                hmwVar = hmwVar2;
            } else {
                egc egcVar = dtdc.a;
                gal galVarB = dtdc.b(glz.a(hmlVarC).a, 0L, hmlVarC, 14);
                ics icsVarD = egq.d(ics.e, 1.0f);
                hmlVarC.v(-1746271574);
                boolean zF = hmlVarC.F(fdjxVar) | hmlVarC.D(gspVarF) | hmlVarC.D(dktqVar);
                Object objS = hmwVar2.S();
                if (zF || objS == hmk.a) {
                    objS = new fdae() { // from class: aacj
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdlr fdlrVarK = auvw.k(fdjxVar, null, null, new aacp(gspVarF, null), 3);
                            final dktq dktqVar2 = dktqVar;
                            fdlrVarK.hK(new fdap() { // from class: aaca
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    dktqVar2.c.invoke();
                                    return fctx.a;
                                }
                            });
                            return fctx.a;
                        }
                    };
                    hmwVar2.af(objS);
                }
                hmwVar2.ab();
                int i4 = ((i2 << 3) & 896) | 805306416;
                hmwVar = hmwVar2;
                dtdi.a((fdae) objS, icsVarD, z, null, galVarB, null, null, null, hxe.d(-528187126, new aacq(dktqVar), hmlVarC), hmlVarC, i4, 488);
                hmlVarC = hmlVarC;
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aack
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dktq dktqVar2 = dktqVar;
                    boolean z2 = z;
                    ics icsVar2 = icsVar;
                    aacz.k(dktqVar2, z2, icsVar2, fdjxVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void l(final aabu aabuVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(446859731);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(aabuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar.af(objS);
            }
            fdjx fdjxVar = (fdjx) objS;
            gsp gspVarF = gos.f(true, hmlVarC, 6, 2);
            hsf hsfVarA = lyc.a(aabuVar.d, hmlVarC);
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar.af(hplVar);
                objS2 = hplVar;
            }
            hmwVar.ab();
            WeakHashMap weakHashMap = ehg.a;
            diuy.c(ehm.b(icsVar, ehf.b(hmlVarC).e), gspVarF, 0L, 0L, aabuVar, hxe.d(-1564234416, new aacv(aabuVar, fdjxVar, gspVarF, hsfVarA, (hox) objS2), hmlVarC), hmlVarC, ((i4 << 12) & 57344) | 196608, 12);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aacg
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    aabu aabuVar2 = aabuVar;
                    int i5 = i;
                    aacz.l(aabuVar2, icsVar, (hml) obj2, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void m(final djwc djwcVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-62378329);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djwcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            icsVar2 = icsVar;
            h(icsVar2, ebkVar, djwcVar.e, djwcVar.f, djwcVar.h, hxe.d(562306920, new aacx(djwcVar, ebkVar), hmlVarC), hmlVarC, ((i2 >> 3) & 14) | 196656);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aabz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djwc djwcVar2 = djwcVar;
                    int i4 = i;
                    aacz.m(djwcVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void n(final String str, ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final ics icsVar2;
        hml hmlVarC = hmlVar.c(-563007056);
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
            hmlVarC.v(116107487);
            jyq jyqVar = glz.d(hmlVarC).f;
            hmwVar.ab();
            khk khkVar = new khk(((khk) hoxVar.a()).a);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(hoxVar);
            Object objS2 = hmwVar.S();
            if (zD || objS2 == hmk.a) {
                objS2 = new fdap() { // from class: aace
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
            hpxVarL.d = new fdat() { // from class: aacf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    aacz.n(str2, icsVar2, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void o(final djzw djzwVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-678727493);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(djzwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            j(icoVar, ebkVar, djzwVar.e, hxe.d(-497931308, new aacy(djzwVar, ebkVar), hmlVarC), hmlVarC, ((i3 >> 3) & 14) | 3120);
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: aacl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djzw djzwVar2 = djzwVar;
                    int i4 = i;
                    aacz.o(djzwVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
