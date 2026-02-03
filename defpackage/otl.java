package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otl extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdoa b;
    final /* synthetic */ ots c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otl(fdoa fdoaVar, ots otsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdoaVar;
        this.c = otsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((otl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            fdpf fdpfVar = new fdpf(this.b);
            otk otkVar = new otk(this.c, fdjxVar);
            this.a = 1;
            if (fdpfVar.a(otkVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        otl otlVar = new otl(this.b, this.c, fcxyVar);
        otlVar.d = obj;
        return otlVar;
    }
}
