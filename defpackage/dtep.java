package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtep implements fdat {
    final /* synthetic */ ghy a;
    final /* synthetic */ geq b;

    public dtep(ghy ghyVar, geq geqVar) {
        this.a = ghyVar;
        this.b = geqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gev.a.b(this.a.c(), efy.c(ics.e, dter.a), this.b.b, hmlVar, 3120);
        }
        return fctx.a;
    }
}
