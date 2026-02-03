package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dteq implements fdat {
    final /* synthetic */ ghy a;
    final /* synthetic */ geq b;
    final /* synthetic */ gfd c;

    public dteq(ghy ghyVar, gfd gfdVar, geq geqVar) {
        this.a = ghyVar;
        this.c = gfdVar;
        this.b = geqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ghy ghyVar = this.a;
            gev.a.a(ghyVar.d(), ghyVar.c(), this.c, efy.c(ics.e, dter.b), this.b.c, hmlVar, 199680);
        }
        return fctx.a;
    }
}
