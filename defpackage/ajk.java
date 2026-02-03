package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajk {
    private static volatile long a = -1;

    private ajk() {
    }

    public static long a(Context context) {
        if (a == -1) {
            synchronized (ajk.class) {
                if (a == -1) {
                    long jA = 0;
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        String strB = ajj.b(packageManager);
                        if (strB != null) {
                            jA = ajj.a(packageManager.getPackageInfo(strB, 1073741824));
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    a = jA;
                }
            }
        }
        return a;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT < 36) {
            return Build.VERSION.SDK_INT >= 35 && Build.VERSION.CODENAME.equals("Baklava");
        }
        return true;
    }
}
