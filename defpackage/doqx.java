package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doqx extends fcyz implements fdat {
    int a;
    final /* synthetic */ doqz b;
    final /* synthetic */ dlsu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doqx(doqz doqzVar, dlsu dlsuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = doqzVar;
        this.c = dlsuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doqx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        doqz doqzVar = this.b;
        dlsu dlsuVar = this.c;
        this.a = 1;
        Object objA = doqzVar.a.a(dlsuVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doqx(this.b, this.c, fcxyVar);
    }
}
