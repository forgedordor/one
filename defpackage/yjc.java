package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yjc implements fdau {
    final /* synthetic */ yki a;

    public yjc(yki ykiVar) {
        this.a = ykiVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        eve eveVar = (eve) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        eveVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(eveVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            yki ykiVar = this.a;
            dkkr dkkrVar = ykiVar.a;
            ykv.a(ykiVar.b, eveVar, dkkrVar.q, dkkrVar.y.b, ykiVar.f, hmlVar, (iIntValue << 3) & 112, 0);
        }
        return fctx.a;
    }
}
