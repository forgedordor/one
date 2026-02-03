package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjh extends fcyz implements fdap {
    int a;
    final /* synthetic */ dqjo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjh(dqjo dqjoVar, fcxy fcxyVar) {
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
            this.a = 1;
            if (dqjoVar.d.invoke(this) != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        dqjo dqjoVar2 = this.b;
        fcyh fcyhVarHE = dqjoVar2.b.hE();
        dqjg dqjgVar = new dqjg(dqjoVar2, null);
        this.a = 2;
        Object objA = fdin.a(fcyhVarHE, dqjgVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqjh(this.b, (fcxy) obj).b(fctx.a);
    }
}
