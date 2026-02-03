package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayli extends fcyz implements fdat {
    int a;
    final /* synthetic */ ayll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayli(ayll ayllVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ayllVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayli) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ayll ayllVar = this.b;
        this.a = 1;
        Object objA = ayllVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ayli(this.b, fcxyVar);
    }
}
