package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvrd extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvrd(bvsb bvsbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvrd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bvsb bvsbVar = this.b;
        this.a = 1;
        Object objO = bvsbVar.o(this);
        return objO == fcylVar ? fcylVar : objO;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvrd(this.b, fcxyVar);
    }
}
