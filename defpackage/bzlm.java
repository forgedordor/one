package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzlm extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzlp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzlm(fcxy fcxyVar, bzlp bzlpVar) {
        super(2, fcxyVar);
        this.b = bzlpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzlm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [cmfo, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarH = this.b.a.e.get().h().h(new ejvr() { // from class: auni
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                aumf aumfVar = ((aumq) obj2).t;
                return aumfVar == null ? aumf.a : aumfVar;
            }
        }, eoqg.a);
        this.a = 1;
        Object objC = fdxs.c(eijuVarH, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzlm bzlmVar = new bzlm(fcxyVar, this.b);
        bzlmVar.c = obj;
        return bzlmVar;
    }
}
