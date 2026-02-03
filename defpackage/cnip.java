package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnip extends fcyz implements fdat {
    int a;
    final /* synthetic */ cniq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnip(cniq cniqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cniqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnip) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            if (!((Boolean) ((cczi) crbf.bM.get()).e()).booleanValue()) {
                return fctx.a;
            }
            cniq cniqVar = this.b;
            this.a = 1;
            obj = cniqVar.a.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnip(this.b, fcxyVar);
    }
}
