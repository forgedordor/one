package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhe extends fcyz implements fdat {
    int a;
    final /* synthetic */ hcj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhe(hcj hcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hhe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hcj hcjVar = this.b;
            this.a = 1;
            if (hcjVar.a(dod.a, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new hhe(this.b, fcxyVar);
    }
}
