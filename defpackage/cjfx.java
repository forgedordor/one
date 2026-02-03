package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjfx extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/messaging/handler/PostIncomingMessageToChatApiHandler");
    public final asrc b;
    public final cjbf c;
    private final fcsu d;
    private final fcsu e;
    private final fdjx f;

    public cjfx(asrc asrcVar, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, cjbf cjbfVar) {
        asrcVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.b = asrcVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fdjxVar;
        this.c = cjbfVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        fcsu fcsuVar = this.d;
        caxz caxzVarL = caya.l();
        caxzVarL.c((int) ((Number) fcsuVar.b()).longValue());
        Object objB = this.e.b();
        objB.getClass();
        caxzVarL.g(((Number) objB).longValue());
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("PostIncomingMessageToChatApiHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = aufh.b.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        aufh aufhVar = (aufh) evuhVar;
        aufhVar.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new cjfw(aufhVar, this, null));
    }
}
