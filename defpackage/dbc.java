package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbc extends fdbr implements fdap {
    final /* synthetic */ dbg a;
    final /* synthetic */ iyl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbc(dbg dbgVar, iyl iylVar) {
        super(1);
        this.a = dbgVar;
        this.b = iylVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iyk iykVar = (iyk) obj;
        dbg dbgVar = this.a;
        boolean zE = dbgVar.l().e();
        iyl iylVar = this.b;
        if (!zE) {
            ihu ihuVarB = dbgVar.m().b();
            if (ihuVarB != null) {
                ivy ivyVarB = iykVar.b();
                long jC = 0;
                if (ivyVarB != null) {
                    jC = kjc.c(ihs.d(ihuVarB.c(), dbgVar.n().h(ivyVarB, 0L)));
                }
                iykVar.s(iylVar, kjb.a(jC), kjb.b(jC), 0.0f);
            } else {
                iykVar.s(iylVar, 0, 0, 0.0f);
            }
        } else if (dbgVar.l().e() || !dbgVar.m().j()) {
            iykVar.s(iylVar, 0, 0, 0.0f);
        }
        return fctx.a;
    }
}
