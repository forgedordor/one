package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbgy extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbhl b;
    final /* synthetic */ cbdg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbgy(cbhl cbhlVar, cbdg cbdgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbhlVar;
        this.c = cbdgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbgy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbhl cbhlVar = this.b;
        cbdg cbdgVar = this.c;
        this.a = 1;
        Object objE = cbhlVar.e(cbdgVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbgy(this.b, this.c, fcxyVar);
    }
}
