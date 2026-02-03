package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avku extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientChangeSyncHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    private final fdjx i;
    private final fcsu j;
    private final fcsu k;

    public avku(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        this.i = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.d = fcsuVar5;
        this.e = fcsuVar6;
        this.f = fcsuVar7;
        this.g = fcsuVar8;
        this.h = fcsuVar9;
    }

    public static final boolean k(avkw avkwVar) {
        int i = avkwVar.d;
        return i > 0 && i == avkwVar.e;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        fcsu fcsuVar = this.j;
        caxz caxzVarL = caya.l();
        caxzVarL.c((int) ((Number) fcsuVar.b()).longValue());
        caxzVarL.f(pza.a);
        Object objB = this.k.b();
        objB.getClass();
        caxzVarL.g(((Number) objB).longValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("ContactRecipientChangeSyncHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = avkw.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        avkw avkwVar = (avkw) evuhVar;
        avkwVar.getClass();
        return auvw.c(this.i, fcyi.a, fdjz.a, new avkt(avkwVar, this, cayyVar, null));
    }
}
