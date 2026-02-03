package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grs extends fcyz implements fdat {
    int a;
    final /* synthetic */ grt b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grs(grt grtVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = grtVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((grs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            grt grtVar = this.b;
            int i2 = this.c;
            this.a = 1;
            if (grtVar.a.d(i2, grtVar.c, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new grs(this.b, this.c, fcxyVar);
    }
}
