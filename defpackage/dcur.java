package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.duokit.DuoKitContainerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcur {
    public static void a(Context context) {
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.tachyon")).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        Log.d("SetupDuoHelper", "Try to install Duo via Play store link.");
        try {
            context.startActivity(intentAddFlags);
        } catch (ActivityNotFoundException unused) {
            Log.e("SetupDuoHelper", "No activity to handle view intent.");
        }
    }

    static void b(Context context, dcsz dcszVar, ejwi ejwiVar) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                if (applicationInfo.enabled) {
                    Intent intentAddFlags = new Intent("com.google.android.gms.duokit.action.INSTALL_DUO_VIA_ALLEYOOP").setClassName(context, DuoKitContainerActivity.class.getName()).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                    if (ejwiVar.g()) {
                        intentAddFlags.putExtra("com.google.android.apps.tachyon.extra.REFERRER", (String) ejwiVar.c());
                    }
                    context.startActivity(intentAddFlags);
                    dcszVar.i(4);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        a(context);
        dcszVar.i(5);
    }
}
