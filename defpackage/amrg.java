package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrg extends fcyz implements fdat {
    int a;
    final /* synthetic */ amri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrg(amri amriVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amriVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            amri amriVar = this.b;
            fdvc fdvcVar = ((cpfu) amriVar.c.b()).c;
            amrf amrfVar = new amrf(amriVar);
            this.a = 1;
            if (fdvcVar.a(amrfVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amrg(this.b, fcxyVar);
    }
}
