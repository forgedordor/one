package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ygt implements fdau {
    public static final ygt a = new ygt();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dlpy dlpyVar = (dlpy) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        dlpyVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(dlpyVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            yig.a(dlpyVar, hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}
