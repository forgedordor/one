package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yio extends fcyz implements fdat {
    int a;
    final /* synthetic */ yip b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yio(yip yipVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yipVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yio) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yip yipVar = this.b;
            fdpl fdplVarA = fdqq.a(yipVar.a);
            yin yinVar = new yin(yipVar);
            this.a = 1;
            if (fdplVarA.a(yinVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yio(this.b, fcxyVar);
    }
}
