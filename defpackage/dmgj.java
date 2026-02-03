package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgj extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmhi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmgj(dmhi dmhiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmhiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmgj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdap fdapVarC = this.b.c();
            this.a = 1;
            if (fdapVarC.invoke(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmgj(this.b, fcxyVar);
    }
}
