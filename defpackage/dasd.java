package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dasd implements ctbx {
    private static final eksp a = eksp.c("BugleWearable");
    private final Context b;
    private final fcsu c;

    public dasd(Context context, fcsu fcsuVar) {
        this.b = context;
        this.c = fcsuVar;
    }

    private final boolean c(String str) throws PackageManager.NameNotFoundException {
        try {
            this.b.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.ctbx
    public final boolean a() {
        boolean z = false;
        try {
            if (craf.b) {
                if (this.b.getPackageManager().getPackageInfo("com.google.android.apps.wear.companion", 0).getLongVersionCode() >= 330837029) {
                    z = true;
                }
            } else if (this.b.getPackageManager().getPackageInfo("com.google.android.apps.wear.companion", 0).versionCode >= 330837029) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.S, "WearableCompanionAppInstalledImpl");
            ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/util/WearableCompanionAppInstalledImpl", "companionHasMissingHapticsBugFix", 98, "WearableCompanionAppInstalledImpl.java")).q("Denali not installed. Assuming companion app doesn't have notification haptics fix.");
        }
        ekrw ekrwVarN = a.n();
        ekrwVarN.X(cqnc.S, "WearableCompanionAppInstalledImpl");
        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/wearable/util/WearableCompanionAppInstalledImpl", "companionHasMissingHapticsBugFix", 106, "WearableCompanionAppInstalledImpl.java")).t("Computed companionHasMissingHapticsBugFix with value=%s", Boolean.valueOf(z));
        return z;
    }

    @Override // defpackage.ctbx
    public final boolean b() {
        boolean zC = c("com.google.android.wearable.app");
        if (!zC) {
            Iterator it = ((Set) this.c.b()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (c((String) it.next())) {
                    zC = true;
                    break;
                }
            }
        }
        ekrw ekrwVarN = a.n();
        ekrwVarN.X(cqnc.S, "WearableCompanionAppInstalledImpl");
        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/wearable/util/WearableCompanionAppInstalledImpl", "isWearCompanionAppInstalled", 65, "WearableCompanionAppInstalledImpl.java")).t("Computed isWearCompanionAppInstalled with value=%s", Boolean.valueOf(zC));
        return zC;
    }
}
