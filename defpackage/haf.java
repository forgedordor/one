package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class haf implements fdat {
    final /* synthetic */ hbl a;
    final /* synthetic */ gyq b;

    public haf(hbl hblVar, gyq gyqVar) {
        this.a = hblVar;
        this.b = gyqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hbl hblVar = this.a;
            gyq gyqVar = this.b;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVar, 0);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
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
            hbj.u(egq.m(icoVar, 96.0f, 80.0f), hbj.b(hblVar), hblVar, 0, gyqVar, hmlVar, 3078);
            hbj.n(egq.m(icoVar, 24.0f, 80.0f), hmlVar, 6);
            hbj.u(egq.m(icoVar, 96.0f, 80.0f), hblVar.e(), hblVar, 1, gyqVar, hmlVar, 3078);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
