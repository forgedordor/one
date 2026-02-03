package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exm implements fdau {
    public static final exm a = new exm();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdat fdatVar = (fdat) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.F(fdatVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            fdatVar.a(hmlVar, Integer.valueOf(iIntValue & 14));
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
