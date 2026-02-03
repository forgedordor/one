package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class thq extends fcyz implements fdat {
    int a;
    final /* synthetic */ ejy b;
    final /* synthetic */ tin c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thq(ejy ejyVar, tin tinVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ejyVar;
        this.c = tinVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((thq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ejy ejyVar = this.b;
            thm thmVar = new thm(fdqq.a(new thp(hsb.a(new fdae() { // from class: thi
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ejyVar.d().i();
                }
            }))));
            thj thjVar = new thj(this.c);
            this.a = 1;
            if (thmVar.a(thjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new thq(this.b, this.c, fcxyVar);
    }
}
