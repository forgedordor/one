package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwk extends fcyz implements fdat {
    final /* synthetic */ azwl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azwk(azwl azwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = azwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azwk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((axsq) this.a.b.b()).a().x(301, 0L);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new azwk(this.a, fcxyVar);
    }
}
