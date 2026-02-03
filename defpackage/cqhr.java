package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqhr extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterHandler");
    public final cqhp b;
    public final cqbm c;
    public final fcsu d;
    private final fdjx e;

    public cqhr(fdjx fdjxVar, cqhp cqhpVar, cqbm cqbmVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        cqbmVar.getClass();
        fcsuVar.getClass();
        this.e = fdjxVar;
        this.b = cqhpVar;
        this.c = cqbmVar;
        this.d = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(5);
        caxzVarL.b(caze.WAKELOCK);
        caxzVarL.f(pza.b);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("SatelliteNetworkStateUpdaterHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cqhu.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cqhu cqhuVar = (cqhu) evuhVar;
        cqhuVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new cqhq(cqhuVar, this, cayyVar, null));
    }
}
