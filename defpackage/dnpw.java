package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnpw extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnpz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnpw(dnpz dnpzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnpzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnpw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnpz dnpzVar = this.b;
            dnph dnphVar = dnpzVar.aq;
            if (dnphVar == null) {
                fdbq.c("views");
                dnphVar = null;
            }
            fdpl fdplVarD = dphw.d(dnphVar.a);
            dnpv dnpvVar = new dnpv(dnpzVar);
            this.a = 1;
            if (fdplVarD.a(dnpvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnpw(this.b, fcxyVar);
    }
}
