package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwa extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ float c;
    final /* synthetic */ gwc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwa(ddp ddpVar, float f, gwc gwcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = f;
        this.d = gwcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gwa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            kir kirVar = new kir(this.c);
            dew dewVar = this.d.c;
            this.a = 1;
            if (ddp.k(ddpVar, kirVar, dewVar, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gwa(this.b, this.c, this.d, fcxyVar);
    }
}
