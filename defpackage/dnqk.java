package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqk extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnqr b;
    final /* synthetic */ dnqs c;
    final /* synthetic */ dnql d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqk(dnqr dnqrVar, dnqs dnqsVar, dnql dnqlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnqrVar;
        this.c = dnqsVar;
        this.d = dnqlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnqk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnqr dnqrVar = this.b;
            dnqs dnqsVar = this.c;
            this.a = 1;
            obj = dnqrVar.a.a(dnqsVar.a, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        dnkf dnkfVarA = (dnkf) obj;
        if (dnkfVarA == null) {
            dnkfVarA = this.c.a.a();
        }
        dnql dnqlVar = this.d;
        dnkf dnkfVar = dnqlVar.w;
        if (dnkfVar == null || !fdbq.f(dnkfVar, dnkfVarA)) {
            fdlr fdlrVar = dnqlVar.u;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            dnqlVar.v = this.c.a;
            dnqlVar.w = dnkfVarA;
            dnqlVar.D();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnqk(this.b, this.c, this.d, fcxyVar);
    }
}
