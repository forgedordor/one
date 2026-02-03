package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clos extends fcyz implements fdat {
    int a;
    final /* synthetic */ clow b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clos(clow clowVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = clowVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clos) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            clow clowVar = this.b;
            this.a = 1;
            if (clowVar.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new clos(this.b, fcxyVar);
    }
}
