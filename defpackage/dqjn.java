package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjn extends fcyz implements fdap {
    int a;
    final /* synthetic */ dqjo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjn(dqjo dqjoVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dqjoVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dqjo dqjoVar = this.b;
            fcyh fcyhVarHE = dqjoVar.b.hE();
            dqjm dqjmVar = new dqjm(dqjoVar, null);
            this.a = 1;
            if (fdin.a(fcyhVarHE, dqjmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqjn(this.b, (fcxy) obj).b(fctx.a);
    }
}
