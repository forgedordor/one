package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxxo implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ List b;
    final /* synthetic */ cxyh c;

    public cxxo(String str, List list, cxyh cxyhVar) {
        this.a = str;
        this.b = list;
        this.c = cxyhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarD = efy.d(icoVar, 10.0f);
            String str = this.a;
            List<cxxp> list = this.b;
            cxyh cxyhVar = this.c;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarD);
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
            jyq jyqVar = glz.d(hmlVar).f;
            dthx.b(str, efy.j(icoVar, 0.0f, 10.0f, 0.0f, 30.0f, 5), glz.a(hmlVar).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyqVar, hmlVar, 0, 0, 65528);
            fpf.a(null, 0L, 0.0f, hmlVar, 0, 15);
            hmlVar.v(-842072352);
            for (cxxp cxxpVar : list) {
                cxyhVar.d(cxxpVar.a, (daka) cxxpVar.b.a(), hmlVar, 0);
                fpf.a(null, 0L, 0.0f, hmlVar, 0, 15);
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
