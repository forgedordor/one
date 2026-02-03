package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class guy implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ String b;
    final /* synthetic */ guk c;

    public guy(long j, guk gukVar, String str) {
        this.a = j;
        this.c = gukVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            long j = this.a;
            egc egcVar = gam.a;
            gal galVarE = gam.e(0L, j, hmlVar, 13);
            final guk gukVar = this.c;
            boolean zD = hmlVar.D(gukVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: guw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdis fdisVar = gukVar.a;
                        if (fdisVar.i()) {
                            fdisVar.w(gvc.b);
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            gax.b((fdae) objF, null, false, null, galVarE, null, hxe.d(521110564, new gux(this.b), hmlVar), hmlVar, 805306368, 494);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
