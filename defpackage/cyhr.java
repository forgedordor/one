package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyhr implements fdav {
    final /* synthetic */ oxm a;
    final /* synthetic */ cyhz b;
    final /* synthetic */ hsf c;

    public cyhr(oxm oxmVar, cyhz cyhzVar, hsf hsfVar) {
        this.a = oxmVar;
        this.b = cyhzVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        ((eih) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if ((iIntValue2 & 145) == 144 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cygi cygiVar = (cygi) this.a.f(iIntValue);
            if (cygiVar != null) {
                this.b.e(null, !cyhz.d(this.c), cygiVar.b, cygiVar.c, cygiVar.d, hmlVar, 0);
            }
        }
        return fctx.a;
    }
}
