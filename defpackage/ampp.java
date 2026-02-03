package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ampp extends fcyz implements fdat {
    final /* synthetic */ ampu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ampp(ampu ampuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ampuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ampp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.d.a());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ampp(this.a, fcxyVar);
    }
}
