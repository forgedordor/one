package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zyk implements fdau {
    final /* synthetic */ divg a;

    public zyk(divg divgVar) {
        this.a = divgVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar;
        hml hmlVar2 = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar2.I()) {
            hmlVar2.s();
        } else {
            divg divgVar = this.a;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar2, 0);
            long jB = hmg.b(hmlVar2);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar2.N();
            ics icsVarB = icj.b(hmlVar2, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVar2.M();
            hmlVar2.x();
            if (hmlVar2.H()) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            int i = (int) j;
            hsk.b(hmlVar2, ixmVarA, jbb.e);
            hsk.b(hmlVar2, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar2.H() || !fdbq.f(hmlVar2.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar2.y(numValueOf);
                hmlVar2.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar2, icsVarB, jbb.c);
            if (divgVar instanceof aabm) {
                hmlVar2.v(1433201567);
                aabr.a((aabm) divgVar, hmlVar2, 0);
                hmlVar2.o();
            } else if (divgVar instanceof zzo) {
                hmlVar2.v(1433203615);
                zzw.a((zzo) divgVar, hmlVar2, 0);
                hmlVar2.o();
            } else if (divgVar instanceof zzh) {
                hmlVar2.v(1433205597);
                zzj.a((zzh) divgVar, hmlVar2, 0);
                hmlVar2.o();
            } else if (divgVar instanceof zym) {
                hmlVar2.v(1433207550);
                zys.a((zym) divgVar, hmlVar2, 0);
                hmlVar2.o();
            } else if (divgVar instanceof zyv) {
                hmlVar2.v(1433209787);
                zzf.c((zyv) divgVar, hmlVar2, 0);
                hmlVar2.o();
            } else {
                hmlVar2.v(1433211050);
                hmlVar = hmlVar2;
                dthx.b("Unhandled bottom sheet", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 6, 0, 131070);
                hmlVar.o();
                hmlVar.n();
            }
            hmlVar = hmlVar2;
            hmlVar.n();
        }
        return fctx.a;
    }
}
