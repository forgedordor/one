package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czrd extends fcyz implements fdat {
    final /* synthetic */ czrg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czrd(czrg czrgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = czrgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czrd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cjxj cjxjVarA = this.a.k.a();
        cjxjVarA.getClass();
        return cjxjVarA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new czrd(this.a, fcxyVar);
    }
}
