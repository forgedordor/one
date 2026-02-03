package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpse extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpsf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpse(dpsf dpsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpse) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dpsf dpsfVar = this.b;
            dpsd dpsdVar = new dpsd(dpsfVar, null);
            this.a = 1;
            if (fdpy.b(dpsfVar.c, dpsdVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpse(this.b, fcxyVar);
    }
}
