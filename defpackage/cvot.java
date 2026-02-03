package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvot extends fcyz implements fdat {
    final /* synthetic */ cvou a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvot(cvou cvouVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cvouVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvot) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cvpb cvpbVar = this.a.e;
        eieu eieuVarA = eiiy.a("AddContactBanner2DataServiceImpl#incrementAddContactBannerImpression");
        try {
            ((cvpi) ((cvph) cvpbVar).e.b()).c(((cvph) cvpbVar).b);
            fczl.a(eieuVarA, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvot(this.a, fcxyVar);
    }
}
