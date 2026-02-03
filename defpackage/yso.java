package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yso extends fcyz implements fdat {
    final /* synthetic */ yss a;
    final /* synthetic */ ajlt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yso(yss yssVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = yssVar;
        this.b = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yso) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        auvh.h(this.a.d.F(this.b.b()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yso(this.a, this.b, fcxyVar);
    }
}
