package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyd extends fcyz implements fdap {
    int a;
    final /* synthetic */ fyf b;
    final /* synthetic */ float c;
    final /* synthetic */ ddz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyd(fyf fyfVar, float f, ddz ddzVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fyfVar;
        this.c = f;
        this.d = ddzVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fyf fyfVar = this.b;
        float f = this.c;
        ddp ddpVar = fyfVar.e;
        Float f2 = new Float(f);
        ddz ddzVar = this.d;
        this.a = 1;
        Object objK = ddp.k(ddpVar, f2, ddzVar, null, this, 12);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fyd(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
