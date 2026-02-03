package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqp extends fcyz implements fdat {
    int a;
    final /* synthetic */ etv b;
    final /* synthetic */ List c;
    final /* synthetic */ fdae d;
    final /* synthetic */ hox e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpqp(etv etvVar, List list, fdae fdaeVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = etvVar;
        this.c = list;
        this.d = fdaeVar;
        this.e = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpqp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final etv etvVar = this.b;
            final List list = this.c;
            final fdae fdaeVar = this.d;
            fdpl fdplVarA = hsb.a(new fdae() { // from class: dpqm
                @Override // defpackage.fdae
                public final Object invoke() {
                    dpqn dpqnVar = new dpqn(list);
                    fdae fdaeVar2 = fdaeVar;
                    fdaeVar2.getClass();
                    etv etvVar2 = etvVar;
                    Object objInvoke = dpqnVar.invoke(Integer.valueOf(etvVar2.j()));
                    return new dpqk(objInvoke, etvVar2.c(), etvVar2.c() > 0.0f ? dpqnVar.invoke(Integer.valueOf(etvVar2.j() + 1)) : etvVar2.c() < 0.0f ? dpqnVar.invoke(Integer.valueOf(etvVar2.j() - 1)) : objInvoke == null ? fdaeVar2.invoke() : null);
                }
            });
            dpqo dpqoVar = new dpqo(this.e);
            this.a = 1;
            if (fdplVarA.a(dpqoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpqp(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
