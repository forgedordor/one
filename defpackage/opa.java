package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class opa extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdlr b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opa(fdlr fdlrVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdlrVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((opa) c((owr) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final owr owrVar = (owr) this.d;
            this.b.hK(new fdap() { // from class: ooz
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    owrVar.e(null);
                    return fctx.a;
                }
            });
            fdat fdatVar = this.c;
            this.a = 1;
            if (fdatVar.a(owrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        opa opaVar = new opa(this.b, this.c, fcxyVar);
        opaVar.d = obj;
        return opaVar;
    }
}
