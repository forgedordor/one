package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzvo extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzvp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzvo(bzvp bzvpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzvo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bzvp bzvpVar = this.b;
        this.a = 1;
        Object objA = bzvpVar.a(5, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzvo(this.b, fcxyVar);
    }
}
