package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gym extends fcyz implements fdat {
    int a;
    final /* synthetic */ gyp b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gym(gyp gypVar, float f, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gypVar;
        this.c = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gym) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gyp gypVar = this.b;
            ddp ddpVar = gypVar.d;
            if (ddpVar != null) {
                Float f = new Float(this.c);
                ddz ddzVar = gypVar.c ? gvx.a : gypVar.b;
                this.a = 1;
                obj = ddp.k(ddpVar, f, ddzVar, null, this, 12);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gym(this.b, this.c, fcxyVar);
    }
}
