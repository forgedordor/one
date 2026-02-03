package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ens b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enp(ens ensVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ensVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((enp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ens ensVar = this.b;
            this.a = 1;
            if (ensVar.e.f(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new enp(this.b, fcxyVar);
    }
}
