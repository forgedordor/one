package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfj extends fcyz implements fdat {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ ycd c;
    final /* synthetic */ yen d;
    final /* synthetic */ ejy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfj(ycd ycdVar, yen yenVar, ejy ejyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ycdVar;
        this.d = yenVar;
        this.e = ejyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yfj) c(Integer.valueOf(((Number) obj).intValue()), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            int i2 = this.b;
            ycd ycdVar = this.c;
            this.a = 1;
            if (ycdVar.a(i2, this) == fcylVar) {
                return fcylVar;
            }
        }
        ygj.c(this.d, this.e);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        yfj yfjVar = new yfj(this.c, this.d, this.e, fcxyVar);
        yfjVar.b = ((Number) obj).intValue();
        return yfjVar;
    }
}
