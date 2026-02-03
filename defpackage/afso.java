package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afso extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ afrs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afso(ejy ejyVar, afrs afrsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = afrsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afso) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ejy ejyVar = this.b;
            fdpl fdplVarA = hsb.a(new fdae() { // from class: afsm
                @Override // defpackage.fdae
                public final Object invoke() {
                    return Boolean.valueOf(ejyVar.i());
                }
            });
            afsn afsnVar = new afsn(this.c);
            this.a = 1;
            if (fdplVarA.a(afsnVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afso(this.b, this.c, fcxyVar);
    }
}
