package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpue implements fdau {
    final /* synthetic */ gst a;

    public dpue(gst gstVar) {
        this.a = gstVar;
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
            dtgx.a.a(gtxVar, iex.a(egq.e(ics.e, 2.0f), evn.b(100.0f)), false, this.a, null, 0.0f, 0.0f, hmlVar, (iIntValue & 14) | 14376968, 4);
        }
        return fctx.a;
    }
}
