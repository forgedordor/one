package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aokf extends fcyz implements fdat {
    int a;
    final /* synthetic */ aokg b;
    final /* synthetic */ aoer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aokf(aokg aokgVar, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aokgVar;
        this.c = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aokf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aokg aokgVar = this.b;
        aoer aoerVar = this.c;
        this.a = 1;
        Object objB = aokgVar.b(aoerVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aokf(this.b, this.c, fcxyVar);
    }
}
