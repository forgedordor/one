package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdvr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpm b;
    final /* synthetic */ fdvt c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdvr(fdpm fdpmVar, fdvt fdvtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdpmVar;
        this.c = fdvtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdvr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            fdpm fdpmVar = this.b;
            fdou fdouVarE = this.c.e(fdjxVar);
            this.a = 1;
            Object objA = fdpw.a(fdpmVar, fdouVarE, true, this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdvr fdvrVar = new fdvr(this.b, this.c, fcxyVar);
        fdvrVar.d = obj;
        return fdvrVar;
    }
}
