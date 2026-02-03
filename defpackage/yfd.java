package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfd implements fdau {
    final /* synthetic */ yen a;
    final /* synthetic */ eais b;

    public yfd(yen yenVar, eais eaisVar) {
        this.a = yenVar;
        this.b = eaisVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((eih) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            yen yenVar = this.a;
            yig.c(yenVar.d, this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
