package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cybg implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ egc b;

    public cybg(String str, egc egcVar) {
        this.a = str;
        this.b = egcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dthx.b(this.a, dpc.c(joj.a(efy.c(ics.e, this.b), "resultField"), dpc.a(0, hmlVar, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131068);
        }
        return fctx.a;
    }
}
