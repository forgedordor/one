package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejey implements fdat {
    final /* synthetic */ hsf a;
    final /* synthetic */ ejfj b;

    public ejey(hsf hsfVar, ejfj ejfjVar) {
        this.a = hsfVar;
        this.b = ejfjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ejek.a(this.a, this.b.p.size(), hmlVar, 0);
        }
        return fctx.a;
    }
}
