package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blx implements akv {
    private static Set b(String[] strArr) throws ClassNotFoundException {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<?> cls = null;
            try {
                Class<?> cls2 = Class.forName(str);
                if (bls.class.isAssignableFrom(cls2)) {
                    cls = cls2;
                } else {
                    bbs.f("QuirkSettingsLoader", a.x(str, " does not implement the Quirk interface."));
                }
            } catch (ClassNotFoundException e) {
                bbs.g("QuirkSettingsLoader", "Class not found: ".concat(String.valueOf(str)), e);
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }

    private static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            bbs.f("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            bbs.g("QuirkSettingsLoader", a.g(i, "Quirk class names resource not found: "), e);
            return new String[0];
        }
    }

    @Override // defpackage.akv
    public final /* synthetic */ Object a(Object obj) {
        Context context = (Context) obj;
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) blw.class), 640).metaData;
            if (bundle == null) {
                bbs.f("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                return null;
            }
            boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
            String[] strArrC = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
            String[] strArrC2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
            bbs.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
            bbs.a("QuirkSettingsLoader", a.r(z, "  KEY_DEFAULT_QUIRK_ENABLED = "));
            bbs.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = ".concat(String.valueOf(Arrays.toString(strArrC))));
            bbs.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = ".concat(String.valueOf(Arrays.toString(strArrC2))));
            return new blt(z, new HashSet(b(strArrC)), new HashSet(b(strArrC2)));
        } catch (PackageManager.NameNotFoundException unused) {
            bbs.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
