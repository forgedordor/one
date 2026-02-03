package defpackage;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceox {
    public final eosc a;

    public ceox(eosc eoscVar) {
        this.a = eoscVar;
    }

    public static int a(Context context) {
        UsageStatsManager usageStatsManager;
        if (Build.VERSION.SDK_INT < 28 || (usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats")) == null) {
            return 0;
        }
        return usageStatsManager.getAppStandbyBucket();
    }

    public static int b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return 0;
        }
        return powerManager.isIgnoringBatteryOptimizations(context.getPackageName()) ? 2 : 1;
    }
}
