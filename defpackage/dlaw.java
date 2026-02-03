package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlaw {
    public static final void a(final dlax dlaxVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-933938367);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlaxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(524947434);
            dljl dljlVar = dljt.d(hmlVarC).q;
            dljl dljlVar2 = dljt.d(hmlVarC).q;
            dap dapVarN = dae.n(new dia(250, 150, dljt.d(hmlVarC).r.f), 0.8f, 0L, 4);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(802523688);
            dljl dljlVar3 = dljt.d(hmlVarC).q;
            dljl dljlVar4 = dljt.d(hmlVarC).q;
            dap dapVarL = dae.l(new dia(100, 150, dljt.d(hmlVarC).r.d), 2);
            hmwVar.ab();
            dap dapVarA = dapVarN.a(dapVarL);
            hmlVarC.v(1141566733);
            dljl dljlVar5 = dljt.d(hmlVarC).q;
            dar darVarO = dae.o(dea.c(250, 0, dljt.d(hmlVarC).r.f, 2), 0.8f, 0L, 4);
            hmwVar.ab();
            hmlVarC.v(1419142987);
            dljl dljlVar6 = dljt.d(hmlVarC).q;
            dar darVarM = dae.m(dea.c(100, 0, dljt.d(hmlVarC).r.d, 2), 2);
            hmwVar.ab();
            diig.a(dlaxVar, null, dapVarA, darVarO.a(darVarM), null, fdauVar, hmlVarC, ((i2 << 12) & 458752) | (i2 & 14), 16);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlaf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlax dlaxVar2 = dlaxVar;
                    int i4 = i;
                    dlaw.a(dlaxVar2, fdauVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dlad dladVar, final dlad dladVar2, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1078569442);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dladVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dladVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            eeq.b(efy.i(egq.d(ics.e, 1.0f), 16.0f, 0.0f, 2), ecr.b, null, null, 0, 0, hxe.d(-1152124711, new dlat(dladVar2, dladVar), hmlVarC), hmlVarC, 1572918, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlap
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlad dladVar3 = dladVar;
                    int i4 = i;
                    dlaw.b(dladVar3, dladVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final String str, final List list, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1890084261);
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
            dijr.f(new diju(str, list, 4), null, efy.j(ics.e, 52.0f, 0.0f, 16.0f, 0.0f, 10), 0L, glz.d(hmlVarC).k, null, k(hmlVarC), null, false, null, null, null, null, hmlVar2, 384, 0, 8106);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlaj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dlaw.c(str2, list, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djrr djrrVar, final String str, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1520395521);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVarC, 48);
            int iA = dlae.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
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
            egp egpVar = egp.a;
            egt.a(egq.o(icoVar, 16.0f), hmlVarC);
            g(djrrVar, hmlVarC, i2 & 14);
            egt.a(egq.o(icoVar, 8.0f), hmlVarC);
            h(egpVar, str, hmlVarC, (i2 & 112) | 6);
            f(fdaeVar, hmlVarC, (i2 >> 6) & 14);
            egt.a(egq.o(icoVar, 4.0f), hmlVarC);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlao
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    String str2 = str;
                    int i4 = i;
                    dlaw.d(djrrVar2, str2, fdaeVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void e(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(862048619);
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
            dthx.b(str, efy.j(ics.e, 52.0f, 0.0f, 16.0f, 0.0f, 10), glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).g, hmlVar2, (i2 & 14) | 48, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlam
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlaw.e(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void f(fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(422118303);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
        } else {
            fdaeVar2 = fdaeVar;
            dtfk.b(fdaeVar2, null, false, null, null, dlaz.a, hmlVarC, (i2 & 14) | 1572864, 62);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlah
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlaw.f(fdaeVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final djrr djrrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1108272406);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = dkl.a(egq.k(icoVar, 28.0f), k(hmlVarC), evn.a);
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = dlae.a(hmg.b(hmlVarC));
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
            dtfn.a(djrs.b(djrrVar, hmlVarC), null, egq.k(icoVar, 18.0f), glz.a(hmlVarC).x, hmlVarC, 384, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlak
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlaw.g(djrrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void h(final ego egoVar, final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-533737987);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(egoVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, egoVar.a(ics.e, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).i, hmlVar2, (i2 >> 3) & 14, 3120, 55292);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlal
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ego egoVar2 = egoVar;
                    int i4 = i;
                    dlaw.h(egoVar2, str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void i(final dlad dladVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1274785448);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dladVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fdae fdaeVar = dladVar.b;
            egc egcVar = dtdc.a;
            dtdi.a(fdaeVar, null, false, null, dtdc.b(k(hmlVarC), glz.a(hmlVarC).x, hmlVarC, 12), null, null, null, hxe.d(1485835928, new dlau(dladVar), hmlVarC), hmlVarC, 805306368, 494);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlan
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlaw.i(dladVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void j(final dlad dladVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(920548122);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dladVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fdae fdaeVar = dladVar.b;
            egc egcVar = dtdc.a;
            dtdi.e(fdaeVar, null, false, null, dtdc.f(k(hmlVarC), hmlVarC, 13), null, hxe.d(-703129833, new dlav(dladVar), hmlVarC), hmlVarC, 805306368, 494);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlai
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlaw.j(dladVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final long k(hml hmlVar) {
        hmlVar.v(1888419344);
        long jD = ijg.d(true != dlv.a(hmlVar) ? 4287372568L : 4294565596L);
        ((hmw) hmlVar).ab();
        return jD;
    }

    public static final void l(final dlax dlaxVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1369635439);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dlaxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            a(dlaxVar, hxe.d(-1607509562, new dlas(icsVar), hmlVarC), hmlVarC, (i3 & 14) | 48);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlag
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlax dlaxVar2 = dlaxVar;
                    int i4 = i;
                    dlaw.l(dlaxVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
