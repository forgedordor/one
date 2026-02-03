package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccua extends fcyz implements fdat {
    final /* synthetic */ ccud a;
    final /* synthetic */ ccpl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccua(fcxy fcxyVar, ccud ccudVar, ccpl ccplVar) {
        super(2, fcxyVar);
        this.a = ccudVar;
        this.b = ccplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccua) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ccuh ccuhVar = (ccuh) ccui.a.createBuilder();
        ccuhVar.getClass();
        ccps ccpsVarA = this.b.a();
        ccuhVar.copyOnWrite();
        ccui ccuiVar = (ccui) ccuhVar.instance;
        ccuiVar.c = ccpsVarA;
        ccuiVar.b |= 1;
        evsn evsnVarBuild = ccuhVar.build();
        evsnVarBuild.getClass();
        return ((cazj) this.a.a.a.b()).a(cbcu.f("key_package_upload_work_handler", (ccui) evsnVarBuild));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ccua ccuaVar = new ccua(fcxyVar, this.a, this.b);
        ccuaVar.c = obj;
        return ccuaVar;
    }
}
