package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ddz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftj(ddp ddpVar, boolean z, ddz ddzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = z;
        this.d = ddzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ftj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Float f = new Float(true != this.c ? 0.8f : 1.0f);
            ddz ddzVar = this.d;
            this.a = 1;
            if (ddp.k(ddpVar, f, ddzVar, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ftj(this.b, this.c, this.d, fcxyVar);
    }
}
