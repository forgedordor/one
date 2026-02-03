package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djqf implements fdat {
    final /* synthetic */ djqp a;

    public djqf(djqp djqpVar) {
        this.a = djqpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarI = efy.i(icoVar, 8.0f, 0.0f, 2);
            djqp djqpVar = this.a;
            ixm ixmVarA = edl.a(ecr.c, ibw.k, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarI);
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
            dkqr.h(djqpVar.a, egq.k(icoVar, 56.0f), hmlVar, 48);
            egt.a(egq.e(icoVar, 8.0f), hmlVar);
            ics icsVarX = egq.x(icoVar, 0.0f, 56.0f, 1);
            dthx.b(djqpVar.b, icsVarX, glz.a(hmlVar).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVar).l, hmlVar, 48, 3120, 55288);
            hmlVar.n();
        }
        return fctx.a;
    }
}
