package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnli extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnlm b;
    final /* synthetic */ ezol c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnli(cnlm cnlmVar, ezol ezolVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnlmVar;
        this.c = ezolVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnli) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        ezol ezolVar = this.c;
        this.a = 1;
        String strP = eqhr.p();
        eqgu eqguVar = new eqgu(3, strP);
        eqhr eqhrVar = (eqhr) cnlmVar.a;
        Object objK = eqhrVar.k(eqguVar, new eqhe(eqhrVar, strP, ezolVar, eqguVar, null), this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnli(this.b, this.c, fcxyVar);
    }
}
