package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzeb extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzem b;
    final /* synthetic */ String c;
    final /* synthetic */ bzbz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzeb(fcxy fcxyVar, bzem bzemVar, String str, bzbz bzbzVar) {
        super(2, fcxyVar);
        this.b = bzemVar;
        this.c = str;
        this.d = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzeb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                eiju eijuVarG = this.b.c.g(this.c, cpxz.b(this.d.c));
                this.a = 1;
                obj = fdxs.c(eijuVarG, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            objA = new bzcb(this.c, !((Boolean) obj).booleanValue());
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        return new fctk(objA);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzeb bzebVar = new bzeb(fcxyVar, this.b, this.c, this.d);
        bzebVar.e = obj;
        return bzebVar;
    }
}
