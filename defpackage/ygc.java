package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ygc implements fdav {
    final /* synthetic */ zov a;

    public ygc(zov zovVar) {
        this.a = zovVar;
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
            zoz.a((zow) this.a.a.get(iIntValue), hmlVar, 0);
        }
        return fctx.a;
    }
}
