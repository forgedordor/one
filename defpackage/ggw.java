package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggw extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ int c;
    final /* synthetic */ fddq d;
    final /* synthetic */ hhv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggw(ejy ejyVar, int i, fddq fddqVar, hhv hhvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = i;
        this.d = fddqVar;
        this.e = hhvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ggw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ejy ejyVar = this.b;
            int i2 = this.c - this.d.a;
            hhv hhvVar = this.e;
            this.a = 1;
            if (ejy.n(ejyVar, ((i2 * 12) + hhvVar.b) - 1, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ggw(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
