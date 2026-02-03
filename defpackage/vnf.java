package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vnf extends fcyz implements fdat {
    final /* synthetic */ vnh a;
    final /* synthetic */ ajlt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnf(vnh vnhVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vnhVar;
        this.b = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vnf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b.Q(this.b.b(), 2);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vnf(this.a, this.b, fcxyVar);
    }
}
