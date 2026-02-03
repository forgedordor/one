package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clpo implements cldt, ccyz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter");
    public final clhx b;
    private final fdjx c;

    public clpo(fdjx fdjxVar, clhx clhxVar) {
        fdjxVar.getClass();
        clhxVar.getClass();
        this.c = fdjxVar;
        this.b = clhxVar;
    }

    @Override // defpackage.ccyz
    public final void a() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter", "onBuglePhenotypeFlagChanged", 72, "TelephonySatelliteReporterImpl.kt")).q("Processing Phenotype flag changes.");
        c();
    }

    @Override // defpackage.cldt
    public final void b() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/telephony/TelephonySatelliteReporter", "onBootComplete", 58, "TelephonySatelliteReporterImpl.kt")).q("Processing boot complete event.");
        c();
    }

    public final void c() {
        auvw.m(this.c, null, new clpn(this, null), 3);
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return true;
    }
}
