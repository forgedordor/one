package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhf extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ uhg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhf(uhg uhgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = uhgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uhf) c((bsbm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bsbm bsbmVar = (bsbm) this.b;
            fcyh fcyhVarA = eicg.a(this.c.a);
            uhe uheVar = new uhe(null, bsbmVar);
            this.a = 1;
            obj = fdin.a(fcyhVarA, uheVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        uhf uhfVar = new uhf(this.c, fcxyVar);
        uhfVar.b = obj;
        return uhfVar;
    }
}
