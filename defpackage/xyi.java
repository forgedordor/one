package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xyi implements fdau {
    final /* synthetic */ xyz a;

    public xyi(xyz xyzVar) {
        this.a = xyzVar;
    }

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
            xyz xyzVar = this.a;
            dppg.e(egoVar, xyzVar != null ? xyzVar.c : fcvo.a, 0, hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}
