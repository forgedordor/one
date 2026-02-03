package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yvg extends fcyz implements fdat {
    int a;
    final /* synthetic */ yvq b;
    final /* synthetic */ ytz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvg(yvq yvqVar, ytz ytzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yvqVar;
        this.c = ytzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yvq yvqVar = this.b;
            ytz ytzVar = this.c;
            eiju eijuVarI = yvqVar.g.I(ytzVar.a.b(), ytzVar.b ? amvx.HIDE_AND_ALLOW_SHOWING : amvx.HIDE_AND_REQUIRE_EXTRA_CONSENT_BEFORE_SHOWING);
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
        return new yvg(this.b, this.c, fcxyVar);
    }
}
