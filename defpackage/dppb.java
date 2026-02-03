package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppb implements fdat {
    final /* synthetic */ dpov a;

    public dppb(dpov dpovVar) {
        this.a = dpovVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dpov dpovVar = this.a;
            dthx.b(dpovVar.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).j, hmlVar, 0, 0, 65534);
        }
        return fctx.a;
    }
}
