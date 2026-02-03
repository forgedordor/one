package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgr implements fdat {
    final /* synthetic */ cwfq a;
    final /* synthetic */ fdae b;

    public cwgr(cwfq cwfqVar, fdae fdaeVar) {
        this.a = cwfqVar;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cwfq cwfqVar = this.a;
            cwhc.f(cwfqVar.a, this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
