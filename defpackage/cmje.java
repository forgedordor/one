package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmje extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmjf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmje(cmjf cmjfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmjfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmje) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object objA = ((cqbm) this.b.a.b()).a();
            objA.getClass();
            chyx chyxVar = chyx.NO_HINT;
            this.a = 1;
            eiju eijuVarA = ((chza) objA).a(chyxVar);
            eijuVarA.getClass();
            Object objC = fdxs.c(eijuVarA, this);
            if (objC != obj2) {
                objC = fctx.a;
            }
            if (objC == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmje(this.b, fcxyVar);
    }
}
