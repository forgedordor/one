package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckaf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckaf(ckbk ckbkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckaf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ckbk ckbkVar = this.b;
            this.a = 1;
            if (ckbkVar.q(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckaf(this.b, fcxyVar);
    }
}
