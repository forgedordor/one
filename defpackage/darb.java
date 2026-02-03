package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class darb extends cayv {
    public static final eksp a = eksp.c("BugleWearable");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;
    private final fcsu f;
    private final fcsu g;

    public darb(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fdjxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.e = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.d = fcsuVar5;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("LoadPagedConversationTimeoutFallbackHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = daqn.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final /* bridge */ /* synthetic */ boolean h(evuh evuhVar) {
        daqn daqnVar = (daqn) evuhVar;
        daqnVar.getClass();
        if (!((ctan) this.f.b()).a().booleanValue()) {
            return false;
        }
        if (!((ctap) this.g.b()).b()) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(cqnc.S, "LoadPagedConversationTimeoutFallbackHandler");
            ekrwVarO.q("Skip sending paged conversation data to wear device.");
            return false;
        }
        String str = daqnVar.c;
        str.getClass();
        if (str.length() != 0) {
            return true;
        }
        ekrw ekrwVarO2 = a.o();
        ekrwVarO2.X(cqnc.S, "LoadPagedConversationTimeoutFallbackHandler");
        ekrwVarO2.q("Connected watch node Id is empty. Skip sending paged conversation data to wear device.");
        return false;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        daqn daqnVar = (daqn) evuhVar;
        daqnVar.getClass();
        ((ains) ((dapz) this.d.b()).a.b()).c("Bugle.Wear.Phone.LoadConversation.TimeoutFallback.Started");
        return auvw.c(this.e, fcyi.a, fdjz.a, new dara(this, daqnVar, null));
    }
}
