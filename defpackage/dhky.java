package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhky {
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        int i = laa.a;
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean b(Context context) {
        return d(context, "com.google.android.ims");
    }

    public static boolean c(Context context) {
        return d(context, context.getPackageName());
    }

    private static boolean d(Context context, String str) {
        return dhkk.a(context).isIgnoringBatteryOptimizations(str);
    }
}
