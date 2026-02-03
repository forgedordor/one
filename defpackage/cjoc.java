package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjoc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cjoe b;
    final /* synthetic */ cjog c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjoc(cjoe cjoeVar, cjog cjogVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cjoeVar;
        this.c = cjogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjoc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cjoe cjoeVar = this.b;
        cjog cjogVar = this.c;
        this.a = 1;
        Object objK = cjoeVar.k(cjogVar, this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjoc(this.b, this.c, fcxyVar);
    }
}
