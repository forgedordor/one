package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkk extends fcyz implements fdat {
    int a;
    final /* synthetic */ hsf b;
    final /* synthetic */ ddp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkk(hsf hsfVar, ddp ddpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hsfVar;
        this.c = ddpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fkk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            final hsf hsfVar = this.b;
            fdpl fdplVarA = hsb.a(new fdae() { // from class: fkh
                @Override // defpackage.fdae
                public final Object invoke() {
                    return new ihs(fkl.a(hsfVar));
                }
            });
            fkj fkjVar = new fkj(this.c, fdjxVar);
            this.a = 1;
            if (fdplVarA.a(fkjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fkk fkkVar = new fkk(this.b, this.c, fcxyVar);
        fkkVar.d = obj;
        return fkkVar;
    }
}
