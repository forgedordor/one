package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajj {
    static long a(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    static String b(PackageManager packageManager) {
        return packageManager.getModuleInfo("com.android.appsearch", 1).getPackageName();
    }
}
