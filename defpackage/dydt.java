package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dydt {
    public static final String a = "dydt";

    private dydt() {
    }

    public static dyhu a(dydh dydhVar, final Context context) {
        final CrossProfileApps crossProfileAppsM;
        dydm dydmVar = (dydm) dydhVar;
        if (!((dyhz) dydmVar.g).a) {
            return null;
        }
        final dyws dywsVar = dydmVar.l;
        if (Build.VERSION.SDK_INT < 28 || (crossProfileAppsM = abn$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(abn$$ExternalSyntheticApiModelOutline0.m28m()))) == null) {
            return null;
        }
        List targetUserProfiles = crossProfileAppsM.getTargetUserProfiles();
        if (targetUserProfiles.isEmpty()) {
            return null;
        }
        final UserHandle userHandle = (UserHandle) targetUserProfiles.get(0);
        Drawable profileSwitchingIconDrawable = crossProfileAppsM.getProfileSwitchingIconDrawable(userHandle);
        CharSequence profileSwitchingLabel = crossProfileAppsM.getProfileSwitchingLabel(userHandle);
        dyhs dyhsVarH = dyhu.h();
        dyhsVarH.f(R.id.og_ai_switch_profile);
        dyhw dyhwVar = (dyhw) dyhsVarH;
        dyhwVar.a = profileSwitchingIconDrawable;
        dyhsVarH.g(profileSwitchingLabel.toString());
        dyhsVarH.h(103027);
        dyhwVar.b = new View.OnClickListener() { // from class: dyds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str = dydt.a;
                Context applicationContext = view.getContext().getApplicationContext();
                CrossProfileApps crossProfileApps = crossProfileAppsM;
                List targetUserProfiles2 = crossProfileApps.getTargetUserProfiles();
                UserHandle userHandle2 = userHandle;
                boolean zContains = targetUserProfiles2.contains(userHandle2);
                final dyws dywsVar2 = dywsVar;
                if (!zContains) {
                    if (dywsVar2 != null) {
                        final String packageName = applicationContext.getPackageName();
                        dywsVar2.a(new Runnable() { // from class: dywk
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((ecoe) ((dyxi) dywsVar2.a.get()).b.get()).a(packageName);
                            }
                        });
                    }
                    Log.e(dydt.a, "Trying to switch to a non-existing profile");
                    return;
                }
                Context context2 = context;
                PackageManager packageManager = context2.getPackageManager();
                String packageName2 = context2.getPackageName();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName2);
                if (launchIntentForPackage == null) {
                    Log.e(dydt.a, "getLaunchIntentForPackage return null for package ".concat(String.valueOf(packageName2)));
                    return;
                }
                ComponentName component = launchIntentForPackage.getComponent();
                if (component == null) {
                    Log.e(dydt.a, "Launch component was null for package ".concat(String.valueOf(packageName2)));
                    return;
                }
                try {
                    try {
                        crossProfileApps.startMainActivity(component, userHandle2);
                    } catch (SecurityException e) {
                        throw e;
                    }
                } finally {
                    if (dywsVar2 != null) {
                        dywsVar2.f("OK", launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER"), launchIntentForPackage.hasCategory("android.intent.category.INFO"), crossProfileApps.getTargetUserProfiles().contains(userHandle2), Build.VERSION.SDK_INT, applicationContext.getPackageName());
                    }
                }
            }
        };
        return dyhsVarH.b();
    }
}
