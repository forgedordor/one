package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diup implements fdau {
    final /* synthetic */ ics a;
    final /* synthetic */ long b;
    final /* synthetic */ egc c;
    final /* synthetic */ fdau d;

    public diup(ics icsVar, long j, egc egcVar, fdau fdauVar) {
        this.a = icsVar;
        this.b = j;
        this.c = egcVar;
        this.d = fdauVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edp edpVar = (edp) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edpVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edpVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVar = this.a;
            fdau fdauVar = this.d;
            ics icsVarB = edp.b(icsVar, 1.0f, false);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarB);
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
            hsk.b(hmlVar, icsVarB2, jbb.c);
            fdauVar.a(edp.a, hmlVar, 6);
            hmlVar.n();
            egt.a(egq.e(egq.d(dkl.a(ics.e, this.b, ikj.a), 1.0f), this.c.a()), hmlVar);
        }
        return fctx.a;
    }
}
