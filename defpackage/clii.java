package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.TelephonyNetworkSpecifier;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clii {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer");
    public final ConnectivityManager a;
    public final awyu b;
    private final Context d;
    private final asal e;
    private final fctc f;
    private final fctc g;

    public clii(ConnectivityManager connectivityManager, awyu awyuVar, Context context, asal asalVar) {
        connectivityManager.getClass();
        awyuVar.getClass();
        context.getClass();
        this.a = connectivityManager;
        this.b = awyuVar;
        this.d = context;
        this.e = asalVar;
        this.f = fctd.a(new fdae() { // from class: clig
            @Override // defpackage.fdae
            public final Object invoke() {
                NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addTransportType(10).addCapability(12).removeCapability(13);
                if (craf.i) {
                    builderRemoveCapability.removeCapability(37);
                }
                NetworkRequest networkRequestBuild = builderRemoveCapability.build();
                networkRequestBuild.getClass();
                return networkRequestBuild;
            }
        });
        this.g = fctd.a(new fdae() { // from class: clih
            @Override // defpackage.fdae
            public final Object invoke() {
                return clii.d(this.a, null, "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_NEW_SATELLITE_CONNECTION", 3);
            }
        });
    }

    public static final NetworkRequest c(int i, Integer num) {
        NetworkRequest.Builder builderAddCapability = new NetworkRequest.Builder().addTransportType(i).addCapability(12);
        if (num != null) {
            builderAddCapability.setNetworkSpecifier(new TelephonyNetworkSpecifier.Builder().setSubscriptionId(num.intValue()).build());
        }
        NetworkRequest networkRequestBuild = builderAddCapability.build();
        networkRequestBuild.getClass();
        return networkRequestBuild;
    }

    public static /* synthetic */ PendingIntent d(clii cliiVar, axcm axcmVar, String str, int i) {
        if (1 == (i & 1)) {
            axcmVar = null;
        }
        return cliiVar.a(axcmVar, null, str);
    }

    private final PendingIntent e() {
        return (PendingIntent) this.g.a();
    }

    public final PendingIntent a(axcm axcmVar, Integer num, String str) {
        Context context = this.d;
        Intent intentA = aiiw.b(new ComponentName(context, (Class<?>) SatelliteConnectionChangeReceiver.class), str).a();
        intentA.getClass();
        if (axcmVar != null) {
            intentA.putExtra("MyIdentityToken", axcmVar.b());
            if (num != null) {
                intentA.setIdentifier(axcmVar.b + "|" + num);
            }
        }
        PendingIntent pendingIntentD = ebsn.d(context, 0, intentA, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        if (pendingIntentD != null) {
            return pendingIntentD;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void b() {
        ekrg ekrgVar = c;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleSatellite");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 59, "DunestarNetworkCallbackRegisterer.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executing...");
        if (this.e.a()) {
            try {
                ekrw ekrwVarH = ekrgVar.h();
                ekrwVarH.X(ekrzVar, "BugleSatellite");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 63, "DunestarNetworkCallbackRegisterer.kt")).q("Unregistering previous network callback for satellite connection.");
                this.a.unregisterNetworkCallback(e());
            } catch (Error unused) {
                ekrw ekrwVarE2 = c.e();
                ekrwVarE2.X(eksq.a, "BugleSatellite");
                ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 66, "DunestarNetworkCallbackRegisterer.kt")).q("Failed to unregister previous callback.");
            }
        }
        try {
            this.a.registerNetworkCallback((NetworkRequest) this.f.a(), e());
            ekrw ekrwVarE3 = c.e();
            ekrwVarE3.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 75, "DunestarNetworkCallbackRegisterer.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executed.");
        } catch (IllegalArgumentException e) {
            ekrw ekrwVarE4 = c.e();
            ekrwVarE4.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarE4).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 77, "DunestarNetworkCallbackRegisterer.kt")).q("IllegalArgumentException: Satellite features not supported");
        }
    }
}
