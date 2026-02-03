package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcnd extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdlr b;
    final /* synthetic */ Exception c;
    final /* synthetic */ fbnh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcnd(fdlr fdlrVar, Exception exc, fbnh fbnhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdlrVar;
        this.c = exc;
        this.d = fbnhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fcnd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdlr fdlrVar = this.b;
            Exception exc = this.c;
            this.a = 1;
            fdlw.e(fdlrVar, "Collection of responses completed exceptionally", exc);
            Object objO = fdlrVar.o(this);
            if (objO != fcylVar) {
                objO = fctx.a;
            }
            if (objO == fcylVar) {
                return fcylVar;
            }
        }
        this.d.c("Collection of responses completed exceptionally", this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fcnd(this.b, this.c, this.d, fcxyVar);
    }
}
