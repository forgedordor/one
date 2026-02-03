package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cngw extends cayv {
    public static final eksp a = eksp.c("BugleTachygram");
    public final cnfv b;
    private final fcsu c;

    public cngw(cnfv cnfvVar, fcsu fcsuVar) {
        this.b = cnfvVar;
        this.c = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarA = cnht.a();
        ((caxk) caxzVarA).b = ((cgbn) this.c.b()).b();
        return caxzVarA.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("TachygramSendMessageWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return augw.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        return this.b.c(cayyVar, (augw) evuhVar);
    }
}
