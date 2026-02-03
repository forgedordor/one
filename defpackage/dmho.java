package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmho implements fdau {
    final /* synthetic */ inz a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public dmho(inz inzVar, String str, String str2) {
        this.a = inzVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            inz inzVar = this.a;
            String str = this.b;
            ico icoVar = ics.e;
            egc egcVar = dtdc.a;
            dtfn.a(inzVar, str, egq.k(icoVar, dtdc.c), 0L, hmlVar, 0, 8);
            dthx.b(this.c, efy.j(icoVar, dtdc.d, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, hmlVar, 0, 3120, 120828);
        }
        return fctx.a;
    }
}
