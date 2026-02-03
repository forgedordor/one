package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjk extends fcyz implements fdap {
    int a;
    final /* synthetic */ dqjo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjk(dqjo dqjoVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dqjoVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dqjo dqjoVar = this.b;
        fcyh fcyhVarHE = dqjoVar.b.hE();
        dqjj dqjjVar = new dqjj(dqjoVar, null);
        this.a = 1;
        Object objA = fdin.a(fcyhVarHE, dqjjVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqjk(this.b, (fcxy) obj).b(fctx.a);
    }
}
