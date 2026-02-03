package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvrk extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;
    final /* synthetic */ bvqh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvrk(bvsb bvsbVar, bvqh bvqhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
        this.c = bvqhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvrk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bvsb.a.n().q("Update attemptPairingClientInfo");
        bvsb bvsbVar = this.b;
        final bvqh bvqhVar = this.c;
        cmfo cmfoVarN = bvsbVar.n();
        fdap fdapVar = new fdap() { // from class: bvrj
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                bvqr bvqrVar = (bvqr) obj2;
                bvqrVar.getClass();
                bvqp bvqpVar = (bvqp) bvqrVar.toBuilder();
                bvqpVar.getClass();
                bvqpVar.copyOnWrite();
                bvqr bvqrVar2 = (bvqr) bvqpVar.instance;
                bvqrVar2.k = bvqhVar;
                bvqrVar2.b |= 4;
                return bvqs.b(bvqpVar);
            }
        };
        this.a = 1;
        Object objD = cmfoVarN.d(fdapVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvrk(this.b, this.c, fcxyVar);
    }
}
