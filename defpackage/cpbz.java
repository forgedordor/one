package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/ui/business/BusinessActionIntents");
    private final Context b;

    public cpbz(Context context) {
        this.b = context;
    }

    public final Intent a(String str) {
        if (!str.startsWith("tel:")) {
            str = "tel:".concat(String.valueOf(str));
        }
        return new Intent("android.intent.action.DIAL").setData(Uri.parse(str));
    }

    public final Intent b(Uri uri) {
        return new Intent("android.intent.action.VIEW").setData(uri);
    }

    public final Intent c(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public final boolean d(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities;
        if (intent != null && (listQueryIntentActivities = this.b.getPackageManager().queryIntentActivities(intent, 0)) != null) {
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.exported) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e(Intent intent) {
        if (d(intent)) {
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            this.b.startActivity(intent);
            return true;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/ui/business/BusinessActionIntents", "tryLaunchBusinessActionIntent", 59, "BusinessActionIntents.java")).t("Failed to launch business action intent: %s", intent.getAction());
        return false;
    }
}
