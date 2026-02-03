package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gek implements fdat {
    final /* synthetic */ String a;

    public gek(String str) {
        this.a = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            String str = this.a;
            ico icoVar = ics.e;
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: gej
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            gyj.c(str, jsh.b(icoVar, (fdap) objF), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 262140);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
