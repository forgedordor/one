package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fqv implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ dpn b;
    final /* synthetic */ fdau c;

    public fqv(ics icsVar, dpn dpnVar, fdau fdauVar) {
        this.a = icsVar;
        this.b = dpnVar;
        this.c = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarC = dpc.c(efm.b(efy.i(this.a, 0.0f, 8.0f, 1), 2), this.b, false & ((14 & 8) == 0), (14 & 2) != 0, true);
            fdau fdauVar = this.c;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA = hmg.a(hmlVar);
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
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdauVar.a(edp.a, hmlVar, 6);
            hmlVar.n();
        }
        return fctx.a;
    }
}
