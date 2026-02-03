package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehpr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdvc b;
    final /* synthetic */ ehpj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehpr(fdvc fdvcVar, ehpj ehpjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdvcVar;
        this.c = ehpjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ehpr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdvc fdvcVar = this.b;
            ehpq ehpqVar = new ehpq(this.c);
            this.a = 1;
            if (fdvcVar.a(ehpqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ehpr(this.b, this.c, fcxyVar);
    }
}
