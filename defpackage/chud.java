package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chud {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/ApplicationInfoVerifier");
    private final Context b;

    public chud(Context context) {
        this.b = context;
    }

    public final boolean a(int i) {
        if (Binder.getCallingUid() == Process.myUid()) {
            return true;
        }
        try {
            Context context = this.b;
            if (context.getPackageManager().getApplicationInfo("com.google.android.ims", 0).uid == i) {
                if (dhka.l(context)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleRcs");
            ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/rcs/ApplicationInfoVerifier", "isSelfOrCsApk", 40, "ApplicationInfoVerifier.java")).q("Carrier Services is not installed");
            return false;
        }
    }
}
