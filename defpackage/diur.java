package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diur extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diur(dpn dpnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((diur) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dpn dpnVar = this.b;
            int iB = dpnVar.b();
            this.a = 1;
            if (dpnVar.d(iB, new dgi(null, 7), this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new diur(this.b, fcxyVar);
    }
}
