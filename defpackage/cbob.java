package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbob extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbod b;
    final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbob(cbod cbodVar, Throwable th, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cbodVar;
        this.c = th;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbob) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbod cbodVar = this.b;
            eiju eijuVarB = cbodVar.e.b(this.c);
            this.a = 1;
            if (fdxs.c(eijuVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cbob(this.b, this.c, fcxyVar);
    }
}
