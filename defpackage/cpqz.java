package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpqz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cprd b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpqz(cprd cprdVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cprdVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpqz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cprd cprdVar = this.b;
            efwo efwoVar = this.c;
            this.a = 1;
            if (cprdVar.c(efwoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cpqz(this.b, this.c, fcxyVar);
    }
}
