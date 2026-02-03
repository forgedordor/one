package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edyc implements fdat {
    final /* synthetic */ inz a;
    final /* synthetic */ long b;

    public edyc(inz inzVar, long j) {
        this.a = inzVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(this.a, null, null, this.b, hmlVar, 48, 4);
        }
        return fctx.a;
    }
}
