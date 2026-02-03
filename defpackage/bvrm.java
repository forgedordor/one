package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvrm extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;
    final /* synthetic */ bvqq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvrm(bvsb bvsbVar, bvqq bvqqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
        this.c = bvqqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvrm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        final bvqq bvqqVar = this.c;
        if (bvsb.r(bvqqVar)) {
            cecq cecqVar = (cecq) bvsb.b.get(bvqqVar);
            if (cecqVar != null) {
                ((cecr) bvsbVar.g.b()).b(cecqVar);
            }
            bvsbVar.q();
        }
        cmfo cmfoVarN = bvsbVar.n();
        fdap fdapVar = new fdap() { // from class: bvrl
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                bvqr bvqrVar = (bvqr) obj2;
                bvqrVar.getClass();
                bvqp bvqpVar = (bvqp) bvqrVar.toBuilder();
                bvqpVar.getClass();
                bvqs.f(bvqqVar, bvqpVar);
                return bvqs.b(bvqpVar);
            }
        };
        this.a = 1;
        Object objD = cmfoVarN.d(fdapVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvrm(this.b, this.c, fcxyVar);
    }
}
