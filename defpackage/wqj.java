package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wqj extends fcyz implements fdat {
    int a;
    final /* synthetic */ wqm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqj(wqm wqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wqj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wqm wqmVar = this.b;
            eiju eijuVarE = wqmVar.d.e(wqmVar.b);
            eijuVarE.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarE, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wqj(this.b, fcxyVar);
    }
}
