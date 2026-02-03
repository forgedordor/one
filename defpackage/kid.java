package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kid implements fdat {
    final /* synthetic */ Object[] a;
    final /* synthetic */ hri b;

    public kid(Object[] objArr, hri hriVar) {
        this.a = objArr;
        this.b = hriVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final Object[] objArr = this.a;
            fdat fdatVar = kia.a;
            boolean zF = hmlVar.F(objArr);
            final hri hriVar = this.b;
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: kic
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hri hriVar2 = hriVar;
                        hriVar2.i((hriVar2.c() + 1) % objArr.length);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fqi.b(fdatVar, (fdae) objF, null, null, 0L, 0L, null, hmlVar, 6);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
