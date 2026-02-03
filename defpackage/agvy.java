package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agvy extends fcyz implements fdat {
    int a;
    final /* synthetic */ agvz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvy(agvz agvzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agvzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agvy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            agvz agvzVar = this.b;
            fdpl fdplVarA = fdqq.a(new agvx(new agvu(new fdua(agvzVar.g.b, agvzVar.n, new agvq(agvzVar, null)))));
            agvr agvrVar = new agvr(agvzVar);
            this.a = 1;
            if (fdplVarA.a(agvrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agvy(this.b, fcxyVar);
    }
}
