package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlb {
    public final ejxr a;

    public dzlb(final Context context) {
        this.a = ejxx.a(new ejxr() { // from class: dzla
            @Override // defpackage.ejxr
            public final Object get() {
                if (Build.VERSION.SDK_INT < 30) {
                    return ejud.a;
                }
                Context context2 = context;
                try {
                    return ejwi.i(context2.getPackageManager().getInstallSourceInfo(context2.getPackageName()).getInstallingPackageName());
                } catch (PackageManager.NameNotFoundException unused) {
                    return ejud.a;
                }
            }
        });
    }
}
