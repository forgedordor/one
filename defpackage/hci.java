package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hci extends fcyz implements fdap {
    int a;
    final /* synthetic */ hcj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hci(hcj hcjVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = hcjVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hcj hcjVar = this.b;
            this.a = 1;
            fdiu fdiuVar = new fdiu(fcym.c(this), 1);
            fdiuVar.B();
            hcjVar.a.d(true);
            hcjVar.b = fdiuVar;
            if (fdiuVar.m() == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new hci(this.b, (fcxy) obj).b(fctx.a);
    }
}
