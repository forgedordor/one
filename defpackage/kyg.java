package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyg {
    public static final /* synthetic */ int a = 0;
    private static volatile kyf b;
    private static volatile List c;

    private kyg() {
    }

    public static kyf a(Context context) {
        if (b == null) {
            try {
                b = (kyf) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, kyg.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (b == null) {
                b = new kye();
            }
        }
        return b;
    }

    public static List b(Context context) {
        Bundle bundle;
        String string;
        if (c == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((kyb) Class.forName(string, false, kyg.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (c == null) {
                c = arrayList;
            }
        }
        return c;
    }

    public static List c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return kyd.a(context, kyg$$ExternalSyntheticApiModelOutline0.m578m(context.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m())).getShortcuts(i));
        }
        ShortcutManager shortcutManagerM578m = kyg$$ExternalSyntheticApiModelOutline0.m578m(context.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m()));
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(shortcutManagerM578m.getManifestShortcuts());
        }
        if ((i & 2) != 0) {
            arrayList.addAll(shortcutManagerM578m.getDynamicShortcuts());
        }
        if ((i & 4) != 0) {
            arrayList.addAll(shortcutManagerM578m.getPinnedShortcuts());
        }
        return kyd.a(context, arrayList);
    }

    public static void d(Context context, List list) {
        kyg$$ExternalSyntheticApiModelOutline0.m578m(context.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m())).removeDynamicShortcuts(list);
        a(context).b();
        Iterator it = b(context).iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public static void e(Context context, List list) {
        if (Build.VERSION.SDK_INT < 30) {
            d(context, list);
            return;
        }
        kyg$$ExternalSyntheticApiModelOutline0.m578m(context.getSystemService(kyg$$ExternalSyntheticApiModelOutline0.m())).removeLongLivedShortcuts(list);
        a(context).b();
        Iterator it = b(context).iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
