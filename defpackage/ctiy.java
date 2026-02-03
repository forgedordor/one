package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctiy extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctiz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctiy(ctiz ctizVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctizVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctiy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctiz ctizVar = this.b;
            fdpl fdplVarA = ctizVar.b.a();
            ctix ctixVar = new ctix(ctizVar);
            this.a = 1;
            if (fdplVarA.a(ctixVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctiy(this.b, fcxyVar);
    }
}
