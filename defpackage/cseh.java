package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cseh extends fcyz implements fdat {
    final /* synthetic */ csei a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cseh(csei cseiVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cseiVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cseh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cseh(this.a, this.b, fcxyVar);
    }
}
