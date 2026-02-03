package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdoi extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdow b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdoi(fdow fdowVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdowVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdoi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdow fdowVar = this.b;
                Object obj2 = this.c;
                this.a = 1;
                if (fdowVar.a(obj2, this) == fcylVar) {
                    return fcylVar;
                }
            }
            objA = fctx.a;
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        return new fdog(fctk.d(objA) ? fctx.a : new fdoe(fctk.c(objA)));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdoi fdoiVar = new fdoi(this.b, this.c, fcxyVar);
        fdoiVar.d = obj;
        return fdoiVar;
    }
}
