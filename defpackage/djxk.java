package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxk implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ djyl b;

    public djxk(String str, djyl djylVar) {
        this.a = str;
        this.b = djylVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djyg.k(this.a, this.b.d, null, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
