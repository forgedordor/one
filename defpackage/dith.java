package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dith implements fdau {
    final /* synthetic */ disb a;

    public dith(disb disbVar) {
        this.a = disbVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            disb disbVar = this.a;
            String str = disbVar.a;
            ditk.k(str, hmlVar, 0);
            ditk.a(disbVar.e, str != null, hmlVar, 0);
        }
        return fctx.a;
    }
}
