package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvmm extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvmn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvmm(bvmn bvmnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvmnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvmm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarG = ((bvit) this.b.b.b()).g();
            eijuVarG.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarG, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.b.a.f(18, ezol.a, "");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvmm(this.b, fcxyVar);
    }
}
