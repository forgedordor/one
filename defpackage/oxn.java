package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oxn extends fcyz implements fdat {
    int a;
    final /* synthetic */ oxm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxn(oxm oxmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = oxmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oxn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            oxm oxmVar = this.b;
            this.a = 1;
            if (oxmVar.e(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new oxn(this.b, fcxyVar);
    }
}
