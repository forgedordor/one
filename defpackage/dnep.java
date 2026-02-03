package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnep extends fcyz implements fdat {
    int a;
    final /* synthetic */ dneq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnep(dneq dneqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dneqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnep) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dneq dneqVar = this.b;
        this.a = 1;
        Object objF = dneqVar.c.f(this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnep(this.b, fcxyVar);
    }
}
