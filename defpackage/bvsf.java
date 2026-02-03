package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvsf extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsh b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvsf(bvsh bvshVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvshVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvsf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = ((bvqv) this.b.c.b()).b();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int iB = ewyc.b(((bvqr) obj).p);
        bvsh bvshVar = this.b;
        ((bvio) bvshVar.a.b()).x(iB, (String) ((cecr) bvshVar.b.b()).a.get(), this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvsf(this.b, this.c, fcxyVar);
    }
}
