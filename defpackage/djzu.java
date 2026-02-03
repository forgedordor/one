package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djzu implements fdat {
    final /* synthetic */ djzw a;

    public djzu(djzw djzwVar) {
        this.a = djzwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djzw djzwVar = this.a;
            djrr djrrVar = djzwVar.c;
            if (djrrVar != null) {
                hmlVar.v(-467187457);
                dtfn.a(djrs.b(djrrVar, hmlVar), null, null, 0L, hmlVar, 0, 12);
                hmlVar.o();
            } else {
                hmlVar.v(-467096348);
                dtgo.a(djzwVar.d, djzwVar.e, null, false, null, null, hmlVar, 0, 60);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
