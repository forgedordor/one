package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acfk implements fdat {
    final /* synthetic */ acey a;

    public acfk(acey aceyVar) {
        this.a = aceyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = dpc.c(efy.i(egq.c(icoVar, 1.0f), 20.0f, 0.0f, 2), dpc.a(0, hmlVar, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            acey aceyVar = this.a;
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVar, 48);
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
            egt.a(egq.e(icoVar, 20.0f), hmlVar);
            acfl.h(edpVar, hmlVar, 6);
            egt.a(egq.e(icoVar, 72.0f), hmlVar);
            acfl.g(edpVar, aceyVar, hmlVar, 6);
            egt.a(egq.u(edp.b(icoVar, 1.0f, true), 20.0f, 0.0f, 2), hmlVar);
            acfl.a(aceyVar.d, aceyVar.c, aceyVar.a, hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
