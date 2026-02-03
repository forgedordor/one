package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxss extends fcyz implements fdat {
    int a;
    final /* synthetic */ bxtd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxss(bxtd bxtdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bxtdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxss) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bxtd bxtdVar = this.b;
        this.a = 1;
        Object objH = bxtdVar.h(this);
        return objH == fcylVar ? fcylVar : objH;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxss(this.b, fcxyVar);
    }
}
