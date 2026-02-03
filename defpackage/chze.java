package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chze extends chyb {
    public cqbm a;
    public eigp b;

    @Override // defpackage.cldb
    public final eieh b() {
        return this.b.c("ShutdownReceiver Receive broadcast", "com/google/android/apps/messaging/shared/rcs/availability/ShutdownReceiver", "beginRootTrace", 26);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        if ("android.intent.action.ACTION_SHUTDOWN".equals(intent.getAction())) {
            cqca.i("Bugle", "Device is shutting down. RCS availability will not be updated until after reboot.");
            ((chza) this.a.a()).m();
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }
}
