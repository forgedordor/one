package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cycf implements fdat {
    final /* synthetic */ cyci a;

    public cycf(cyci cyciVar) {
        this.a = cyciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cyci cyciVar = this.a;
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
                objF = new fdae() { // from class: cycd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hpl(0, hsi.a);
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            hox hoxVar = (hox) hxy.a(objArr, (fdae) objF, hmlVar, 48);
            cyciVar.b(hmlVar, 0);
            int iIntValue = ((Number) hoxVar.a()).intValue();
            hwv hwvVarD = hxe.d(-1618563651, new cyce(cyciVar, hoxVar), hmlVar);
            hwvVarD.getClass();
            hmlVar.v(-134691479);
            gxg.d(iIntValue, icoVar, dthk.a(hmlVar), dthk.b(hmlVar), hxe.d(1466089050, new dthn(iIntValue), hmlVar), dtek.a, hwvVarD, hmlVar, 1572864);
            hmlVar.o();
            ((cyeh) cyciVar.c.get(((Number) hoxVar.a()).intValue())).d(hmlVar);
            hmlVar.n();
        }
        return fctx.a;
    }
}
