package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxp extends fcyz implements fdat {
    final /* synthetic */ cnxq a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnxp(fcxy fcxyVar, cnxq cnxqVar) {
        super(2, fcxyVar);
        this.a = cnxqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnxp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((cazj) ((cnxm) this.a.a.b()).a.b()).a(cbcu.f("forward_sync_engine", cnxo.a));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cnxp cnxpVar = new cnxp(fcxyVar, this.a);
        cnxpVar.b = obj;
        return cnxpVar;
    }
}
