package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drt extends fcyz implements fdau {
    int a;
    final /* synthetic */ drv b;
    final /* synthetic */ fdcf c;
    final /* synthetic */ float d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drt(drv drvVar, fdcf fdcfVar, float f, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = drvVar;
        this.c = fdcfVar;
        this.d = f;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        drt drtVar = new drt(this.b, this.c, this.d, (fcxy) obj3);
        drtVar.e = (dsc) obj;
        return drtVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdcf fdcfVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdcfVar = (fdcf) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dsc dscVar = (dsc) this.e;
            drv drvVar = this.b;
            drs drsVar = new drs(drvVar, dscVar);
            dvj dvjVar = drvVar.d;
            if (dvjVar == null) {
                fdbq.c("resolvedFlingBehavior");
                dvjVar = null;
            }
            fdcf fdcfVar2 = this.c;
            float f = this.d;
            this.e = fdcfVar2;
            this.a = 1;
            obj = dvjVar.a(drsVar, f, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            fdcfVar = fdcfVar2;
        }
        fdcfVar.a = ((Number) obj).floatValue();
        return fctx.a;
    }
}
