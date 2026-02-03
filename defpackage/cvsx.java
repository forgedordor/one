package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvsx extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvta b;
    final /* synthetic */ cpkr c;
    final /* synthetic */ elka d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsx(cvta cvtaVar, cpkr cpkrVar, elka elkaVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvtaVar;
        this.c = cpkrVar;
        this.d = elkaVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvsx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cvta cvtaVar = this.b;
            cpkr cpkrVar = this.c;
            int i2 = this.e;
            this.a = 1;
            Object objC = ((cpjw) cvtaVar.f.e.b()).c(cpkg.c(cpkrVar, elka.CONVERSATION_FROM_UNSPAM_ACTION, i2), this);
            if (objC != fcylVar) {
                objC = fctx.a;
            }
            if (objC == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvsx(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
