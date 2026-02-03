package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnlk extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnlm b;
    final /* synthetic */ Iterable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnlk(cnlm cnlmVar, Iterable iterable, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnlmVar;
        this.c = iterable;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnlk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnlm cnlmVar = this.b;
        Iterable iterable = this.c;
        this.a = 1;
        String strP = eqhr.p();
        eqgu eqguVar = new eqgu(4, strP);
        eqhr eqhrVar = (eqhr) cnlmVar.a;
        Object objK = eqhrVar.k(eqguVar, new eqhg(eqhrVar, strP, iterable, eqguVar, null), this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnlk(this.b, this.c, fcxyVar);
    }
}
