package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auvn extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdap b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auvn(fcxy fcxyVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auvn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdap fdapVar = this.b;
        this.a = 1;
        Object objInvoke = fdapVar.invoke(this);
        return objInvoke == fcylVar ? fcylVar : objInvoke;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auvn auvnVar = new auvn(fcxyVar, this.b);
        auvnVar.c = obj;
        return auvnVar;
    }
}
