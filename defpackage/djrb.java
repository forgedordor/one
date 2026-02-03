package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djrb implements fdat {
    final /* synthetic */ eve a;
    final /* synthetic */ djrj b;

    public djrb(eve eveVar, djrj djrjVar) {
        this.a = eveVar;
        this.b = djrjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarA = iex.a(ics.e, this.a);
            djrj djrjVar = this.b;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            hmlVar.v(755002959);
            List list = djrjVar.a;
            int size = list.size();
            if (size == 2) {
                hmlVar.v(-1740934179);
                djre.e((djrl) list.get(0), (djrl) list.get(1), hmlVar, 0);
                hmlVar.o();
            } else if (size == 3) {
                hmlVar.v(-1740931337);
                djre.d((djrl) list.get(0), (djrl) list.get(1), (djrl) list.get(2), hmlVar, 0);
                hmlVar.o();
            } else if (size == 4) {
                hmlVar.v(-1740925664);
                djre.b((djrl) list.get(0), (djrl) list.get(1), (djrl) list.get(2), (djrl) list.get(3), 0, hmlVar, 0, 16);
                hmlVar.o();
            } else if (size == 5) {
                hmlVar.v(-1740919223);
                djre.a((djrl) list.get(0), list.subList(1, 5), 0, hmlVar, 0, 4);
                hmlVar.o();
            } else if (size >= 6) {
                hmlVar.v(-1740915431);
                djre.a((djrl) list.get(0), list.subList(1, 5), list.size() - 5, hmlVar, 0, 0);
                hmlVar.o();
            } else {
                hmlVar.v(1866350559);
                hmlVar.o();
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
