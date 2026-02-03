package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tqn extends fcyz implements fdat {
    int a;
    final /* synthetic */ tqo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqn(tqo tqoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tqoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tqn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarA = this.b.c.a();
            eijuVarA.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        tqo tqoVar = this.b;
        eymf eymfVar = (eymf) obj;
        ekhx ekhxVarD = tqoVar.d.d();
        eymfVar.getClass();
        String str = eymfVar.c;
        alrj alrjVar = tqoVar.e;
        return Boolean.valueOf(ekhxVarD.contains(alrjVar.k(alrjVar.n(str))) && eymfVar.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tqn(this.b, fcxyVar);
    }
}
