package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhm {
    public static final ApplicationInfo a(Context context) {
        context.getClass();
        try {
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
