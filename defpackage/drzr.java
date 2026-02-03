package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drzr extends fcyz implements fdat {
    int a;
    final /* synthetic */ drzs b;
    final /* synthetic */ ethg c;
    final /* synthetic */ ethr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drzr(drzs drzsVar, ethg ethgVar, ethr ethrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = drzsVar;
        this.c = ethgVar;
        this.d = ethrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drzr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            drzs drzsVar = this.b;
            ethg ethgVar = this.c;
            ethr ethrVar = this.d;
            this.a = 1;
            if (drzsVar.a.a(ethgVar, ethrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new drzr(this.b, this.c, this.d, fcxyVar);
    }
}
