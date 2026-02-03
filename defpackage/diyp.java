package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diyp implements fdau {
    final /* synthetic */ diyr a;

    public diyp(diyr diyrVar) {
        this.a = diyrVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarF = efy.f(icoVar, 16.0f, 20.0f, 16.0f, 16.0f);
            diyr diyrVar = this.a;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarF);
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
            diyq.b(diyrVar.a, hmlVar, 0);
            egt.a(egq.e(icoVar, 2.0f), hmlVar);
            diyq.a(diyrVar.b, hmlVar, 0);
            hmlVar.v(2010286652);
            List list = diyrVar.c;
            if (!list.isEmpty()) {
                egt.a(egq.e(icoVar, 16.0f), hmlVar);
            }
            hmlVar.o();
            hmlVar.v(2010289391);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                djvo.a((djvp) it.next(), null, hmlVar, 0, 2);
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
