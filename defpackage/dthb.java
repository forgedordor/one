package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dthb implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ gst b;

    public dthb(boolean z, gst gstVar) {
        this.a = z;
        this.b = gstVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gtx gtxVar = (gtx) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        gtxVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != ((iIntValue & 8) == 0 ? hmlVar.D(gtxVar) : hmlVar.F(gtxVar)) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtgx.a.a(gtxVar, null, this.a, this.b, null, 0.0f, 0.0f, hmlVar, (iIntValue & 14) | 12582920, 114);
        }
        return fctx.a;
    }
}
