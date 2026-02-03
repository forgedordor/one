package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glc implements fdat {
    final /* synthetic */ gku a;
    final /* synthetic */ fdat b;

    public glc(gku gkuVar, fdat fdatVar) {
        this.a = gkuVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVarJ = efy.j(ics.e, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            gku gkuVar = this.a;
            fdat fdatVar = this.b;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarJ);
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
            hnj.a(gea.a.c(new ije(gkuVar.c)), fdatVar, hmlVar, 8);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
