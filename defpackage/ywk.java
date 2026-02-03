package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ywm b;
    final /* synthetic */ ajlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywk(ywm ywmVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ywmVar;
        this.c = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarE = this.b.e.E(this.c.b());
            eijuVarE.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarE, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ywk(this.b, this.c, fcxyVar);
    }
}
