package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dloa extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlnp b;
    final /* synthetic */ ddp c;
    final /* synthetic */ der d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dloa(dlnp dlnpVar, ddp ddpVar, der derVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlnpVar;
        this.c = ddpVar;
        this.d = derVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dloa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && this.b.d) {
            ddp ddpVar = this.c;
            Float f = new Float(1.0f);
            dff dffVarD = dea.d(this.d, 2, 0L, 4);
            this.a = 1;
            if (ddp.k(ddpVar, f, dffVarD, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dloa(this.b, this.c, this.d, fcxyVar);
    }
}
