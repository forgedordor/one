package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhrf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dhrh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhrf(dhrh dhrhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dhrhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhrf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dhrh dhrhVar = this.b;
            this.a = 1;
            Object objA = fdjy.a(new dhqf(dhrhVar.g, dhrhVar.a, null), this);
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
        return new dhrf(this.b, fcxyVar);
    }
}
