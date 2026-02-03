package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbcb extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbcf b;
    final /* synthetic */ fduf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbcb(cbcf cbcfVar, fduf fdufVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbcfVar;
        this.c = fdufVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbcb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbcf cbcfVar = this.b;
            fdtm fdtmVar = new fdtm(new cbca(cbcfVar.e().e(), cbcfVar), new cbbx(this.c, null));
            this.a = 1;
            if (fdpy.a(fdtmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbcb(this.b, this.c, fcxyVar);
    }
}
