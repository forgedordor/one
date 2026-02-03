package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkmw implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ long b;

    public dkmw(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dthx.b(this.a, efy.e(ics.e, 8.0f, 2.0f), this.b, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).o, hmlVar, 432, 0, 65528);
        }
        return fctx.a;
    }
}
