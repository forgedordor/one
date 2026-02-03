package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enr extends fcyz implements fdat {
    int a;
    final /* synthetic */ ens b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enr(ens ensVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ensVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((enr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ens ensVar = this.b;
            this.a = 1;
            if (ensVar.f.f(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new enr(this.b, fcxyVar);
    }
}
