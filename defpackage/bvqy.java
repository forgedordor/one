package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvqy extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvqy(bvsb bvsbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvqy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmfo cmfoVarN = this.b.n();
            this.a = 1;
            obj = cmfoVarN.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvqy(this.b, fcxyVar);
    }
}
