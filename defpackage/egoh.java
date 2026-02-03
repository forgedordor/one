package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egoh {
    private static final ekrg a = ekrg.c("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType");
    private final Context b;

    public egoh(Context context) {
        context.getClass();
        this.b = context;
    }

    public final int a() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.b.getApplicationInfo().targetSdkVersion;
        if (i2 >= 34) {
            z = true;
        } else {
            ((ekrd) a.h().h("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "isTargetSdkAtLeastU", 61, "DefaultForegroundServiceType.kt")).u("targetSdk (%d) >= VERSION_CODES.UPSIDE_DOWN_CAKE (%d) == false", i2, 34);
            z = false;
        }
        boolean z2 = i >= 34;
        if (!z2 || !z) {
            ((ekrd) a.h().h("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "get", 33, "DefaultForegroundServiceType.kt")).H("BuildCompat.isAtLeastU()=%b, isTargetSdkAtLeastU()=%b", z2, z);
        }
        return (z2 && z) ? 2048 : 0;
    }
}
