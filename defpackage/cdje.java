package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdje extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdjg b;
    final /* synthetic */ Exception c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdje(cdjg cdjgVar, Exception exc, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdjgVar;
        this.c = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdje) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cdjg cdjgVar = this.b;
            if (cdjgVar.d.a()) {
                cpri.c("Getting Gaia auth check result failed", this.c);
            } else {
                eiju eijuVarB = ((cden) cdjgVar.c.b()).b(this.c);
                this.a = 1;
                if (fdxs.c(eijuVarB, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdje(this.b, this.c, fcxyVar);
    }
}
