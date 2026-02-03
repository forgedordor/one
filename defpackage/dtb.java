package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dtb extends fcyz implements fdat {
    int a;
    final /* synthetic */ dtd b;
    final /* synthetic */ dod c;
    final /* synthetic */ fdat d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtb(dtd dtdVar, dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dtdVar;
        this.c = dodVar;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dtd dtdVar = this.b;
            dod dodVar = this.c;
            dta dtaVar = new dta(dtdVar, this.d, null);
            this.a = 1;
            if (dtdVar.c.b(dtdVar.b, dodVar, dtaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dtb(this.b, this.c, this.d, fcxyVar);
    }
}
