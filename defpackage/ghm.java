package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghm implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ geq b;

    public ghm(String str, geq geqVar) {
        this.a = str;
        this.b = geqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final String str = this.a;
            ico icoVar = ics.e;
            boolean zD = hmlVar.D(str);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: ghl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jto jtoVar = (jto) obj3;
                        jtk.n(jtoVar, 0);
                        jtk.k(jtoVar, str);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            gyj.c(str, jsh.c(icoVar, false, (fdap) objF), this.b.f, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 262136);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
