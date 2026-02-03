package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpnp implements fdat {
    final /* synthetic */ dpnq a;
    final /* synthetic */ dpmg b;
    final /* synthetic */ long c;
    final /* synthetic */ dpnr d;

    public dpnp(dpnq dpnqVar, dpmg dpmgVar, long j, dpnr dpnrVar) {
        this.a = dpnqVar;
        this.b = dpmgVar;
        this.c = j;
        this.d = dpnrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.k(this.b, this.c, this.d, hmlVar);
        }
        return fctx.a;
    }
}
