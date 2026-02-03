package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgt extends fcyz implements fdat {
    int a;
    final /* synthetic */ qgr b;
    final /* synthetic */ qjn c;
    final /* synthetic */ qgk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgt(qgr qgrVar, qjn qjnVar, qgk qgkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qgrVar;
        this.c = qjnVar;
        this.d = qgkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qgt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            qgr qgrVar = this.b;
            qjn qjnVar = this.c;
            qgk qgkVar = this.d;
            fdpl fdplVarA = qgrVar.a(qjnVar);
            qgs qgsVar = new qgs(qgkVar, qjnVar);
            this.a = 1;
            if (fdplVarA.a(qgsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qgt(this.b, this.c, this.d, fcxyVar);
    }
}
