package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zhz extends fcyz implements fdat {
    int a;
    final /* synthetic */ zih b;
    final /* synthetic */ zgp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhz(zih zihVar, zgp zgpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zihVar;
        this.c = zgpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zhz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarI = this.b.t.I(this.c.a.b(), amvx.DISPLAY_AND_ALLOW_HIDING);
            eijuVarI.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarI, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zhz(this.b, this.c, fcxyVar);
    }
}
