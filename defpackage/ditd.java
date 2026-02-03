package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ditd extends fcyz implements fdat {
    int a;
    final /* synthetic */ gvs b;
    final /* synthetic */ disb c;
    final /* synthetic */ hox d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ditd(gvs gvsVar, disb disbVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gvsVar;
        this.c = disbVar;
        this.d = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ditd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final gvs gvsVar = this.b;
            fdpl fdplVarA = hsb.a(new fdae() { // from class: ditb
                @Override // defpackage.fdae
                public final Object invoke() {
                    return gvsVar.a();
                }
            });
            ditc ditcVar = new ditc(this.c, this.d);
            this.a = 1;
            if (fdplVarA.a(ditcVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ditd(this.b, this.c, this.d, fcxyVar);
    }
}
