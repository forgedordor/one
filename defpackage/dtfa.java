package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtfa implements fdat {
    final /* synthetic */ fnp a;
    final /* synthetic */ fdat b;

    public dtfa(fnp fnpVar, fdat fdatVar) {
        this.a = fnpVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hnj.b(new hpu[]{fxi.a.c(dtfv.a), fnr.a.c(this.a), gdd.b.c(false)}, this.b, hmlVar, 8);
        }
        return fctx.a;
    }
}
