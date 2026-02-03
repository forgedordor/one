package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcs extends fcyz implements fdat {
    int a;
    final /* synthetic */ xdz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcs(xdz xdzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xdzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final xdz xdzVar = this.b;
            fdpl fdplVarB = fdqq.b(new xcr(xdzVar.d.a), new fdap() { // from class: xcn
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    vvw vvwVar = (vvw) obj2;
                    return xdzVar.i.a() ? new fcti(vvwVar.a, vvwVar.j) : vvwVar.a;
                }
            });
            xco xcoVar = new xco(xdzVar);
            this.a = 1;
            if (fdplVarB.a(xcoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xcs(this.b, fcxyVar);
    }
}
