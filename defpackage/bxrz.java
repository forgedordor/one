package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxrz extends fcyz implements fdat {
    final /* synthetic */ bxsg a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ Exception d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxrz(bxsg bxsgVar, String str, int i, Exception exc, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bxsgVar;
        this.b = str;
        this.c = i;
        this.d = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxrz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((byap) this.a.c.b()).c(this.b, this.c, 3, this.d);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxrz(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
