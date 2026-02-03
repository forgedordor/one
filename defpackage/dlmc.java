package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlmc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlmg b;
    final /* synthetic */ hcj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlmc(dlmg dlmgVar, hcj hcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlmgVar;
        this.c = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlmc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hcj hcjVar = this.c;
            this.a = 1;
            if (hcjVar.a(dod.a, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlmc(this.b, this.c, fcxyVar);
    }
}
