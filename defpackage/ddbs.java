package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddbs {
    public final Context a;
    public final diep b;
    public final ejxr c;

    public ddbs(final Context context, diep diepVar) {
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: ddbp
            @Override // defpackage.ejxr
            public final Object get() {
                ddbn ddbnVar = ddbo.a;
                Context context2 = context;
                if (dqyw.g(context2)) {
                    ddbo.a.e("getAndroidId called in direct boot mode.", new Object[0]);
                    return ejud.a;
                }
                PackageManager packageManager = context2.getPackageManager();
                String packageName = context2.getPackageName();
                if (packageManager.checkPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", packageName) == 0) {
                    return ejwi.j(Long.valueOf(devd.b(context2.getContentResolver(), "android_id", 0L)));
                }
                ddbo.a.e("app %s doesn't have gservice read permission", packageName);
                return ejud.a;
            }
        });
        ejxx.a(new ejxr() { // from class: ddbq
            @Override // defpackage.ejxr
            public final Object get() {
                Context context2 = context;
                String string = Settings.Secure.getString(context2.getContentResolver(), "android_id");
                return (ejwk.c(string) || "0".equals(string)) ? ejud.a : ddmq.a(string, context2.getPackageName());
            }
        });
        this.a = context;
        this.b = diepVar;
        this.c = ejxrVarA;
    }
}
