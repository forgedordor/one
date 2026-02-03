package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvoc extends fcyz implements fdap {
    int a;
    final /* synthetic */ bvmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvoc(bvmw bvmwVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = bvmwVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        eiju eijuVarE = ((bvll) this.b.c.b()).e();
        this.a = 1;
        Object objC = fdxs.c(eijuVarE, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bvoc(this.b, (fcxy) obj).b(fctx.a);
    }
}
