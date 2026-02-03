package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crsu extends crsw {
    public static final cqce a = cqce.g("Bugle", "CsApkPackageUidUpdater");
    public crss b;
    public eigp c;
    public eosc d;

    @Override // defpackage.cldb
    public final eieh b() {
        return this.c.c("CsApkPackageUidUpdater Receive broadcast", "com/google/android/apps/messaging/shared/util/security/CsApkPackageUidUpdater", "beginRootTrace", 46);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.CsApkPackageUpdated.Latency";
    }

    @Override // defpackage.clca
    public final eiju j(Context context, final Intent intent) {
        return eijx.f(new Runnable() { // from class: crst
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                if (intent2 == null) {
                    return;
                }
                crsu crsuVar = this.a;
                String action = intent2.getAction();
                if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action) || "android.intent.action.PACKAGE_REPLACED".equals(action)) {
                    Uri data = intent2.getData();
                    if (data == null || !"package:com.google.android.ims".equals(data.toString())) {
                        return;
                    }
                    crsu.a.p("CarrierServices APK package change detected, updating Bugle's verified uids cache");
                    crsuVar.b.a();
                    return;
                }
                if ("android.intent.action.UID_REMOVED".equals(action)) {
                    int intExtra = intent2.getIntExtra("android.intent.extra.UID", -1);
                    cqbd cqbdVarA = crsu.a.a();
                    cqbdVarA.I("UID has been removed from the system");
                    cqbdVarA.y("uid", intExtra);
                    cqbdVarA.r();
                    if (intExtra != -1) {
                        crss crssVar = crsuVar.b;
                        synchronized (crssVar.b) {
                            if (crssVar.d.remove(Integer.valueOf(intExtra))) {
                                cqbd cqbdVarA2 = crss.a.a();
                                cqbdVarA2.I("Removed Bugle verified uid");
                                cqbdVarA2.y("uid", intExtra);
                                cqbdVarA2.r();
                            }
                        }
                    }
                }
            }
        }, this.d);
    }
}
