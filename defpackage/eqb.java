package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqb extends fcyz implements fdat {
    int a;
    final /* synthetic */ eqc b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqb(eqc eqcVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = eqcVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eqb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eqc eqcVar = this.b;
            int i2 = this.c;
            ept eptVar = eqcVar.b;
            this.a = 1;
            if (eptVar.f(i2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eqb(this.b, this.c, fcxyVar);
    }
}
