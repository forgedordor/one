package defpackage;

import android.content.Context;
import android.telephony.ServiceState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqho {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorUtils");
    public final Context a;
    private final fcsu c;

    public cqho(Context context, fcsu fcsuVar) {
        this.a = context;
        this.c = fcsuVar;
    }

    final cqgl a(ServiceState serviceState, int i) {
        boolean zC;
        int state = serviceState.getState();
        if (craf.i) {
            zC = serviceState.isUsingNonTerrestrialNetwork();
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleSatellite");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorUtils", "isServiceStateOnSatellite", 92, "NetworkStateMonitorUtils.java")).t("OS isAtLeastV and isSatellite = %s", Boolean.valueOf(zC));
        } else {
            zC = ((clhx) this.c.b()).c(i);
        }
        if (zC) {
            return cqgl.SATELLITE;
        }
        if (state == 0) {
            return cqgl.AVAILABLE;
        }
        if (state != 1) {
            if (state == 2) {
                return cqgl.EMERGENCY_ONLY;
            }
            if (state != 3) {
                return cqgl.UNKNOWN;
            }
        }
        return cqgl.UNAVAILABLE;
    }
}
