package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hca implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ fdat b;

    public hca(hox hoxVar, fdat fdatVar) {
        this.a = hoxVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final hox hoxVar = this.a;
            ico icoVar = ics.e;
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: hbz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        hoxVar.b((ivy) obj3);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarA = ixy.a(icoVar, (fdap) objF);
            fdat fdatVar = this.b;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVar);
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
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
