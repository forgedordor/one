package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbfo extends fcyz implements fdap {
    int a;
    final /* synthetic */ cbfp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbfo(cbfp cbfpVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cbfpVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbfp.a.p("Running PWQ Janitor for this process session");
            cbkq cbkqVar = (cbkq) this.b.b.b();
            eiju eijuVarC = auvw.c(cbkqVar.h, fcyi.a, fdjz.a, new cbkl(cbkqVar, null));
            this.a = 1;
            if (fdxs.c(eijuVarC, this) == fcylVar) {
                return fcylVar;
            }
        }
        cbfp.a.p("Janitor completed successfully");
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cbfo(this.b, (fcxy) obj).b(fctx.a);
    }
}
