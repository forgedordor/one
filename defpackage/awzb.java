package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awzb extends fcyz implements fdat {
    int a;
    final /* synthetic */ awze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzb(awze awzeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awzeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awzb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awze awzeVar = this.b;
        this.a = 1;
        Object objF = awzeVar.f(this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awzb(this.b, fcxyVar);
    }
}
