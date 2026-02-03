package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.android.vcard.VCardConfig;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egaq {
    public static final ekrg d = ekrg.c("com/google/apps/tiktok/account/api/controller/Config");

    public static egap d() {
        egam egamVar = new egam();
        egamVar.c(false);
        egamVar.d(egkm.class);
        egamVar.a = null;
        return egamVar;
    }

    public static egap e(Activity activity) {
        if (!h()) {
            Intent intent = activity.getIntent();
            Set<String> categories = intent.getCategories();
            ComponentName callingActivity = activity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && ((callingActivity == null || activity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) == 0 && intent.getData() == null && intent.getClipData() == null && intent.getType() == null)) {
                ((ekrd) ((ekrd) d.j()).h("com/google/apps/tiktok/account/api/controller/Config", "forExternalActivity", 88, "Config.java")).t("External config used on invalid activity: %s", activity.getClass());
            }
        }
        egap egapVarD = d();
        egapVarD.c(true);
        return egapVarD;
    }

    public static egap f(Activity activity) {
        if (!h()) {
            Intent intent = activity.getIntent();
            if (!intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 268468224) == 0 && intent.getExtras() != null && !intent.getExtras().isEmpty()) {
                ((ekrd) ((ekrd) d.j()).h("com/google/apps/tiktok/account/api/controller/Config", "forLauncherActivity", 62, "Config.java")).t("Launcher config used on invalid activity: %s", activity.getClass());
            }
        }
        egap egapVarD = d();
        egapVarD.c(true);
        return egapVarD;
    }

    public static egaq g(Activity activity) {
        ejwl.m(efyp.d(activity.getIntent()), "Account missing");
        return d().a();
    }

    public static boolean h() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public abstract ekgb a();

    public abstract ekgb b();

    public abstract boolean c();
}
