package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkm extends fcyz implements fdat {
    int a;
    final /* synthetic */ llo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkm(llo lloVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = lloVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lkm) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            llo lloVar = this.b;
            this.a = 1;
            if (lloVar.g(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new lkm(this.b, fcxyVar);
    }
}
