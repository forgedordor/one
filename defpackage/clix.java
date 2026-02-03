package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clix implements cliu {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener");
    private final fcsu b;

    public clix(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
    }

    @Override // defpackage.cliu
    public final void a(axcm axcmVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "offSatellite", 57, "SatelliteConnectionLoggerListener.kt")).t("Lost satellite connection for %s", axcmVar);
    }

    @Override // defpackage.cliu
    public final void b(axcm axcmVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "onDefaultDataSatelliteEvent", 45, "SatelliteConnectionLoggerListener.kt")).q("Default data is newly satellite");
    }

    @Override // defpackage.cliu
    public final void c(axcm axcmVar) {
        clid clidVar = (clid) this.b.b();
        eoag eoagVar = (eoag) eoal.a.createBuilder();
        eoagVar.getClass();
        eoak eoakVar = eoak.a;
        eoakVar.getClass();
        eoagVar.copyOnWrite();
        eoal eoalVar = (eoal) eoagVar.instance;
        eoalVar.c = eoakVar;
        eoalVar.b = 100;
        clidVar.a(eoaf.a(eoagVar));
    }

    @Override // defpackage.cliu
    public final void d(axcm axcmVar) {
        clid clidVar = (clid) this.b.b();
        eoag eoagVar = (eoag) eoal.a.createBuilder();
        eoagVar.getClass();
        eoai eoaiVar = eoai.a;
        eoaiVar.getClass();
        eoagVar.copyOnWrite();
        eoal eoalVar = (eoal) eoagVar.instance;
        eoalVar.c = eoaiVar;
        eoalVar.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        clidVar.a(eoaf.a(eoagVar));
    }

    @Override // defpackage.cliu
    public final void e(axcm axcmVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "onSmsSatelliteEvent", 49, "SatelliteConnectionLoggerListener.kt")).q("On sms satellite event");
    }

    @Override // defpackage.cliu
    public final void f(axcm axcmVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "onSatelliteManualConnectEligible", 61, "SatelliteConnectionLoggerListener.kt")).G("Satellite manual connection eligible: %b for %s", true, axcmVar);
    }

    @Override // defpackage.cliu
    public final void g() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionLoggerListener", "offDefaultDataSatelliteToTerrestrial", 53, "SatelliteConnectionLoggerListener.kt")).q("Default data is newly terrestrial");
    }
}
