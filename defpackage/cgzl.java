package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgzl extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgxw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgzl(cgxw cgxwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgxwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgzl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgxw cgxwVar = this.b;
            this.a = 1;
            if (cgxwVar.b(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cgzl(this.b, fcxyVar);
    }
}
