package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctnz extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctoc b;
    final /* synthetic */ cudx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctnz(ctoc ctocVar, cudx cudxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctocVar;
        this.c = cudxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctnz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctoc ctocVar = this.b;
            cudx cudxVar = this.c;
            this.a = 1;
            if (ctocVar.b(cudxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctnz(this.b, this.c, fcxyVar);
    }
}
