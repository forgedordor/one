package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctwd extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctwh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctwd(ctwh ctwhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctwhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctwd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctwh ctwhVar = this.b;
            fdpl fdplVarA = fdqc.a(ctwhVar.d.a());
            ctwc ctwcVar = new ctwc(ctwhVar);
            this.a = 1;
            if (fdplVarA.a(ctwcVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctwd(this.b, fcxyVar);
    }
}
