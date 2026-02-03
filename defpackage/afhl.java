package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhl {
    public static final cqce a = cqce.g("Bugle", "GoogleLocationSettingHelper");
    public static final Uri b = Uri.parse("content://com.google.settings/partner");
    private static Boolean c = null;

    public static synchronized boolean a(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null);
        }
        return c.booleanValue();
    }
}
