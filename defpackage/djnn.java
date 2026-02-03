package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djnn implements fdau {
    final /* synthetic */ djms a;

    public djnn(djms djmsVar) {
        this.a = djmsVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            djms djmsVar = this.a;
            ixm ixmVarA = ecz.a(ibw.e, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            djmd.c(djmsVar.a, new ije(glz.a(hmlVar).w), hmlVar, 0, 0);
            hmlVar.n();
            egt.a(egq.e(icoVar, 12.0f), hmlVar);
            djmd.f(djmsVar.b, true, hmlVar, 48);
            djmd.h(djmsVar.c, djmsVar.d, efy.j(icoVar, 24.0f, 16.0f, 24.0f, 0.0f, 8), hmlVar, 0, 8);
        }
        return fctx.a;
    }
}
