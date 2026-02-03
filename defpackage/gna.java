package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gna extends fcyz implements fdat {
    int a;
    final /* synthetic */ gnc b;
    final /* synthetic */ aao c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gna(gnc gncVar, aao aaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gncVar;
        this.c = aaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gna) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gnc gncVar = this.b;
            Float f = new Float(hjr.a(this.c.b));
            this.a = 1;
            if (gncVar.a.e(f, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gna(this.b, this.c, fcxyVar);
    }
}
