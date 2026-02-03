package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atgh implements cazg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorHandler");
    private final /* synthetic */ cayt b;
    private final cgbn c;
    private final fcsu d;

    public atgh(fdjx fdjxVar, atgg atggVar, cgbn cgbnVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        cgbnVar.getClass();
        fcsuVar.getClass();
        evuo parserForType = atgj.a.getParserForType();
        parserForType.getClass();
        this.b = new cayt(fdjxVar, parserForType, new atfy(atggVar, null));
        this.c = cgbnVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c((int) ((Number) this.d.b()).longValue());
        caxzVarL.b(caze.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        caxzVarL.f(pza.a);
        caxk caxkVar = (caxk) caxzVarL;
        caxkVar.b = this.c.b();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        caxkVar.a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("FileTransferProcessorHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return this.b.a;
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
