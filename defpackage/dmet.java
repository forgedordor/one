package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmet extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmhi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmet(dmhi dmhiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmhiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmet) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdap fdapVarB = this.b.b();
            this.a = 1;
            if (fdapVarB.invoke(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmet(this.b, fcxyVar);
    }
}
