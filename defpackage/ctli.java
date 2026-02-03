package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctli implements fdau {
    final /* synthetic */ ctoe a;
    final /* synthetic */ ctju b;

    public ctli(ctoe ctoeVar, ctju ctjuVar) {
        this.a = ctoeVar;
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
            ctoj.c(this.a, null, this.b.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
