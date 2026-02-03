package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnsd extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/telephony/forwardsync/SpotSyncWorkHandler");
    public final cnxb b;
    public final aipo c;
    private final fdjx d;

    public cnsd(cogw cogwVar, cnxb cnxbVar, aipo aipoVar, fdjx fdjxVar) {
        cogwVar.getClass();
        cnxbVar.getClass();
        aipoVar.getClass();
        fdjxVar.getClass();
        this.b = cnxbVar;
        this.c = aipoVar;
        this.d = fdjxVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("SpotSyncWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cnsa.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cnsa cnsaVar = (cnsa) evuhVar;
        cnsaVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new cnsc(this, cnsaVar, null));
    }
}
