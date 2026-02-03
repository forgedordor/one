package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yvh extends fcyz implements fdat {
    int a;
    final /* synthetic */ yvq b;
    final /* synthetic */ ytz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvh(yvq yvqVar, ytz ytzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yvqVar;
        this.c = ytzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarI = this.b.g.I(this.c.a.b(), amvx.DISPLAY_AND_ALLOW_HIDING);
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
        return new yvh(this.b, this.c, fcxyVar);
    }
}
