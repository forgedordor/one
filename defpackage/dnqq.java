package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnqr b;
    final /* synthetic */ dnmj c;
    final /* synthetic */ dnql d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnqq(dnqr dnqrVar, dnmj dnmjVar, dnql dnqlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnqrVar;
        this.c = dnmjVar;
        this.d = dnqlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnqq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnqr dnqrVar = this.b;
            dnmj dnmjVar = this.c;
            this.a = 1;
            obj = dnqrVar.a.a(dnmjVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        dnmj dnmjVar2 = this.c;
        dnkf dnkfVar = (dnkf) obj;
        boolean zIsEmpty = dnmjVar2.i().isEmpty();
        if (dnkfVar != null || zIsEmpty) {
            this.b.J(this.d);
        } else {
            dnqr dnqrVar2 = this.b;
            dnql dnqlVar = this.d;
            dnqrVar2.N(dnqlVar, dnmjVar2, dnqlVar.s);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnqq(this.b, this.c, this.d, fcxyVar);
    }
}
