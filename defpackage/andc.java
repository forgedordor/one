package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class andc extends fcyz implements fdat {
    int a;
    final /* synthetic */ andf b;
    final /* synthetic */ aneb c;
    final /* synthetic */ int d;
    long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public andc(fcxy fcxyVar, andf andfVar, aneb anebVar, int i) {
        super(2, fcxyVar);
        this.b = andfVar;
        this.c = anebVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((andc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        long j;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            j = this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            andf andfVar = this.b;
            aneb anebVar = this.c;
            long jA = andfVar.e.a();
            eiju eijuVarF = andfVar.b.f(anebVar != null ? anebVar.a : null, this.d);
            eijuVarF.getClass();
            this.e = jA;
            this.a = 1;
            obj = fdxs.c(eijuVarF, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            j = jA;
        }
        andf andfVar2 = this.b;
        int i = this.d;
        andk andkVar = (andk) obj;
        andkVar.getClass();
        return andfVar2.e.c(i, j, andkVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        andc andcVar = new andc(fcxyVar, this.b, this.c, this.d);
        andcVar.f = obj;
        return andcVar;
    }
}
