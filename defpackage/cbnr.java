package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbnr extends fcyz implements fdap {
    int a;
    final /* synthetic */ cbmm b;
    final /* synthetic */ cbno c;
    final /* synthetic */ cbod d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbnr(cbmm cbmmVar, cbno cbnoVar, cbod cbodVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cbmmVar;
        this.c = cbnoVar;
        this.d = cbodVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbmm cbmmVar = this.b;
            cbno cbnoVar = this.c;
            cbnq cbnqVar = new cbnq(cbnoVar, this.d, null);
            this.a = 1;
            if (cbmmVar.b(cbnoVar.c, cbnqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cbnr(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
