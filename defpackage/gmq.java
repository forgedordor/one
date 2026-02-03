package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmq implements fdat {
    final /* synthetic */ ego a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdat c;

    public gmq(ego egoVar, fdat fdatVar, fdat fdatVar2) {
        this.a = egoVar;
        this.b = fdatVar;
        this.c = fdatVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            ics icsVarJ = efy.j(this.a.a(ics.e, 1.0f, true), this.b != null ? 12.0f : 0.0f, 0.0f, 0.0f, 0.0f, 10);
            fdat fdatVar = this.c;
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
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
