package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkmy extends fcyz implements fdat {
    final /* synthetic */ hox a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkmy(hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkmy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.b(true);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dkmy(this.a, fcxyVar);
    }
}
