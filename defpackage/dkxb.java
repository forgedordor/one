package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkxb implements fdau {
    final /* synthetic */ dkul a;
    final /* synthetic */ String b;

    public dkxb(dkul dkulVar, String str) {
        this.a = dkulVar;
        this.b = str;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkul dkulVar = this.a;
            String str = this.b;
            icc iccVar = ibw.n;
            ecj ecjVarG = ecr.g(8.0f);
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecjVarG, iccVar, hmlVar, 54);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            hmlVar.v(-1925997229);
            if (dkulVar != null) {
                dkxj.r(dkulVar, egq.k(icoVar, 20.0f), hmlVar, 48);
            }
            hmlVar.o();
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131070);
            hmlVar.n();
        }
        return fctx.a;
    }
}
