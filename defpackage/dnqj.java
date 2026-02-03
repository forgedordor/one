package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqj extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dnql c;
    final /* synthetic */ dnqr d;
    final /* synthetic */ dnqs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqj(dnql dnqlVar, dnqr dnqrVar, dnqs dnqsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnqlVar;
        this.d = dnqrVar;
        this.e = dnqsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnqj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dnql dnqlVar = this.c;
            dnqr dnqrVar = this.d;
            dnqs dnqsVar = this.e;
            this.a = dnqlVar;
            this.b = 1;
            Object objA = dnqrVar.a.a(dnqsVar.a, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            obj2 = dnqlVar;
            obj = objA;
        }
        dnkf dnkfVarA = (dnkf) obj;
        if (dnkfVarA == null) {
            dnmj dnmjVar = this.c.v;
            if (dnmjVar == null) {
                fdbq.c("emojiSet");
                dnmjVar = null;
            }
            dnkfVarA = dnmjVar.a();
        }
        int i = dnql.y;
        ((dnql) obj2).w = dnkfVarA;
        this.c.D();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnqj(this.c, this.d, this.e, fcxyVar);
    }
}
