package defpackage;

import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cymy {
    public final fcsu a;
    public final fcsu b;
    private final fcsu c;

    public cymy(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
    }

    public static final Instant a(hox hoxVar) {
        return (Instant) hoxVar.a();
    }

    private static final daka f(hsf hsfVar) {
        return (daka) hsfVar.a();
    }

    private final Instant g(hml hmlVar) {
        hmlVar.v(1637942445);
        hmlVar.v(1849434622);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        Object obj = hmk.a;
        if (objS == obj) {
            hpl hplVar = new hpl(Instant.ofEpochMilli(((cogw) this.c.b()).f().toEpochMilli()), hsi.a);
            hmwVar.af(hplVar);
            objS = hplVar;
        }
        hox hoxVar = (hox) objS;
        hmwVar.ab();
        fctx fctxVar = fctx.a;
        hmlVar.v(5004770);
        Object objS2 = hmwVar.S();
        if (objS2 == obj) {
            objS2 = new cyms(hoxVar, null);
            hmwVar.af(objS2);
        }
        hmwVar.ab();
        hob.g(fctxVar, (fdat) objS2, hmlVar);
        Instant instantA = a(hoxVar);
        hmwVar.ab();
        return instantA;
    }

    public final void b(final cylp cylpVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1434031489);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cylpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-580238441);
            List list = cylpVar.a;
            if (!list.isEmpty()) {
                d("Running", hmlVarC, (i2 & 112) | 6);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cyni.e(g(hmlVarC), (cynk) it.next(), hmlVarC, 0);
                }
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            hmlVarC.v(-580232451);
            List list2 = cylpVar.b;
            if (!list2.isEmpty()) {
                d("Scheduled", hmlVarC, (i2 & 112) | 6);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    cyni.e(g(hmlVarC), (cynl) it2.next(), hmlVarC, 0);
                }
            }
            hmwVar.ab();
            hmlVarC.v(-580226278);
            List list3 = cylpVar.c;
            if (!list3.isEmpty()) {
                d("Finished", hmlVarC, (i2 & 112) | 6);
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    cyni.e(g(hmlVarC), (cynj) it3.next(), hmlVarC, 0);
                }
            }
            hmwVar.ab();
            if (list.isEmpty() && list2.isEmpty() && list3.isEmpty()) {
                e("No PWQ Items", hmlVarC, (i2 & 112) | 6);
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cymo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cymy cymyVar = this.a;
                    int i4 = i;
                    cymyVar.b(cylpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void c(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-873097025);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarA = joj.a(dpc.c(ics.e, dpc.a(0, hmlVarC, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true), "scrollview");
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = cymm.a(hmg.b(hmlVarC));
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
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(this);
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new cymr(this, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hsf hsfVarC = daki.c((fdap) objS, hmlVarC);
            daka dakaVarF = f(hsfVarC);
            if (dakaVarF instanceof dajx) {
                hmlVarC.v(1736213563);
                e("Could not load data", hmlVarC, ((i2 << 3) & 112) | 6);
                hmwVar.ab();
            } else if (dakaVarF instanceof dajy) {
                hmlVarC.v(1736215956);
                e("Loading Data", hmlVarC, ((i2 << 3) & 112) | 6);
                hmwVar.ab();
            } else {
                if (!(dakaVarF instanceof dajz)) {
                    hmlVarC.v(1736212161);
                    hmwVar.ab();
                    throw new fctg();
                }
                hmlVarC.v(1736218477);
                daka dakaVarF2 = f(hsfVarC);
                dakaVarF2.getClass();
                b((cylp) ((dajz) dakaVarF2).a, hmlVarC, (i2 << 3) & 112);
                hmwVar.ab();
            }
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cymq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    this.a.c((hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void d(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1054100247);
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
            dthx.b(str, efy.e(ics.e, 28.0f, 10.0f), glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).m, hmlVar2, (i2 & 14) | 48, 0, 65528);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cymp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cymy cymyVar = this.a;
                    int i4 = i;
                    cymyVar.d(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void e(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1570942307);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarE = efy.e(egq.c(ics.e, 1.0f), 0.0f, 40.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVarC, 48);
            int iA = cymm.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarE);
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
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVarC).k, hmlVar2, i2 & 14, 0, 65534);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cymn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cymy cymyVar = this.a;
                    int i4 = i;
                    cymyVar.e(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
