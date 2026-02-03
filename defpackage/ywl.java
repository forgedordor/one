package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ywl extends fcyz implements fdat {
    int a;
    final /* synthetic */ ywm b;
    final /* synthetic */ ajlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywl(ywm ywmVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ywmVar;
        this.c = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ywl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarD = this.b.e.D(this.c.b());
            eijuVarD.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarD, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ywl(this.b, this.c, fcxyVar);
    }
}
