package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gex implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;

    public gex(fdat fdatVar, fdat fdatVar2) {
        this.a = fdatVar;
        this.b = fdatVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            fdat fdatVar = this.a;
            if (fdatVar == null) {
                hmlVar.v(322524505);
            } else {
                hmlVar.v(-266690648);
                fdatVar.a(hmlVar, 0);
            }
            hmlVar.o();
            this.b.a(hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
