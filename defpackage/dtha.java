package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtha implements fdau {
    final /* synthetic */ gst a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ebk c;

    public dtha(ebk ebkVar, gst gstVar, boolean z) {
        this.c = ebkVar;
        this.a = gstVar;
        this.b = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((gtx) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtgx.a.b(this.c, null, this.a, this.b, 0L, hmlVar, 196608, 18);
        }
        return fctx.a;
    }
}
