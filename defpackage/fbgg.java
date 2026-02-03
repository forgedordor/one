package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgg {
    public static final eadc a;
    public static volatile String b;

    static {
        eadg eadgVar = new eadg(new ejvr() { // from class: fbgf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = fbgg.b;
                if (str != null) {
                    return str;
                }
                synchronized (fbgg.class) {
                    strC = fbgg.b;
                    if (strC == null) {
                        strC = dzyc.c(context, "com.google.android.libraries.onegoogle");
                        fbgg.b = strC;
                    }
                }
                return strC;
            }
        });
        eadgVar.c(ekhx.v("ONEGOOGLE_MOBILE", "STREAMZ_CONSENTKIT_MOBILE", "IDENTITY_CONSENT_UI", "GMAIL_ANDROID_PRIMES", "ANDROID_GMAIL", "GMAIL_ANDROID", "GMAIL_SYNC_HEALTH", "GMAIL_COUNTERS", "XPLAT_GMAIL_ANDROID", "CLIENT_LOGGING_PROD"));
        a = eadgVar.a();
        b = null;
    }

    private fbgg() {
    }
}
