package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvri extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvri(bvsb bvsbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvri) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cmfo cmfoVarN = this.b.n();
        fdap fdapVar = new fdap() { // from class: bvrh
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                bvqr bvqrVar = (bvqr) obj2;
                bvqrVar.getClass();
                bvqp bvqpVar = (bvqp) bvqrVar.toBuilder();
                bvqpVar.getClass();
                bvqs.d(false, bvqpVar);
                return bvqs.b(bvqpVar);
            }
        };
        this.a = 1;
        Object objD = cmfoVarN.d(fdapVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvri(this.b, fcxyVar);
    }
}
