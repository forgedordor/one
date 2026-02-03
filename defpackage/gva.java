package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gva implements fdat {
    final /* synthetic */ guk a;

    public gva(guk gukVar) {
        this.a = gukVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final guk gukVar = this.a;
            boolean zD = hmlVar.D(gukVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: guz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        gukVar.a();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            gjz.b((fdae) objF, null, false, null, null, gdv.a, hmlVar, 1572864, 62);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
