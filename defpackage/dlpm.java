package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlpm implements fdau {
    final /* synthetic */ djrr a;
    final /* synthetic */ String b;

    public dlpm(djrr djrrVar, String str) {
        this.a = djrrVar;
        this.b = str;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlpn.c(this.a, this.b, null, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
