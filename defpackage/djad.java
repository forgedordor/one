package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djad implements fdat {
    final /* synthetic */ djah a;

    public djad(djah djahVar) {
        this.a = djahVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djah djahVar = this.a;
            if (djahVar.b) {
                hmlVar.v(1178280142);
                djae.a(djahVar.d, hmlVar, 0);
                hmlVar.o();
            } else {
                hmlVar.v(1178366508);
                djae.c(djahVar.d, hmlVar, 0);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
