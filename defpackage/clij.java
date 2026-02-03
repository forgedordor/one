package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class clij extends clca {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cldg, defpackage.cldh
    public final void L(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((cliw) eyhi.a(context)).hk((SatelliteConnectionChangeReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // defpackage.cldg, defpackage.cldb, defpackage.cldh, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        L(context);
        super.onReceive(context, intent);
    }
}
