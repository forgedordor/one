package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vcd extends fcyz implements fdap {
    int a;
    final /* synthetic */ vce b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcd(vce vceVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = vceVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        vce vceVar = this.b;
        Object objB = vceVar.f.b();
        objB.getClass();
        fcyh fcyhVarA = eicg.a((fcyh) objB);
        vcc vccVar = new vcc(null, vceVar);
        this.a = 1;
        Object objA = fdin.a(fcyhVarA, vccVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new vcd(this.b, (fcxy) obj).b(fctx.a);
    }
}
