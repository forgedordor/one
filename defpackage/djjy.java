package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djjy implements fdau {
    final /* synthetic */ djkj a;
    final /* synthetic */ igr b;

    public djjy(djkj djkjVar, igr igrVar) {
        this.a = djkjVar;
        this.b = igrVar;
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
            djkd.d(efdVar, this.a, this.b, hmlVar, iIntValue & 14);
        }
        return fctx.a;
    }
}
