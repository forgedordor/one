package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehwm implements ehwl {
    private final BatteryManager a;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public ehwm(Context context) {
        this.a = (BatteryManager) context.getSystemService("batterymanager");
    }

    @Override // defpackage.ehwl
    public final boolean a() {
        return this.a.isCharging();
    }
}
