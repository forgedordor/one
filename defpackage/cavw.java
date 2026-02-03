package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavw implements cazg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workhandlers/RcsToTelephonySyncHandler");
    private final /* synthetic */ cayt b;
    private final cgio c;

    public cavw(fdjx fdjxVar, cgio cgioVar, cavv cavvVar) {
        fdjxVar.getClass();
        evuo parserForType = cavz.a.getParserForType();
        parserForType.getClass();
        this.b = new cayt(fdjxVar, parserForType, new cavs(cavvVar, null));
        this.c = cgioVar;
    }

    @Override // defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(3);
        caxzVarL.b(caze.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        caxzVarL.f(pza.a);
        ((caxk) caxzVarL).b = this.c.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("RcsToTelephonySyncHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cavz.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cazg
    public final /* synthetic */ String e() {
        return null;
    }

    @Override // defpackage.cazg
    public final /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.cazg
    public final /* synthetic */ boolean h(evuh evuhVar) {
        return true;
    }

    @Override // defpackage.cazg
    public final /* synthetic */ boolean i(byte[] bArr) {
        return cazd.a(this, bArr);
    }

    @Override // defpackage.cazg
    public final eiju s(cayy cayyVar, ekgb ekgbVar) {
        return this.b.s(cayyVar, ekgbVar);
    }

    @Override // defpackage.cazg
    public final /* synthetic */ void g() {
    }
}
