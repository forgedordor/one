package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guj {
    public static final void a(final gun gunVar, ics icsVar, fdau fdauVar, hml hmlVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-1077081618);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(gunVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i6 = i3 | 384;
        if (hmlVarC.J((i6 & 147) != 146, i6 & 1)) {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            fdauVar = gdt.a;
            guk gukVarA = gunVar.a();
            jgt jgtVar = (jgt) hmlVarC.e(jmh.a);
            boolean zD = hmlVarC.D(gukVarA) | hmlVarC.F(jgtVar);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new gug(gukVarA, jgtVar, null);
                hmwVar.af(objS);
            }
            hob.g(gukVarA, (fdat) objS, hmlVarC);
            b(gunVar.a(), icsVar, fdauVar, hmlVarC, i6 & 1008);
        } else {
            hmlVarC.s();
        }
        final ics icsVar2 = icsVar;
        final fdau fdauVar2 = fdauVar;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gty
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gun gunVar2 = gunVar;
                    ics icsVar3 = icsVar2;
                    guj.a(gunVar2, icsVar3, fdauVar2, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final guk gukVar, final ics icsVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(-977568115);
        int i3 = i2 == 0 ? (true != hmlVarC.D(gukVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            String strB = hjw.b(R.string.m3c_snackbar_pane_title, hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new gjj();
                hmwVar.af(objS);
            }
            gjj gjjVar = (gjj) objS;
            if (fdbq.f(gukVar, gjjVar.a)) {
                hmlVarC.v(1443904981);
                hmwVar.ab();
            } else {
                hmlVarC.v(1154891726);
                gjjVar.a = gukVar;
                List list = gjjVar.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((gji) list.get(i4)).a);
                }
                List listAq = fcva.aq(arrayList);
                if (!listAq.contains(gukVar)) {
                    listAq.add(gukVar);
                }
                list.clear();
                List listB = kjw.b(listAq);
                int size2 = listB.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    guk gukVar2 = (guk) listB.get(i5);
                    list.add(new gji(gukVar2, hxe.d(-1952400805, new gue(gukVar2, gukVar, gjjVar, strB), hmlVarC)));
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
            gjjVar.c = hmg.d(hmlVarC);
            hmlVarC.v(-1888182177);
            List list2 = gjjVar.b;
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                gji gjiVar = (gji) list2.get(i6);
                Object obj = gjiVar.a;
                fdau fdauVar2 = gjiVar.b;
                hmlVarC.u(1325010085, obj);
                fdauVar2.a(hxe.d(-1893791890, new guf(fdauVar, (guk) obj), hmlVarC), hmlVarC, 6);
                hmwVar.ab();
            }
            hmwVar.ab();
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gtz
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    guk gukVar3 = gukVar;
                    ics icsVar2 = icsVar;
                    int i7 = i;
                    guj.b(gukVar3, icsVar2, fdauVar, (hml) obj2, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
