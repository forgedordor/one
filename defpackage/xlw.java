package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlw extends fcyz implements fdat {
    final /* synthetic */ xmd a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlw(xmd xmdVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xmdVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xlw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.d.j(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xlw(this.a, this.b, fcxyVar);
    }
}
