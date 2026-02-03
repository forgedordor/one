package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class thw implements fdau {
    final /* synthetic */ tip a;
    final /* synthetic */ ftn b;

    public thw(tip tipVar, ftn ftnVar) {
        this.a = tipVar;
        this.b = ftnVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((egc) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            tip tipVar = this.a;
            ftn ftnVar = this.b;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 0);
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
            fuh.a(edp.b(icoVar, 1.0f, true), null, glz.a(hmlVar).p, 0L, 0.0f, hxe.d(-1335315746, new thv(tipVar, ftnVar), hmlVar), hmlVar, 1572864, 58);
            hmlVar.n();
        }
        return fctx.a;
    }
}
