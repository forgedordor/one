package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clim {
    public static /* synthetic */ egsn a(int i, String str, Duration duration, int i2) {
        pzn pznVar = new pzn();
        pznVar.e(GroupManagementRequest.ACTION_TAG, i != 1 ? i != 2 ? "REGISTER_SATELLITE_PENDING_INTENT" : "LOST_SATELLITE_CONNECTION" : "NEW_SATELLITE_CONNECTION");
        if ((i2 & 2) != 0) {
            str = null;
        }
        int i3 = i2 & 4;
        if (str != null) {
            pznVar.e("MyIdentityToken", str);
        }
        if (i3 != 0) {
            duration = null;
        }
        egsj egsjVarN = egsn.n(clir.class);
        egrx egrxVar = (egrx) egsjVarN;
        egrxVar.e = pznVar.a();
        egsjVarN.f(fcwm.b("SatelliteWorkTag"));
        if (duration != null) {
            ekrw ekrwVarH = clir.a.h();
            ekrwVarH.X(eksq.a, "BugleSatellite");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker$Companion", "buildWorkSpec", 182, "NotifySatelliteConnectionChangeWorker.kt")).s("Will re-register for satellite event with delay: %ss", duration.getSeconds());
            egrxVar.c = new egsa(duration.getSeconds(), TimeUnit.SECONDS);
        } else {
            egrxVar.b = ejwi.j(qbf.a);
        }
        return egsjVarN.h();
    }
}
