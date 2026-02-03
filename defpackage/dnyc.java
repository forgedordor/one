package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnyc extends fcyz implements fdat {
    final /* synthetic */ dnyn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnyc(dnyn dnynVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dnynVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnyc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dnuy dnuyVar = this.a.ai;
        if (dnuyVar == null) {
            fdbq.c("emotifyController");
            dnuyVar = null;
        }
        dnuyVar.c();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnyc(this.a, fcxyVar);
    }
}
