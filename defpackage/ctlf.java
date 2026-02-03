package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctlf implements fdau {
    final /* synthetic */ ctot a;
    final /* synthetic */ ctju b;

    public ctlf(ctot ctotVar, ctju ctjuVar) {
        this.a = ctotVar;
        this.b = ctjuVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((eih) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ctov.a(this.a.b, this.b.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
