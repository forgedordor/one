package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class divw implements fdat {
    final /* synthetic */ diwa a;

    public divw(diwa diwaVar) {
        this.a = diwaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            diwa diwaVar = this.a;
            ics icsVarB = ics.e;
            if (diwaVar.c) {
                icsVarB = cyi.b(icsVarB);
            }
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarB);
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
            hsk.b(hmlVar, icsVarB2, jbb.c);
            djrr djrrVar = diwaVar.b;
            hmlVar.v(-270717210);
            if (djrrVar != null) {
                divy.a(djrrVar, hmlVar, 0);
            }
            hmlVar.o();
            divy.b(diwaVar.a, djrrVar != null, hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
