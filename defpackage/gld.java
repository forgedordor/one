package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gld implements fdat {
    final /* synthetic */ gku a;
    final /* synthetic */ fdat b;

    public gld(gku gkuVar, fdat fdatVar) {
        this.a = gkuVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            glg.f(this.a.d, 12, this.b, hmlVar, 48);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
