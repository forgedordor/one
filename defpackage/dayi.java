package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayi extends fcyz implements fdat {
    int a;
    final /* synthetic */ daym b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayi(daym daymVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = daymVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            daym daymVar = this.b;
            fctx fctxVar = fctx.a;
            this.a = 1;
            if (daymVar.p.fO(fctxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dayi(this.b, fcxyVar);
    }
}
