package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class docg extends fcyz implements fdat {
    int a;
    final /* synthetic */ docj b;
    final /* synthetic */ dobi c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public docg(docj docjVar, dobi dobiVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = docjVar;
        this.c = dobiVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((docg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            docj docjVar = this.b;
            dobi dobiVar = this.c;
            String str = this.d;
            dneq dneqVarAW = docjVar.aW();
            dnce dnceVar = dpil.aK;
            this.a = 1;
            if (dneq.e(dneqVarAW, dobiVar, dnceVar, str, this, 4) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new docg(this.b, this.c, this.d, fcxyVar);
    }
}
