package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doew implements fdat {
    final /* synthetic */ inz a;
    final /* synthetic */ String b;

    public doew(inz inzVar, String str) {
        this.a = inzVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(this.a, this.b, egq.k(ics.e, 24.0f), 0L, hmlVar, 384, 8);
        }
        return fctx.a;
    }
}
