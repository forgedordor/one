package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djtl implements fdat {
    final /* synthetic */ djtg a;
    final /* synthetic */ Object b;
    final /* synthetic */ eve c;
    final /* synthetic */ iva d;

    public djtl(djtg djtgVar, Object obj, eve eveVar, iva ivaVar) {
        this.a = djtgVar;
        this.b = obj;
        this.c = eveVar;
        this.d = ivaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djto.d(this.a, this.b, this.c, this.d, hmlVar, 0);
        }
        return fctx.a;
    }
}
