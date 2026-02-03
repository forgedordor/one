package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abir extends fcyz implements fdat {
    int a;
    final /* synthetic */ efwo b;
    final /* synthetic */ egej c;
    final /* synthetic */ fcsu d;
    final /* synthetic */ fcsu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abir(efwo efwoVar, egej egejVar, fcsu fcsuVar, fcsu fcsuVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = efwoVar;
        this.c = egejVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abir) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            efwo efwoVar = this.b;
            abiu abiuVar = abiu.a;
            efwoVar.getClass();
            egej egejVar = this.c;
            fcsu fcsuVar = this.d;
            fcsu fcsuVar2 = this.e;
            this.a = 1;
            if (abiuVar.a(efwoVar, egejVar, fcsuVar, fcsuVar2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abir(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
