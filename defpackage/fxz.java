package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxz implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;

    public fxz(fdat fdatVar, fdat fdatVar2) {
        this.a = fdatVar;
        this.b = fdatVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            egc egcVar = fyb.a;
            fyb.a(8.0f, 12.0f, hxe.d(-459506658, new fxy(this.a, this.b), hmlVar), hmlVar, 438);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
