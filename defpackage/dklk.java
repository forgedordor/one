package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dklk implements fdau {
    final /* synthetic */ dkly a;
    final /* synthetic */ dklt b;

    public dklk(dkly dklyVar, dklt dkltVar) {
        this.a = dklyVar;
        this.b = dkltVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        efd efdVar = (efd) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        efdVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(efdVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkly dklyVar = this.a;
            dklo.d(dklyVar.b(), efdVar.b(ics.e, ibw.n), null, this.b, dklyVar.a(), hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
