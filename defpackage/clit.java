package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clit implements cldt, cldy {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener");
    private final clii b;

    public clit(clii cliiVar) {
        this.b = cliiVar;
    }

    private final void a() {
        ekrg ekrgVar = a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 62, "SatelliteBootAndPackageReplacedListener.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executing...");
        if (!craf.h) {
            ekrw ekrwVarE2 = ekrgVar.e();
            ekrwVarE2.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 67, "SatelliteBootAndPackageReplacedListener.kt")).t("Satellite Flag disabled. Os.isAtLeastU: %s", false);
        } else {
            this.b.b();
            ekrw ekrwVarE3 = ekrgVar.e();
            ekrwVarE3.X(ekrzVar, "BugleSatellite");
            ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "registerForSatelliteConnection", 65, "SatelliteBootAndPackageReplacedListener.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executed.");
        }
    }

    @Override // defpackage.cldt
    public final void b() {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "onBootComplete", 49, "SatelliteBootAndPackageReplacedListener.kt")).q("onBootComplete executing...");
        a();
    }

    @Override // defpackage.cldy
    public final void c() {
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteBootAndPackageReplacedListener", "onPackageReplaced", 57, "SatelliteBootAndPackageReplacedListener.kt")).q("onPackageReplaced executing...");
        a();
    }
}
