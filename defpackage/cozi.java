package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cozi extends fcyz implements fdat {
    int a;
    final /* synthetic */ cozm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cozi(cozm cozmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cozmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cozi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.c;
            cozm cozmVar = this.b;
            fdkf fdkfVarA = ejaa.a(fdjxVar, cozmVar.e, new cozh(cozmVar, null));
            this.a = 1;
            if (fdkfVarA.c(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cozi coziVar = new cozi(this.b, fcxyVar);
        coziVar.c = obj;
        return coziVar;
    }
}
