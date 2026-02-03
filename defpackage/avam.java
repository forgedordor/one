package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avam extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ long c;
    final /* synthetic */ fdau d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avam(fdpl fdplVar, long j, fdau fdauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = j;
        this.d = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avam) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aval avalVar = new aval(this.b, this.c, (fdpm) this.e, this.d, null);
            this.a = 1;
            if (fdjy.a(avalVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avam avamVar = new avam(this.b, this.c, this.d, fcxyVar);
        avamVar.e = obj;
        return avamVar;
    }
}
