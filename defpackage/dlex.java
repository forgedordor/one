package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlex extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlex(ddp ddpVar, float f, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlex) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            kir kirVar = new kir(this.c);
            dia diaVarC = dea.c(250, 0, dev.a, 2);
            this.a = 1;
            if (ddp.k(ddpVar, kirVar, diaVarC, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlex(this.b, this.c, fcxyVar);
    }
}
