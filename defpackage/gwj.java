package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwj implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dnk c;
    final /* synthetic */ boolean d;
    final /* synthetic */ fdae e;
    final /* synthetic */ fdau f;

    public gwj(ics icsVar, boolean z, dnk dnkVar, boolean z2, fdae fdaeVar, fdau fdauVar) {
        this.a = icsVar;
        this.b = z;
        this.c = dnkVar;
        this.d = z2;
        this.e = fdaeVar;
        this.f = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVarD = egq.d(eut.a(this.a, this.b, null, this.c, this.d, new jrw(4), this.e), 1.0f);
            fdau fdauVar = this.f;
            ixm ixmVarA = edl.a(ecr.e, ibw.k, hmlVar, 54);
            int iA = hmg.a(hmlVar);
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
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
