package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcx extends fcyz implements fdat {
    int a;
    final /* synthetic */ xdz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcx(xdz xdzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xdzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.c().b();
            this.a = 1;
            if (fdxs.c(eijuVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xcx(this.b, fcxyVar);
    }
}
