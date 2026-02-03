package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dimw implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;

    public dimw(djrr djrrVar, int i, long j) {
        this.a = djrrVar;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(this.a, hmlVar), jqu.b(this.b, hmlVar), djrq.a(egq.c(ics.e, 1.0f), (kji) hmlVar.e(jmh.j)), this.c, hmlVar, 0, 0);
        }
        return fctx.a;
    }
}
