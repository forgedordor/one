package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dled implements fdau {
    final /* synthetic */ ics a;
    final /* synthetic */ dpn b;
    final /* synthetic */ dldx c;

    public dled(ics icsVar, dpn dpnVar, dldx dldxVar) {
        this.a = icsVar;
        this.b = dpnVar;
        this.c = dldxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        list.getClass();
        ics icsVarA = joj.a(efy.j(dpc.c(egq.d(this.a, 1.0f), this.b, false, true, false), 8.0f, 0.0f, 8.0f, 0.0f, 10), "suggestion_row");
        ixm ixmVarA = egk.a(ecr.h(8.0f, ibw.l), ibw.o, hmlVar, 54);
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
        dldx dldxVar = this.c;
        hsk.b(hmlVar, icsVarB, jbb.c);
        diih diihVar = dldxVar != null ? dldxVar.b : null;
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = new fdap() { // from class: dleb
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    ((Integer) obj5).intValue();
                    return dae.n(new dia(250, 100, new den(0.0f, 0.0f, 0.0f, 1.0f)), 0.0f, 0L, 6);
                }
            };
            hmlVar.y(objF);
        }
        fdap fdapVar = (fdap) objF;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            objF2 = new fdap() { // from class: dlec
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    ((Integer) obj5).intValue();
                    return dae.o(dea.c(100, 0, new den(0.3f, 0.0f, 0.8f, 0.15f), 2), 0.0f, 0L, 6);
                }
            };
            hmlVar.y(objF2);
        }
        hmlVar.o();
        diig.b(list, diihVar, fdapVar, (fdap) objF2, null, dlcx.c, hmlVar, (iIntValue & 14) | 200064);
        hmlVar.n();
        return fctx.a;
    }
}
