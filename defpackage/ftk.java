package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftk {
    public static final void a(final ftl ftlVar, final ics icsVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(1354335728);
        int i3 = i2 == 0 ? (true != ((i & 8) == 0 ? hmlVarC.D(ftlVar) : hmlVarC.F(ftlVar)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fpx();
                hmwVar.af(objS);
            }
            fpx fpxVar = (fpx) objS;
            String strA = fua.a(7, hmlVarC);
            if (fdbq.f(ftlVar, fpxVar.a)) {
                hmlVarC.v(95895026);
                hmwVar.ab();
            } else {
                hmlVarC.v(141556958);
                fpxVar.a = ftlVar;
                List list = fpxVar.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((fpw) list.get(i4)).a);
                }
                List listAq = fcva.aq(arrayList);
                if (!listAq.contains(ftlVar)) {
                    listAq.add(ftlVar);
                }
                list.clear();
                List listB = kjw.b(listAq);
                int size2 = listB.size();
                int i5 = 0;
                while (i5 < size2) {
                    ftl ftlVar2 = (ftl) listB.get(i5);
                    list.add(new fpw(ftlVar2, hxe.d(-1032415134, new ftf(ftlVar2, ftlVar, listAq, fpxVar, strA), hmlVarC)));
                    i5++;
                    listAq = listAq;
                }
                hmwVar.ab();
            }
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
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
            fpxVar.c = hmg.d(hmlVarC);
            hmlVarC.v(-1757732554);
            List list2 = fpxVar.b;
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                fpw fpwVar = (fpw) list2.get(i6);
                Object obj = fpwVar.a;
                fdau fdauVar2 = fpwVar.b;
                hmlVarC.u(-1515535286, obj);
                fdauVar2.a(hxe.d(2017516783, new ftg(fdauVar, (ftl) obj), hmlVarC), hmlVarC, 6);
                hmwVar.ab();
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fsz
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ftl ftlVar3 = ftlVar;
                    ics icsVar2 = icsVar;
                    int i7 = i;
                    ftk.a(ftlVar3, icsVar2, fdauVar, (hml) obj2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ftn ftnVar, final ics icsVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1351125615);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(ftnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            fdauVar = fom.a;
            ftl ftlVarA = ftnVar.a();
            jgt jgtVar = (jgt) hmlVarC.e(jmh.a);
            boolean zF = hmlVarC.F(ftlVarA) | hmlVarC.F(jgtVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fth(ftlVarA, jgtVar, null);
                hmwVar.af(objS);
            }
            hob.g(ftlVarA, (fdat) objS, hmlVarC);
            a(ftnVar.a(), icsVar, fdauVar, hmlVarC, i3 & 1008);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fta
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ftn ftnVar2 = ftnVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    ftk.b(ftnVar2, icsVar2, fdauVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
