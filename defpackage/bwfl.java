package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwfl extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwfq b;
    final /* synthetic */ ekhx c;
    final /* synthetic */ elyd d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwfl(fcxy fcxyVar, bwfq bwfqVar, ekhx ekhxVar, elyd elydVar) {
        super(2, fcxyVar);
        this.b = bwfqVar;
        this.c = ekhxVar;
        this.d = elydVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwfl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bwfq bwfqVar = this.b;
        eiju eijuVarA = ((bwjw) bwfqVar.d.b()).a(bwfqVar.l, this.c, this.d);
        this.a = 1;
        Object objC = fdxs.c(eijuVarA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwfl bwflVar = new bwfl(fcxyVar, this.b, this.c, this.d);
        bwflVar.e = obj;
        return bwflVar;
    }
}
