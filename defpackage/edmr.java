package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edmr {
    public static iv a(Context context) {
        eeji eejiVar = new eeji(context, R.style.ThemeOverlay_PhotoPicker_MaterialAlertDialog);
        eejiVar.k(R.string.op3_allow_access_in_settings);
        eejiVar.r(R.string.op3_dismiss, null);
        return eejiVar.create();
    }

    public static boolean b(Context context, String str) {
        try {
            return Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions).contains(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
