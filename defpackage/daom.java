package defpackage;

import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daom {
    public static boolean a(PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo("com.samsung.app.newtrim", 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
