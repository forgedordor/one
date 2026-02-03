package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgyv extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgzi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgyv(cgzi cgziVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgziVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgyv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgzi cgziVar = this.b;
            this.a = 1;
            if (cgzi.s(cgziVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgyv(this.b, fcxyVar);
    }
}
