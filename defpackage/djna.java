package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djna implements fdau {
    final /* synthetic */ djmn a;

    public djna(djmn djmnVar) {
        this.a = djmnVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edp edpVar = (edp) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edpVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edpVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djmn djmnVar = this.a;
            hmlVar.v(1473635573);
            djrr djrrVar = djmnVar.c;
            if (djrrVar != null) {
                ico icoVar = ics.e;
                ics icsVarD = egq.d(icoVar, 1.0f);
                ixm ixmVarA = ecz.a(ibw.e, false);
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
                djmd.c(djrrVar, new ije(glz.a(hmlVar).f), hmlVar, 0, 0);
                hmlVar.n();
                egt.a(egq.e(icoVar, 16.0f), hmlVar);
            }
            hmlVar.o();
            djmd.f(djmnVar.a, djrrVar != null, hmlVar, 0);
            String str = djmnVar.d;
            hmlVar.v(1473646110);
            if (str != null) {
                djmd.h(str, djmnVar.e, efy.j(ics.e, 24.0f, 16.0f, 24.0f, 0.0f, 8), hmlVar, 0, 8);
            }
            hmlVar.o();
            hmlVar.v(1473655180);
            List list = djmnVar.b;
            if (!list.isEmpty()) {
                djmd.e(edp.b(ics.e, 1.0f, false), list, hmlVar, 0);
            }
            hmlVar.o();
            djvp djvpVar = djmnVar.f;
            hmlVar.v(1473661267);
            if (djvpVar != null) {
                djvo.a(new djza(null), efy.i(ics.e, 16.0f, 0.0f, 2), hmlVar, 54, 0);
                djvo.a(djvpVar, null, hmlVar, 0, 2);
            }
            hmlVar.o();
            djmd.b(djmnVar.g, djmnVar.h, hmlVar, 0);
        }
        return fctx.a;
    }
}
