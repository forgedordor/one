package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnge extends cayv {
    private final cnfv a;
    private final fcsu b;

    public cnge(cnfv cnfvVar, fcsu fcsuVar) {
        this.a = cnfvVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarA = cnht.a();
        ((caxk) caxzVarA).b = ((cgbn) this.b.b()).b();
        return caxzVarA.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("TachygramRemoveUserFromGroupWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return augi.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "tachygram_group_handler_queue";
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        return this.a.c(cayyVar, (augi) evuhVar);
    }
}
