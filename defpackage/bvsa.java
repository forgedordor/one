package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvsa extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;
    final /* synthetic */ bvqo c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvsa(bvsb bvsbVar, int i, bvqo bvqoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
        this.d = i;
        this.c = bvqoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvsa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bvsb bvsbVar = this.b;
        int i2 = this.d;
        bvqo bvqoVar = this.c;
        this.a = 1;
        Object objS = bvsbVar.s(i2, bvqoVar, this);
        return objS == fcylVar ? fcylVar : objS;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvsa(this.b, this.d, this.c, fcxyVar);
    }
}
