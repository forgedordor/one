package defpackage;

import android.content.Context;
import android.telephony.satellite.wrapper.CarrierRoamingNtnModeListenerWrapper;
import android.telephony.satellite.wrapper.SatelliteManagerWrapper;
import android.telephony.satellite.wrapper.SatelliteModemStateCallbackWrapper;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clic implements clhx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl");
    public final eigp b;
    public final clhc c;
    public final asae d;
    private final Context e;
    private final eosc f;
    private final fdjx g;

    public clic(Context context, eosc eoscVar, fdjx fdjxVar, eigp eigpVar, clhc clhcVar, asae asaeVar) {
        context.getClass();
        eoscVar.getClass();
        fdjxVar.getClass();
        eigpVar.getClass();
        clhcVar.getClass();
        this.e = context;
        this.f = eoscVar;
        this.g = fdjxVar;
        this.b = eigpVar;
        this.c = clhcVar;
        this.d = asaeVar;
    }

    private final void f(final int i, final clhv clhvVar) {
        try {
            SatelliteManagerWrapper.getInstance(this.e).registerForCarrierRoamingNtnModeChanged(i, this.f, new CarrierRoamingNtnModeListenerWrapper() { // from class: clhz
                public final void onCarrierRoamingNtnModeChanged(boolean z) throws IOException {
                    eigp eigpVar = this.a.b;
                    clhv clhvVar2 = clhvVar;
                    int i2 = i;
                    eieh eiehVarA = eigpVar.a("CarrierRoamingNtnModeListenerWrapper onCarrierRoamingNtnModeChangedEvent");
                    try {
                        clhvVar2.b(z, i2);
                        fczl.a(eiehVarA, null);
                    } finally {
                    }
                }
            });
        } catch (Exception e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChangedV1", 138, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged with v1 interface");
        } catch (LinkageError e2) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarE).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChangedV1", 133, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged with v1 interface");
        }
    }

    @Override // defpackage.clhx
    public final void a(int i, clhv clhvVar) {
        if (!craf.h) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 63, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return;
        }
        try {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 68, "BugleSatelliteManagerWrapperImpl.kt")).q("Attempting to register registerForCarrierRoamingNtnModeChanged listener");
            SatelliteManagerWrapper.getInstance(this.e).registerForCarrierRoamingNtnModeChanged(i, this.f, new clia(this, clhvVar, i));
        } catch (ClassCastException e) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarE2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 80, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged. Retrying with v1 interface");
            f(i, clhvVar);
        } catch (Exception e2) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 83, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call isUsingNonTerrestrialNetwork.");
            f(i, clhvVar);
        } catch (LinkageError e3) {
            ekrw ekrwVarE3 = a.e();
            ekrwVarE3.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarE3).g(e3).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 74, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged. Retrying with v1 interface");
            f(i, clhvVar);
        }
    }

    @Override // defpackage.clhx
    public final void b(clhw clhwVar) {
        if (craf.h) {
            auvw.k(this.g, null, null, new clib(this, clhwVar, null), 3);
            return;
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "requestSatelliteConnection", 177, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
    }

    @Override // defpackage.clhx
    public final boolean c(int i) {
        if (!craf.h) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "isUsingNonTerrestrialNetwork", 44, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return false;
        }
        try {
            return SatelliteManagerWrapper.getInstance(this.e).isUsingNonTerrestrialNetwork(i);
        } catch (Exception e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "isUsingNonTerrestrialNetwork", 53, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call isUsingNonTerrestrialNetwork.");
            return false;
        } catch (LinkageError e2) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarE2).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "isUsingNonTerrestrialNetwork", 50, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call isUsingNonTerrestrialNetwork");
            return false;
        }
    }

    @Override // defpackage.clhx
    public final void d(final cqfw cqfwVar) {
        try {
            SatelliteManagerWrapper.getInstance(this.e).registerForModemStateChanged(this.f, new SatelliteModemStateCallbackWrapper() { // from class: clhy
                public final void onSatelliteModemStateChanged(final int i) throws IOException {
                    eigp eigpVar = this.a.b;
                    cqfw cqfwVar2 = cqfwVar;
                    eieh eiehVarA = eigpVar.a("SatelliteModemStateCallbackWrapper#onSatelliteModemStateChanged");
                    try {
                        final cqgf cqgfVar = cqfwVar2.a;
                        cqgh cqghVar = cqfwVar2.b;
                        if (((asar) cqghVar.n.b()).a()) {
                            cqghVar.D(new Runnable() { // from class: cqfx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cqgfVar.a(i);
                                }
                            });
                        } else {
                            cqgfVar.a(i);
                        }
                        fczl.a(eiehVarA, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            fczl.a(eiehVarA, th);
                            throw th2;
                        }
                    }
                }
            });
        } catch (Exception e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForModemStateChanged", 106, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForModemStateChanged");
        } catch (LinkageError e2) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarE).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForModemStateChanged", 104, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForModemStateChanged");
        }
    }

    @Override // defpackage.clhx
    public final void e() {
        if (!craf.h) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "setNtnSmsSupported", 194, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return;
        }
        try {
            SatelliteManagerWrapper.getInstance(this.e).setNtnSmsSupported(true);
        } catch (Exception e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "setNtnSmsSupported", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call setNtnSmsSupported");
        } catch (LinkageError e2) {
            ekrw ekrwVarE2 = a.e();
            ekrwVarE2.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarE2).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "setNtnSmsSupported", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call setNtnSmsSupported");
        }
    }
}
