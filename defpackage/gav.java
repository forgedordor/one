package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gav implements fdat {
    final /* synthetic */ egc a;
    final /* synthetic */ fdau b;

    public gav(egc egcVar, fdau fdauVar) {
        this.a = egcVar;
        this.b = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ico icoVar = ics.e;
            egc egcVar = gam.a;
            ics icsVarC = efy.c(egq.a(icoVar, gam.c, gam.d), this.a);
            fdau fdauVar = this.b;
            ixm ixmVarA = egk.a(ecr.e, ibw.n, hmlVar, 54);
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
            fdauVar.a(egp.a, hmlVar, 6);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
