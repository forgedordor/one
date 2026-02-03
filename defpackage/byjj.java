package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byjj extends fcyz implements fdat {
    int a;
    final /* synthetic */ byjl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byjj(byjl byjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = byjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((byjj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        byjl byjlVar = this.b;
        this.a = 1;
        Object objF = byjlVar.f(this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new byjj(this.b, fcxyVar);
    }
}
