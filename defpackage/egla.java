package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egla {
    static Intent a(egbe egbeVar, int i) {
        return new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", egbeVar.b().g).putExtra("extra.screenId", i);
    }

    static void b(Activity activity, String str) {
        Uri uri = Uri.parse(str);
        String packageName = activity.getPackageName();
        try {
            try {
                aky akyVar = new aky();
                akyVar.f(activity.getColor(R.color.google_grey200));
                akz akzVarA = akyVar.a();
                akzVarA.a.putExtra("android.intent.extra.REFERRER", Uri.parse(a.v(packageName, "android-app://")));
                akzVarA.a(activity, uri);
            } catch (ActivityNotFoundException unused) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", packageName);
                activity.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused2) {
        }
    }
}
