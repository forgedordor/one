package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkyy extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkyy(ddp ddpVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkyy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Float f = new Float(true != this.c ? 0.0f : 1.0f);
            dia diaVarC = dea.c(130, 0, dev.d, 2);
            this.a = 1;
            if (ddp.k(ddpVar, f, diaVarC, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dkyy(this.b, this.c, fcxyVar);
    }
}
