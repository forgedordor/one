package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oob extends fcyz implements fdat {
    final /* synthetic */ ovf a;
    final /* synthetic */ oog b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oob(ovf ovfVar, oog oogVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ovfVar;
        this.b = oogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oob) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ovf ovfVar = this.a;
        return owi.b(ovfVar.b, ovfVar.a, this.b.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new oob(this.a, this.b, fcxyVar);
    }
}
