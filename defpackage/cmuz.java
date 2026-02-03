package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmuz extends fcyz implements fdat {
    final /* synthetic */ cmvd a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmuz(fcxy fcxyVar, cmvd cmvdVar, String str) {
        super(2, fcxyVar);
        this.a = cmvdVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmuz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.a.f(cebg.c(this.b, etsf.CONFIGURATION_TYPE_MESSAGES_XMS_CARRIER_CONFIG_FLAGS));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cmuz cmuzVar = new cmuz(fcxyVar, this.a, this.b);
        cmuzVar.c = obj;
        return cmuzVar;
    }
}
