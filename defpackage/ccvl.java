package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccvl extends fcyz implements fdap {
    int a;
    final /* synthetic */ cbum b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvl(cbum cbumVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cbumVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbum cbumVar = this.b;
            this.a = 1;
            if (cbumVar.t(enba.UNKNOWN_OPERATION, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ccvl(this.b, (fcxy) obj).b(fctx.a);
    }
}
