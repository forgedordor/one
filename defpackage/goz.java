package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goz implements fdat {
    final /* synthetic */ hsf a;

    public goz(hsf hsfVar) {
        this.a = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ico icoVar = ics.e;
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: goy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jtk.b((jto) obj3);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarC = jsh.c(icoVar, false, (fdap) objF);
            hsf hsfVar = this.a;
            ixm ixmVarA = ecz.a(ibw.a, false);
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
            ((fdat) hsfVar.a()).a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
