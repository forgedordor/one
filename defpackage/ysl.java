package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ysl extends fcyz implements fdat {
    int a;
    final /* synthetic */ yss b;
    final /* synthetic */ ajlt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysl(yss yssVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yssVar;
        this.c = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ysl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yss yssVar = this.b;
            ajlt ajltVar = this.c;
            this.a = 1;
            if (yssVar.c(ajltVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ysl(this.b, this.c, fcxyVar);
    }
}
