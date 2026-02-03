package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlmw implements fdau {
    final /* synthetic */ dihq a;
    final /* synthetic */ djrr b;

    public dlmw(dihq dihqVar, djrr djrrVar) {
        this.a = dihqVar;
        this.b = djrrVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ede) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlnj.b(this.a, this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
