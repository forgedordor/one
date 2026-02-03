package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqfs implements fdat {
    final /* synthetic */ dqfq a;

    public dqfs(dqfq dqfqVar) {
        this.a = dqfqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarK = egq.k(ics.e, 44.0f);
            dqfq dqfqVar = this.a;
            gkd.a(jqq.a(dqfqVar.b, hmlVar, 0), jqu.b(dqfqVar.c, hmlVar), icsVarK, 0L, hmlVar, 384, 8);
        }
        return fctx.a;
    }
}
