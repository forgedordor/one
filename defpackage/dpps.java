package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpps implements fdav {
    final /* synthetic */ fdaw a;
    final /* synthetic */ dppx b;

    public dpps(fdaw fdawVar, dppx dppxVar) {
        this.a = fdawVar;
        this.b = dppxVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        kph kphVar = (kph) obj;
        kow kowVar = (kow) obj2;
        hml hmlVar = (hml) obj3;
        int iIntValue = ((Number) obj4).intValue();
        kphVar.getClass();
        kowVar.getClass();
        if ((iIntValue & 6) == 0) {
            i = (true != ((iIntValue & 8) == 0 ? hmlVar.D(kphVar) : hmlVar.F(kphVar)) ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= true != hmlVar.D(kowVar) ? 16 : 32;
        }
        if ((i & 147) == 146 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.a(kphVar, kowVar, ((dpsb) this.b).a, hmlVar, Integer.valueOf((i & 14) | 8 | (i & 112)));
        }
        return fctx.a;
    }
}
