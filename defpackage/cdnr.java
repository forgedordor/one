package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdnr extends fcyz implements fdat {
    final /* synthetic */ cdoa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdnr(cdoa cdoaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cdoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdnr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cdoa cdoaVar = this.a;
        ((bxlc) cdoaVar.i.b()).c();
        cdoaVar.k.a(eijx.e(null), cdng.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdnr(this.a, fcxyVar);
    }
}
