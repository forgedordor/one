package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzhu extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzht b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzhu(bzht bzhtVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzhtVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzhu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bzht bzhtVar = this.b;
            int i2 = this.c;
            this.a = 1;
            if (bzhtVar.b(i2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzhu(this.b, this.c, fcxyVar);
    }
}
