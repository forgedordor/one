package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djuf implements fdau {
    public static final djuf a = new djuf();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ego egoVar = (ego) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egoVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egoVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            int i = iIntValue & 14;
            djul.a(egoVar, hmlVar, i);
            djul.c(hmlVar, 0);
            djul.a(egoVar, hmlVar, i);
        }
        return fctx.a;
    }
}
