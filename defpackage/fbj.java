package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ffl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbj(ffl fflVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fflVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fbj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ffl fflVar = this.b;
            this.a = 1;
            Object objA = fdjy.a(new ffk(fflVar, null), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fbj(this.b, fcxyVar);
    }
}
