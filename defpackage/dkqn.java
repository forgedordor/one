package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkqn implements fdau {
    final /* synthetic */ dkpi a;
    final /* synthetic */ String b;

    public dkqn(dkpi dkpiVar, String str) {
        this.a = dkpiVar;
        this.b = str;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ede) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkqr.a(this.a, this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
