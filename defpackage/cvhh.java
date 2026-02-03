package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvhh implements fdat {
    final /* synthetic */ cvha a;

    public cvhh(cvha cvhaVar) {
        this.a = cvhaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = dpc.c(efy.d(egq.c(icoVar, 1.0f), 28.0f), dpc.a(0, hmlVar, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            cvha cvhaVar = this.a;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
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
            edp edpVar = edp.a;
            egt.a(edp.b(icoVar, 1.0f, true), hmlVar);
            cvhi.d(edpVar, hmlVar, 6);
            egt.a(edp.b(icoVar, 1.0f, true), hmlVar);
            cvhi.a(cvhaVar.b, cvhaVar.a, hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
