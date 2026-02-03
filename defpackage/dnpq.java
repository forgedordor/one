package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnpq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnpz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnpq(dnpz dnpzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnpzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnpq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dnkh dnkhVar = this.b.a;
        if (dnkhVar == null) {
            fdbq.c("categoriesService");
            dnkhVar = null;
        }
        this.a = 1;
        Object objB = dnkhVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnpq(this.b, fcxyVar);
    }
}
