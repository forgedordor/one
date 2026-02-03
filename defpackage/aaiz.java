package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaiz extends fcyz implements fdat {
    int a;
    final /* synthetic */ aaja b;
    final /* synthetic */ amkc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaiz(aaja aajaVar, amkc amkcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aajaVar;
        this.c = amkcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaiz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aaja aajaVar = this.b;
            amkc amkcVar = this.c;
            amkd amkdVarE = aajaVar.c.e();
            this.a = 1;
            if (amkdVarE.c(amkcVar) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aaiz(this.b, this.c, fcxyVar);
    }
}
