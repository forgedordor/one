package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnan extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnau b;
    final /* synthetic */ dnbk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnan(dnau dnauVar, dnbk dnbkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnauVar;
        this.c = dnbkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnan) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b.f().a;
            dnam dnamVar = new dnam(this.c);
            this.a = 1;
            if (fdpy.b(fdplVar, dnamVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnan(this.b, this.c, fcxyVar);
    }
}
