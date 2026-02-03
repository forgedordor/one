package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drq extends fcyz implements fdau {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ drv c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drq(fdat fdatVar, drv drvVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = fdatVar;
        this.c = drvVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        drq drqVar = new drq(this.b, this.c, (fcxy) obj3);
        drqVar.d = (dsc) obj;
        return drqVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.d;
            fdat fdatVar = this.b;
            final drv drvVar = this.c;
            final dsc dscVar = (dsc) obj2;
            fdap fdapVar = new fdap() { // from class: drp
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    long j = ((dtf) obj3).a;
                    drv drvVar2 = drvVar;
                    long jF = ihs.f(j, true != drvVar2.k() ? 1.0f : -1.0f);
                    drb.a(dscVar, drvVar2.a.b(Float.intBitsToFloat((int) (drvVar2.b == dwm.a ? jF & 4294967295L : jF >> 32))));
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdatVar.a(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
