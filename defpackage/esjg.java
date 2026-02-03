package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esjg {
    public final /* synthetic */ FirebaseMessaging a;
    private final esfi b;
    private boolean c;
    private Boolean d;
    private esjf e;

    public esjg(FirebaseMessaging firebaseMessaging, esfi esfiVar) {
        this.a = firebaseMessaging;
        this.b = esfiVar;
    }

    final synchronized void a() {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        if (this.c) {
            return;
        }
        Context contextA = this.a.c.a();
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                packageManager = contextA.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        }
        this.d = boolValueOf;
        if (boolValueOf == null) {
            esjf esjfVar = new esjf(this);
            this.e = esjfVar;
            this.b.a(erzd.class, esjfVar);
        }
        this.c = true;
    }

    public final synchronized boolean b() {
        boolean zA;
        a();
        Boolean bool = this.d;
        if (bool != null) {
            zA = bool.booleanValue();
        } else {
            erzj erzjVar = this.a.c;
            erzjVar.i();
            zA = ((esid) erzjVar.e.a()).a();
        }
        return zA;
    }
}
