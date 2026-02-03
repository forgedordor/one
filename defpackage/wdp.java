package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wdp implements fdaw {
    final /* synthetic */ wdq a;
    final /* synthetic */ hox b;

    public wdp(wdq wdqVar, hox hoxVar) {
        this.a = wdqVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dpom dpomVar = (dpom) obj;
        ics icsVar = (ics) obj2;
        wel welVar = (wel) obj3;
        hml hmlVar = (hml) obj4;
        int iIntValue = ((Number) obj5).intValue();
        dpomVar.getClass();
        icsVar.getClass();
        welVar.getClass();
        wdq wdqVar = this.a;
        wdqVar.i(dpomVar, icsVar, welVar, wdq.k(dpomVar, hmlVar) + ((kir) wdq.j((kio) hmlVar.e(jmh.e), hmlVar).a()).a, hmlVar, (iIntValue & 126) | 512 | (iIntValue & 896));
        wdqVar.c(welVar.e, this.b, hmlVar, 0);
        return fctx.a;
    }
}
