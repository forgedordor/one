package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adma extends fcyz implements fdat {
    int a;
    final /* synthetic */ admb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adma(admb admbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = admbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adma) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            admb admbVar = this.b;
            fdpl fdplVarB = fdqq.b(admbVar.b, new fdap() { // from class: adlx
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return ((ajlk) obj2).f();
                }
            });
            adlz adlzVar = new adlz(admbVar);
            this.a = 1;
            if (fdplVarB.a(adlzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new adma(this.b, fcxyVar);
    }
}
