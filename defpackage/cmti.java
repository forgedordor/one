package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmti implements kz {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/sms/apns/BugleUserAgentInfoLoader");
    public String a;
    public String b;
    private final Context d;
    private final cmum e;
    private boolean f;
    private final int g;

    public cmti(Context context, cmum cmumVar, int i) {
        this.d = context;
        this.e = cmumVar;
        this.g = i;
    }

    private static String b(String str) {
        return TextUtils.isEmpty(str) ? str : str.replace(' ', '_');
    }

    public final void a() {
        boolean z;
        if (this.f) {
            return;
        }
        synchronized (this) {
            z = false;
            if (!this.f) {
                Context context = this.d;
                TelephonyManager telephonyManagerCreateForSubscriptionId = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManagerCreateForSubscriptionId != null) {
                    telephonyManagerCreateForSubscriptionId = telephonyManagerCreateForSubscriptionId.createForSubscriptionId(this.g);
                }
                if (this.e.a(this.g).b.getBoolean("useCustomUserAgent", false)) {
                    this.a = b(Build.MANUFACTURER) + "/" + b(Build.MODEL) + "/" + b("Android") + "-" + b(Build.VERSION.RELEASE) + "/" + b("Messages ".concat(String.valueOf(cswl.a(context).a)));
                } else if (telephonyManagerCreateForSubscriptionId != null) {
                    this.a = telephonyManagerCreateForSubscriptionId.getMmsUserAgent();
                }
                if (telephonyManagerCreateForSubscriptionId != null) {
                    this.b = telephonyManagerCreateForSubscriptionId.getMmsUAProfUrl();
                }
                if (TextUtils.isEmpty(this.a)) {
                    this.a = "Messages ".concat(String.valueOf(cswl.a(context).a));
                }
                if (TextUtils.isEmpty(this.b)) {
                    this.b = "http://www.gstatic.com/android/sms/mms_ua_profile.xml";
                }
                z = true;
                this.f = true;
            }
        }
        if (z) {
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/sms/apns/BugleUserAgentInfoLoader", "load", 83, "BugleUserAgentInfoLoader.java")).D("Loaded user agent info: UA=%s, UAProfUrl=%s", this.a, this.b);
        }
    }
}
