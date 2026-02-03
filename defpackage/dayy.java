package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayy implements fdau {
    final /* synthetic */ dayp a;
    final /* synthetic */ gun b;

    public dayy(dayp daypVar, gun gunVar) {
        this.a = daypVar;
        this.b = gunVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        egc egcVar = (egc) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egcVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egcVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dayp daypVar = this.a;
            dauz dauzVar = (dauz) lyc.a(daypVar.b, hmlVar).a();
            dazu dazuVar = (dazu) lyc.a(daypVar.d, hmlVar).a();
            daxu daxuVar = (daxu) lyc.a(daypVar.c, hmlVar).a();
            fdae fdaeVar = (fdae) lyc.a(daypVar.e, hmlVar).a();
            daxr daxrVar = (daxr) lyc.a(daypVar.f, hmlVar).a();
            boolean z = dauzVar instanceof dauw;
            ibx ibxVar = ibw.k;
            ecq ecqVar = z ? ecr.e : ecr.c;
            ico icoVar = ics.e;
            ics icsVarC = dpc.c(efy.j(efy.c(egq.c(icoVar, 1.0f), egcVar), 20.0f, 20.0f, 20.0f, 0.0f, 8), dpc.a(0, hmlVar, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            dayo dayoVar = daypVar.h;
            if (!dayoVar.a) {
                icsVarC = icsVarC.a(efm.a(icoVar, 2));
            }
            gun gunVar = this.b;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
            fdae fdaeVar2 = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar2);
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
            boolean z2 = dauzVar instanceof daux;
            edp edpVar = edp.a;
            if (z2) {
                hmlVar.v(1857304125);
                dayz.e(edpVar, dazuVar, daxrVar, dayoVar, hmlVar, 6);
                hmlVar.o();
            } else if (z) {
                hmlVar.v(1857307514);
                dtgm.a(null, 0L, 0.0f, 0L, 0, 0.0f, hmlVar, 0, 63);
                hmlVar.o();
            } else {
                if (!(dauzVar instanceof dauy)) {
                    hmlVar.v(1857301823);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(1857310619);
                dayz.d(edpVar, daxuVar, dazuVar, (dauy) dauzVar, daxrVar, gunVar, fdaeVar, dayoVar, hmlVar, 196678);
                hmlVar.o();
            }
            hmlVar.n();
        }
        return fctx.a;
    }
}
