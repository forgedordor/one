package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfk extends fcyz implements fdat {
    int a;
    final /* synthetic */ yen b;
    final /* synthetic */ ycd c;
    final /* synthetic */ ejy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfk(yen yenVar, ycd ycdVar, ejy ejyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yenVar;
        this.c = ycdVar;
        this.d = ejyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yfk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yen yenVar = this.b;
            yfj yfjVar = new yfj(this.c, yenVar, this.d, null);
            this.a = 1;
            if (fdpy.b(yenVar.c, yfjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yfk(this.b, this.c, this.d, fcxyVar);
    }
}
