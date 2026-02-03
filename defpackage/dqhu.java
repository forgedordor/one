package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqhu extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ iac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqhu(fdpl fdplVar, iac iacVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = iacVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqhu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            dqht dqhtVar = new dqht(this.c);
            this.a = 1;
            if (fdplVar.a(dqhtVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqhu(this.b, this.c, fcxyVar);
    }
}
