package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxww implements fdat {
    final /* synthetic */ cxwz a;

    public cxww(cxwz cxwzVar) {
        this.a = cxwzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cxwz cxwzVar = this.a;
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
            Object[] objArr = new Object[0];
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdae() { // from class: cxwu
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hph(0);
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            hri hriVar = (hri) hxy.a(objArr, (fdae) objF, hmlVar, 48);
            cxwzVar.b(hmlVar, 0);
            dtho.a(hriVar.c(), null, null, 0L, 0L, 0.0f, null, null, 0.0f, hxe.d(-1146862623, new cxwv(cxwzVar, hriVar), hmlVar), hmlVar, 805306368, 510);
            ((cxwl) cxwzVar.b.get(hriVar.c())).b(hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
