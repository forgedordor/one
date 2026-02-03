package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctle implements fdau {
    final /* synthetic */ ctlz a;
    final /* synthetic */ ctju b;

    public ctle(ctlz ctlzVar, ctju ctjuVar) {
        this.a = ctlzVar;
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
            ctlw.c(this.a.b, this.b.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
