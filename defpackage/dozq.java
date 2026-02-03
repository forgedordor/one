package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozq(dpao dpaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dozq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        doyo doyoVarBn = this.b.bn();
        this.a = 1;
        Object objC = doyoVarBn.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dozq(this.b, fcxyVar);
    }
}
