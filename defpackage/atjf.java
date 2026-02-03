package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atjf extends fcyz implements fdat {
    int a;
    final /* synthetic */ atjl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atjf(atjl atjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atjf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        atjl atjlVar = this.b;
        this.a = 1;
        Object objC = atjlVar.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atjf(this.b, fcxyVar);
    }
}
