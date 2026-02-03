package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atvx extends fcyz implements fdat {
    int a;
    final /* synthetic */ atvy b;
    final /* synthetic */ aufh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atvx(atvy atvyVar, aufh aufhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atvyVar;
        this.c = aufhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atvx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        atvy atvyVar = this.b;
        aufh aufhVar = this.c;
        this.a = 1;
        Object objC = atvyVar.c(aufhVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atvx(this.b, this.c, fcxyVar);
    }
}
