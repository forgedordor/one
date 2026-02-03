package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkz extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    private final fdjx g;
    private final fcsu h;
    private final fcsu i;

    public avkz(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar7.getClass();
        this.g = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.d = fcsuVar5;
        this.e = fcsuVar6;
        this.f = fcsuVar7;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        fcsu fcsuVar = this.h;
        caxz caxzVarL = caya.l();
        caxzVarL.c((int) ((Number) fcsuVar.b()).longValue());
        caxzVarL.f(pza.a);
        Object objB = this.i.b();
        objB.getClass();
        caxzVarL.g(((Number) objB).longValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("ContactRecipientDeletedSyncHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = avlb.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        avlb avlbVar = (avlb) evuhVar;
        avlbVar.getClass();
        return auvw.c(this.g, fcyi.a, fdjz.a, new avky(this, cayyVar, avlbVar, null));
    }
}
