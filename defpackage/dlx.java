package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlx extends fcyz implements fdat {
    int a;
    final /* synthetic */ dly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlx(dly dlyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdcg fdcgVar = new fdcg();
            fdcg fdcgVar2 = new fdcg();
            fdcg fdcgVar3 = new fdcg();
            dly dlyVar = this.b;
            dlw dlwVar = new dlw(fdcgVar, fdcgVar2, fdcgVar3, dlyVar);
            this.a = 1;
            if (fdum.g((fdum) dlyVar.d.a, dlwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlx(this.b, fcxyVar);
    }
}
