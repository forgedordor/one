package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnkp extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnku b;
    final /* synthetic */ eqdr c;
    final /* synthetic */ Iterable d;
    final /* synthetic */ eqcz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnkp(cnku cnkuVar, eqdr eqdrVar, Iterable iterable, eqcz eqczVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnkuVar;
        this.c = eqdrVar;
        this.d = iterable;
        this.e = eqczVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnkp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnku cnkuVar = this.b;
        eqdr eqdrVar = this.c;
        Iterable iterable = this.d;
        eqcz eqczVar = this.e;
        this.a = 1;
        Object objA = cnkuVar.a.a(eqdrVar, iterable, eqczVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnkp(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
