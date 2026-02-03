package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuop extends fcyz implements fdat {
    int a;
    final /* synthetic */ cuos b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuop(cuos cuosVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cuosVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuop) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cuos cuosVar = this.b;
        this.a = 1;
        Object objA = cuosVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cuop(this.b, fcxyVar);
    }
}
