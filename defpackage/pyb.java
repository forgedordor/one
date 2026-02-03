package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyb {
    public static final IBinder a(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static final prs b() throws NumberFormatException {
        String strGroup;
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion)) {
                prs prsVar = prs.a;
                if (apiVersion == null || fdgn.H(apiVersion)) {
                    return null;
                }
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i2 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            int i3 = Integer.parseInt(strGroup3);
                            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                            strGroup4.getClass();
                            return new prs(i, i2, i3, strGroup4);
                        }
                    }
                }
            }
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
        }
        return null;
    }
}
