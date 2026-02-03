package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbf implements fdat {
    final /* synthetic */ int a;
    final /* synthetic */ hbl b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;

    public hbf(int i, hbl hblVar, int i2, long j) {
        this.a = i;
        this.b = hblVar;
        this.c = i2;
        this.d = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            int i2 = this.a;
            hbl hblVar = this.b;
            int i3 = this.c;
            final String strM = hbj.M(i2, hblVar.k(), i3, hmlVar);
            long j = this.d;
            iby ibyVar = ibw.e;
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA = hmg.a(hmlVar);
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
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            boolean zD = hmlVar.D(strM);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: hbe
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jtk.k((jto) obj3, strM);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            gyj.c(gaz.a(i3, 2, 6), jsh.c(icoVar, false, (fdap) objF), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 262136);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
