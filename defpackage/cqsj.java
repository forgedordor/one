package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqsj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cqsk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqsj(cqsk cqskVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cqskVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqsj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cjzq cjzqVar = (cjzq) this.b.a.b();
            this.a = 1;
            obj = cjzqVar.i(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(obj == ckbz.TOGGLE_STATE_USER_DISABLED);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cqsj(this.b, fcxyVar);
    }
}
