package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkkd extends fcyz implements fdat {
    int a;
    final /* synthetic */ dkly b;
    final /* synthetic */ fduf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkkd(dkly dklyVar, fduf fdufVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dklyVar;
        this.c = fdufVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkkd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdlr fdlrVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdlrVar = (fdlr) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdjx fdjxVar = (fdjx) this.d;
            fduf fdufVar = this.c;
            dkly dklyVar = this.b;
            fdlr fdlrVarD = fdil.d(fdjxVar, null, null, new dkkc(fdufVar, dklyVar, null), 3);
            long jLongValue = ((dkku) dklyVar).e.longValue();
            dkka dkkaVar = new dkka(jLongValue, null);
            this.d = fdlrVarD;
            this.a = 1;
            if (fdna.c(jLongValue, dkkaVar, this) == fcylVar) {
                return fcylVar;
            }
            fdlrVar = fdlrVarD;
        }
        fdlrVar.t(null);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dkkd dkkdVar = new dkkd(this.b, this.c, fcxyVar);
        dkkdVar.d = obj;
        return dkkdVar;
    }
}
