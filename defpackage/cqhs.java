package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqhs implements cliu {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterListener");
    private final cqhv b;

    public cqhs(cqhv cqhvVar) {
        this.b = cqhvVar;
    }

    private final void h(cqhu cqhuVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/connectivity/SatelliteNetworkStateUpdaterListener", "queueWorkInPWQ", 56, "SatelliteNetworkStateUpdaterListener.kt")).t("PWQ schedule work with params: %s .. ", cqhuVar);
        ((cazj) this.b.a.b()).a(cbcu.f("satellite_network_state_updater", cqhuVar));
    }

    @Override // defpackage.cliu
    public final void c(axcm axcmVar) {
        cqht cqhtVar = (cqht) cqhu.a.createBuilder();
        String strB = axcmVar.b();
        cqhtVar.copyOnWrite();
        cqhu cqhuVar = (cqhu) cqhtVar.instance;
        strB.getClass();
        cqhuVar.b = strB;
        evsn evsnVarBuild = cqhtVar.build();
        evsnVarBuild.getClass();
        h((cqhu) evsnVarBuild);
    }

    @Override // defpackage.cliu
    public final void d(axcm axcmVar) {
        cqht cqhtVar = (cqht) cqhu.a.createBuilder();
        String strB = axcmVar.b();
        cqhtVar.copyOnWrite();
        cqhu cqhuVar = (cqhu) cqhtVar.instance;
        strB.getClass();
        cqhuVar.b = strB;
        evsn evsnVarBuild = cqhtVar.build();
        evsnVarBuild.getClass();
        h((cqhu) evsnVarBuild);
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void a(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void b(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void e(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final /* synthetic */ void f(axcm axcmVar) {
    }
}
