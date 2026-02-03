package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bveq extends cldb {
    final /* synthetic */ bver a;

    public bveq(bver bverVar) {
        this.a = bverVar;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.a.e.c("BatteryLevelReceiver Receive broadcast", "com/google/android/apps/messaging/shared/datamodel/ditto/DittoBroadcastReceiverManager$BatteryLevelReceiver", "beginRootTrace", 289);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        int iJ;
        String action = intent.getAction();
        boolean zI = bver.i(intent);
        boolean zEquals = "android.intent.action.BATTERY_LOW".equals(action);
        bver bverVar = this.a;
        if (zEquals) {
            bverVar.a(!zI);
        } else if ("android.intent.action.BATTERY_OKAY".equals(action) || "android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            bverVar.a(false);
        } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action) && (iJ = bver.j(intent)) >= 0) {
            bverVar.a(iJ < 15);
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }
}
