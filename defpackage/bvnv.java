package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvnv extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvmw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvnv(bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvnv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        eiju eijuVarL = ((ceff) this.b.g.b()).l();
        eijuVarL.getClass();
        this.a = 1;
        if (fdxs.c(eijuVarL, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvnv(this.b, fcxyVar);
    }
}
