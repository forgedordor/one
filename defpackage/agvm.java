package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agvm extends fcyz implements fdat {
    int a;
    final /* synthetic */ agvz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvm(fcxy fcxyVar, agvz agvzVar) {
        super(2, fcxyVar);
        this.b = agvzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agvm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        long j = fdhi.a;
        Object objE = crbf.az.e();
        objE.getClass();
        long jG = fdhk.g(((Number) objE).longValue(), fdhl.d);
        agvo agvoVar = new agvo(this.b, null);
        this.a = 1;
        Object objB = fdna.b(jG, agvoVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agvm agvmVar = new agvm(fcxyVar, this.b);
        agvmVar.c = obj;
        return agvmVar;
    }
}
