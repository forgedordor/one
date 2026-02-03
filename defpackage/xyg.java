package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xyg implements fdat {
    final /* synthetic */ xyz a;

    public xyg(xyz xyzVar) {
        this.a = xyzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        xyz xyzVar;
        hml hmlVar;
        hml hmlVar2 = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar2.I()) {
            hmlVar2.s();
        } else {
            xyz xyzVar2 = this.a;
            ecj ecjVar = ecr.e;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecjVar, ibw.j, hmlVar2, 6);
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
            String str = xyzVar2 != null ? xyzVar2.a : null;
            hmlVar2.v(62428805);
            if (str != null) {
                xyzVar = xyzVar2;
                dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVar2).g, hmlVar2, 0, 3120, 55294);
                hmlVar2 = hmlVar2;
            } else {
                xyzVar = xyzVar2;
            }
            hmlVar2.o();
            xyz xyzVar3 = xyzVar;
            String str2 = xyzVar3 != null ? xyzVar3.b : null;
            hmlVar2.v(62435782);
            if (str2 != null) {
                hmlVar = hmlVar2;
                dthx.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).k, hmlVar, 0, 0, 65534);
            } else {
                hmlVar = hmlVar2;
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
