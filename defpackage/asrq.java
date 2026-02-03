package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asrq extends fcyz implements fdat {
    int a;
    final /* synthetic */ asrr b;
    final /* synthetic */ asrg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asrq(asrr asrrVar, asrg asrgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = asrrVar;
        this.c = asrgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asrq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        asrr asrrVar = this.b;
        asrg asrgVar = this.c;
        this.a = 1;
        Object objA = asrrVar.a.a(asrgVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new asrq(this.b, this.c, fcxyVar);
    }
}
