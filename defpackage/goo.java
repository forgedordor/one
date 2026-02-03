package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goo extends fcyz implements fdat {
    int a;
    final /* synthetic */ gsp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goo(gsp gspVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gspVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((goo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gsp gspVar = this.b;
            this.a = 1;
            if (gspVar.g(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new goo(this.b, fcxyVar);
    }
}
