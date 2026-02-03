package defpackage;

import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.Telephony;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhka {
    private static final dhip b = new dhip("ApkUtil");
    private static final Optional c = Optional.empty();
    private static final Optional d = Optional.empty();
    private static final Map e = new HashMap();
    public static final String[] a = {"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET", "android.permission.WAKE_LOCK"};

    public static int a(Context context) {
        if (dfog.N()) {
            return 0;
        }
        if (dfpk.t()) {
            dhja.k("getOperationMode(): Forced to run in Bugle", new Object[0]);
            return 0;
        }
        d.isPresent();
        if (!m(context) || dfog.y()) {
            return 0;
        }
        if (!e(context) || !dfog.G()) {
            return 2;
        }
        dhja.k("getOperationMode(): SystemBinding enabled, run in Bugle", new Object[0]);
        return 0;
    }

    public static ApplicationInfo b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.google.android.ims", 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static void c(Context context, Intent intent) {
        if (k(context)) {
            intent.setPackage("com.google.android.ims");
        } else {
            intent.setPackage("com.google.android.apps.messaging");
        }
    }

    public static boolean d(Context context) {
        if (!h(context)) {
            return false;
        }
        if (e(context) && (dfog.G() || dfog.N())) {
            return true;
        }
        return dhky.c(context.getApplicationContext());
    }

    public static boolean e(Context context) {
        return craf.d && h(context);
    }

    public static boolean f(Context context) {
        if (i(context)) {
            return craf.g(context);
        }
        return false;
    }

    public static boolean g(Context context, String str, int i) {
        Map map = e;
        String string = null;
        Boolean boolValueOf = map.containsKey(str) ? Boolean.valueOf(((Integer) map.get(str)).intValue() == i) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        ApplicationInfo applicationInfoB = b(context);
        if (applicationInfoB == null) {
            dhja.c("Cannot get service version because CS.apk was not found, not pre-loaded or disabled.", new Object[0]);
        } else {
            if (!dhky.b(context)) {
                dhja.k("Cannot use CS.apk as it's battery optimized", new Object[0]);
            } else if (e(context) && dfog.G()) {
                dhja.k("Do not use CS.apk as SystemBinding is enabled.", new Object[0]);
            } else if (j(applicationInfoB.flags) && applicationInfoB.enabled) {
                Bundle bundle = applicationInfoB.metaData;
                if (bundle == null) {
                    dhja.g("Cannot get service version because metadata not found.", new Object[0]);
                } else {
                    string = bundle.getString(str);
                }
            }
            dhja.c("Cannot get service version because CS.apk was not found, not pre-loaded or disabled.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            String[] strArrSplit = string.split(",");
            for (String str2 : strArrSplit) {
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                } catch (NumberFormatException e2) {
                    dhja.i(e2, "Could not parse %s", str2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            dhja.c("No supported version found", new Object[0]);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next()).intValue() == i) {
                return true;
            }
        }
        dhja.c("Service with meta data key: %s is not compatible. Service Version %d is not supported. Supported versions: %s", str, Integer.valueOf(i), Arrays.toString(arrayList.toArray()));
        return false;
    }

    public static boolean h(Context context) {
        if (!craf.c || !"com.google.android.apps.messaging".equals(context.getPackageName())) {
            return "com.google.android.apps.messaging".equals(Telephony.Sms.getDefaultSmsPackage(context));
        }
        RoleManager roleManagerM = abo$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(abo$$ExternalSyntheticApiModelOutline0.m42m()));
        return roleManagerM != null && roleManagerM.isRoleHeld("android.app.role.SMS");
    }

    public static boolean i(Context context) {
        c.isPresent();
        return "com.google.android.apps.messaging".equals(context.getPackageName());
    }

    public static boolean j(int i) {
        return (i & 129) != 0;
    }

    public static boolean k(Context context) {
        if (dfog.N()) {
            dhja.d(b, "Binding to JibeService in Bugle, since cs.apk is marked as deprecated.", new Object[0]);
            return false;
        }
        if (dfpk.t()) {
            dhja.d(b, "Not using CS JibeService because RcsEngineLifecycleManager controls RCS engine.", new Object[0]);
            return false;
        }
        if (!m(context)) {
            dhja.d(b, "Not using CS JibeService because it is not compatible with AM.", new Object[0]);
            return false;
        }
        if (i(context) && !((Boolean) dhhb.g.d()).booleanValue()) {
            dhja.d(b, "Not using CS JibeService because the CS migration has not completed.", new Object[0]);
            return false;
        }
        if (!e(context) || !dfog.G()) {
            return true;
        }
        dhja.d(b, "Not using CS JibeService because SystemBinding and SingleRegistration are enabled.", new Object[0]);
        return false;
    }

    public static boolean l(Context context) {
        try {
            return j(context.getPackageManager().getApplicationInfo("com.google.android.ims", 128).flags);
        } catch (PackageManager.NameNotFoundException unused) {
            dhja.q("%s not found returning false.", "com.google.android.ims");
            return false;
        }
    }

    private static boolean m(Context context) {
        return g(context, "JibeServiceApiVersions", 1) && g(context, "MessagingServiceVersions", 2);
    }
}
