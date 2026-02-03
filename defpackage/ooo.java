package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ooo extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ ooq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo(fdpl fdplVar, ooq ooqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = ooqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ooo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdtr fdtrVar = new fdtr(this.b);
            oon oonVar = new oon(this.c);
            this.a = 1;
            if (fdtrVar.a(oonVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ooo(this.b, this.c, fcxyVar);
    }
}
