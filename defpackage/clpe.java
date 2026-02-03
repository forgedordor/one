package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clpe extends fcyz implements fdat {
    int a;
    final /* synthetic */ clpk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clpe(clpk clpkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = clpkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clpe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        clpk clpkVar = this.b;
        this.a = 1;
        Object objC = clpkVar.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new clpe(this.b, fcxyVar);
    }
}
