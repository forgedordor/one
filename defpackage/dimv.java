package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dimv implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;

    public dimv(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.b(djrs.a(this.a ? djrr.cQ : djrr.dg, hmlVar), jqu.b(this.b, hmlVar), djrq.a(egq.k(ics.e, 24.0f), (kji) hmlVar.e(jmh.j)), 0L, hmlVar, 0, 8);
        }
        return fctx.a;
    }
}
