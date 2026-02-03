package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cykj extends fcyz implements fdat {
    final /* synthetic */ cykk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cykj(cykk cykkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cykkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cykj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        caxr caxrVar = new caxr();
        caxrVar.b = "sync_data_to_wearable_app_dedupe";
        cykk cykkVar = this.a;
        caxrVar.f = new cyki(cykkVar);
        ((data) cykkVar.i.b()).a(caxrVar.a());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cykj(this.a, fcxyVar);
    }
}
