package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cljl implements cliu {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PPSatelliteConnectionChangeListener");
    private final fcsu b;
    private final aqtt c;
    private final asat d;

    public cljl(fcsu fcsuVar, aqtt aqttVar, asat asatVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
        this.c = aqttVar;
        this.d = asatVar;
    }

    @Override // defpackage.cliu
    public final void a(axcm axcmVar) {
        if (this.c.a() && this.d.a()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PPSatelliteConnectionChangeListener", "offSatellite", 88, "PPSatelliteConnectionChangeListener.kt")).q("Disconnected from Satellite, cancel period pull messages work");
            ((cljm) this.b.b()).a();
        }
    }

    @Override // defpackage.cliu
    public final void b(axcm axcmVar) {
        if (this.c.a() && this.d.a()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PPSatelliteConnectionChangeListener", "onDefaultDataSatelliteEvent", 74, "PPSatelliteConnectionChangeListener.kt")).t("Default data is now on satellite, schedule period pull messages work for %s", axcmVar);
            ((cljm) this.b.b()).b();
        }
    }

    @Override // defpackage.cliu
    public final void c(axcm axcmVar) {
        if (!this.c.a() || this.d.a()) {
            return;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PPSatelliteConnectionChangeListener", "onNewInServiceSatelliteInternetConnection", 50, "PPSatelliteConnectionChangeListener.kt")).t("Connected to Satellite connection, schedule period pull messages work for %s", axcmVar);
        ((cljm) this.b.b()).b();
    }

    @Override // defpackage.cliu
    public final void d(axcm axcmVar) {
        if (!this.c.a() || this.d.a()) {
            return;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PPSatelliteConnectionChangeListener", "onNewInServiceTerrestrialInternetConnection", 62, "PPSatelliteConnectionChangeListener.kt")).t("Connected to Terrestrial connection, cancel period pull messages work for %s", axcmVar);
        ((cljm) this.b.b()).a();
    }

    @Override // defpackage.cliu
    public final void g() {
    }

    @Override // defpackage.cliu
    public final void e(axcm axcmVar) {
    }

    @Override // defpackage.cliu
    public final void f(axcm axcmVar) {
    }
}
