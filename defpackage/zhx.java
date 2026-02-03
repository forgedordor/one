package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zhx extends fcyz implements fdat {
    int a;
    final /* synthetic */ zih b;
    final /* synthetic */ zgp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhx(zih zihVar, zgp zgpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zihVar;
        this.c = zgpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zhx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            zih zihVar = this.b;
            zgp zgpVar = this.c;
            eiju eijuVarI = zihVar.t.I(zgpVar.a.b(), zgpVar.b ? amvx.HIDE_AND_ALLOW_SHOWING : amvx.HIDE_AND_REQUIRE_EXTRA_CONSENT_BEFORE_SHOWING);
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
        return new zhx(this.b, this.c, fcxyVar);
    }
}
