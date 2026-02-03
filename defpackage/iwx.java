package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwx extends fdbr implements fdat {
    final /* synthetic */ iwo a;
    final /* synthetic */ fdat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwx(iwo iwoVar, fdat fdatVar) {
        super(2);
        this.a = iwoVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            iwo iwoVar = this.a;
            fdat fdatVar = this.b;
            boolean zA = iwoVar.a();
            hmlVar.K(Boolean.valueOf(zA));
            boolean zE = hmlVar.E(zA);
            if (zA) {
                fdatVar.a(hmlVar, 0);
            } else {
                hmlVar.k(zE);
            }
            hmlVar.q();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
