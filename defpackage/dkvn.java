package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkvn implements fdau {
    final /* synthetic */ dkxu a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;

    public dkvn(dkxu dkxuVar, boolean z, boolean z2) {
        this.a = dkxuVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkxu dkxuVar = this.a;
            ics icsVarU = egq.u(dkvo.m(ics.e, dkxuVar.e, hmlVar), 112.0f, 0.0f, 2);
            boolean z = this.b;
            boolean z2 = this.c;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarU);
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
            dkvq dkvqVar = dkxuVar.c;
            hmlVar.v(-491028420);
            if (dkvqVar != null) {
                dkvo.c(dkvqVar, z2, null, hmlVar, 0, 4);
            }
            hmlVar.o();
            hmlVar.v(-491025654);
            if (dkxuVar.a != null || dkxuVar.b != null || !dkxuVar.d.isEmpty()) {
                dkxj.i(dkxuVar, z, hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
