package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yxp extends fcyz implements fdat {
    final /* synthetic */ yya a;
    final /* synthetic */ yxg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxp(yya yyaVar, yxg yxgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = yyaVar;
        this.b = yxgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yxp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e.invoke(this.b.a.b());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yxp(this.a, this.b, fcxyVar);
    }
}
