package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxl implements fdat {
    final /* synthetic */ djyl a;

    public djxl(djyl djylVar) {
        this.a = djylVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djyl djylVar = this.a;
            djyg.m(djylVar.b, djylVar.d, null, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
