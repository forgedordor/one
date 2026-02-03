package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edyb implements fdat {
    final /* synthetic */ ioi a;
    final /* synthetic */ long b;

    public edyb(ioi ioiVar, long j) {
        this.a = ioiVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.b(this.a, null, null, this.b, hmlVar, 48, 4);
        }
        return fctx.a;
    }
}
