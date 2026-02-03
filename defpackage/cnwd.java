package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnwd extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnwh b;
    final /* synthetic */ enqq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnwd(cnwh cnwhVar, enqq enqqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnwhVar;
        this.c = enqqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnwd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnwh cnwhVar = this.b;
            enqq enqqVar = this.c;
            this.a = 1;
            if (cnwhVar.x(enqqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnwd(this.b, this.c, fcxyVar);
    }
}
