package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djub implements fdat {
    final /* synthetic */ djrr a;
    final /* synthetic */ boolean b;

    public djub(djrr djrrVar, boolean z) {
        this.a = djrrVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarK = egq.k(efy.d(ics.e, 8.0f), 20.0f);
            inz inzVarB = djrs.b(this.a, hmlVar);
            if (((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() || this.b) {
                hmlVar.v(1061865088);
                j = glz.a(hmlVar).g;
                hmlVar.o();
            } else {
                hmlVar.v(1061929723);
                j = glz.a(hmlVar).s;
                hmlVar.o();
            }
            dtfn.a(inzVarB, null, icsVarK, j, hmlVar, 384, 0);
        }
        return fctx.a;
    }
}
