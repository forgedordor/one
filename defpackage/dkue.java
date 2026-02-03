package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkue implements fdau {
    final /* synthetic */ dkug a;

    public dkue(dkug dkugVar) {
        this.a = dkugVar;
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
            ics icsVarI = efy.i(egq.d(icoVar, 1.0f), 0.0f, 16.0f, 1);
            dkug dkugVar = this.a;
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
            dkqr.h(dkugVar.a, egq.k(icoVar, 72.0f), hmlVar, 48);
            hmlVar.v(612123907);
            hmlVar.o();
            dkuf.b(dkugVar.b, efy.j(icoVar, 0.0f, 12.0f, 0.0f, 0.0f, 13), hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
