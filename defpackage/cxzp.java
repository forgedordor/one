package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzp extends fcyz implements fdap {
    int a;
    final /* synthetic */ cxze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxzp(cxze cxzeVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cxzeVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            if (i == 1) {
            }
            return new Integer(((cpvs) obj).c);
        }
        cxze cxzeVar = this.b;
        this.a = 1;
        obj = cxzeVar.e.c(this);
        if (obj == fcylVar) {
            return fcylVar;
        }
        eiju eijuVarI = ((cpmc) obj).I();
        this.a = 2;
        obj = fdxs.c(eijuVarI, this);
        if (obj == fcylVar) {
            return fcylVar;
        }
        return new Integer(((cpvs) obj).c);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cxzp(this.b, (fcxy) obj).b(fctx.a);
    }
}
