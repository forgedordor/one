package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agtz extends fcyz implements fdat {
    int a;
    final /* synthetic */ agua b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtz(agua aguaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aguaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agtz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            agua aguaVar = this.b;
            fdpl fdplVarA = fdqq.a(new agty(fdud.a(aguaVar.d.b, aguaVar.j, aguaVar.k, new agtv(aguaVar, null)), aguaVar));
            agtu agtuVar = new agtu(aguaVar);
            this.a = 1;
            if (fdplVarA.a(agtuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agtz(this.b, fcxyVar);
    }
}
