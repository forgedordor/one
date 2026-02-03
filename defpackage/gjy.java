package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjy implements fdat {
    final /* synthetic */ fdat a;

    public gjy(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVarL = egq.l(ics.e, kis.a((gjl.a(0) ? 8.0f : gjl.a(1) ? 16.0f : gjl.a(2) ? 28.0f : 0.0f) + 24.0f, 40.0f));
            fdat fdatVar = this.a;
            ixm ixmVarA = ecz.a(ibw.e, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarL);
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
