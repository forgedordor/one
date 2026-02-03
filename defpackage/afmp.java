package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afmp extends fcyz implements fdat {
    int a;
    final /* synthetic */ afmq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmp(afmq afmqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afmqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afmp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            afmq afmqVar = this.b;
            fdpl fdplVarB = afmqVar.b.b();
            afmo afmoVar = new afmo(afmqVar);
            this.a = 1;
            if (fdplVarB.a(afmoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afmp(this.b, fcxyVar);
    }
}
