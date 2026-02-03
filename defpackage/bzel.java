package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzel extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzem b;
    final /* synthetic */ eqnd c;
    final /* synthetic */ bzbz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzel(fcxy fcxyVar, bzem bzemVar, eqnd eqndVar, bzbz bzbzVar) {
        super(2, fcxyVar);
        this.b = bzemVar;
        this.c = eqndVar;
        this.d = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzel) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
                eiju eijuVarV = this.b.c.V(this.c, bzem.a, bzem.b, cpxz.b(this.d.c));
                this.a = 1;
                obj = fdxs.c(eijuVarV, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            String str = ((eqnd) obj).c;
            str.getClass();
            objA = new bzcd(str);
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        return new fctk(objA);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzel bzelVar = new bzel(fcxyVar, this.b, this.c, this.d);
        bzelVar.e = obj;
        return bzelVar;
    }
}
