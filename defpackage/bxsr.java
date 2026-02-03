package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxsr extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxtd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxsr(fcxy fcxyVar, bxtd bxtdVar) {
        super(2, fcxyVar);
        this.b = bxtdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxsr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVarB = this.b.a.b();
            this.a = 1;
            obj = fdtc.a(fdplVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int iA = bxsl.a(((bxsm) obj).d);
        return Boolean.valueOf((iA == 0 || iA == 1) ? false : true);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bxsr bxsrVar = new bxsr(fcxyVar, this.b);
        bxsrVar.c = obj;
        return bxsrVar;
    }
}
