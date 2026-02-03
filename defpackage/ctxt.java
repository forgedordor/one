package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxt extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctxu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctxt(ctxu ctxuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctxuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctxt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctxu ctxuVar = this.b;
            fdpl fdplVarA = fdqc.a(ctxuVar.a.a());
            ctxs ctxsVar = new ctxs(ctxuVar);
            this.a = 1;
            if (fdplVarA.a(ctxsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctxt(this.b, fcxyVar);
    }
}
