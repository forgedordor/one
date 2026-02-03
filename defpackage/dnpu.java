package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnpu extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnpz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnpu(dnpz dnpzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnpzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnpu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdce fdceVar = new fdce();
            dnpz dnpzVar = this.b;
            dneq dneqVarA = dnpzVar.a();
            dnce dnceVar = dnpz.e(dnpzVar).g;
            if (dnceVar == null) {
                dnceVar = dpil.aK;
            }
            fdvc fdvcVarC = dneqVarA.c(dnceVar);
            dnpt dnptVar = new dnpt(dnpzVar, fdceVar);
            this.a = 1;
            if (fdvcVarC.a(dnptVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnpu(this.b, fcxyVar);
    }
}
