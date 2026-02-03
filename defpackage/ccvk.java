package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccvk extends fcyz implements fdap {
    int a;
    final /* synthetic */ ccvp b;
    final /* synthetic */ cbum c;
    final /* synthetic */ awyv d;
    final /* synthetic */ ccpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvk(ccvp ccvpVar, cbum cbumVar, awyv awyvVar, ccpl ccplVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ccvpVar;
        this.c = cbumVar;
        this.d = awyvVar;
        this.e = ccplVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ccvp ccvpVar = this.b;
            cbum cbumVar = this.c;
            String str = (String) this.d.e().get();
            ccpl ccplVar = this.e;
            this.a = 1;
            if (ccvpVar.d(cbumVar, str, ccplVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ccvk(this.b, this.c, this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
