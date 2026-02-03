package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpk implements fdau {
    final /* synthetic */ fdat a;

    public gpk(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = iIntValue & 17;
        if (hmlVar.J(i != 16, iIntValue & 1)) {
            this.a.a(hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
