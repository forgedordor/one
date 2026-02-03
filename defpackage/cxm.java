package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxm extends fcyz implements fdat {
    int a;
    final /* synthetic */ dhk b;
    final /* synthetic */ hsf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxm(dhk dhkVar, hsf hsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dhkVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxm) c((hps) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hps hpsVar = (hps) this.d;
            dhk dhkVar = this.b;
            fdpl fdplVarA = hsb.a(new cxk(dhkVar));
            cxl cxlVar = new cxl(hpsVar, dhkVar, this.c);
            this.a = 1;
            if (fdplVarA.a(cxlVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxm cxmVar = new cxm(this.b, this.c, fcxyVar);
        cxmVar.d = obj;
        return cxmVar;
    }
}
