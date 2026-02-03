package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbbx {
    public static final eadc a;
    public static final eaci b;
    public static volatile String c;

    static {
        eadg eadgVar = new eadg(new ejvr() { // from class: fbbw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strC;
                Context context = (Context) obj;
                String str = fbbx.c;
                if (str != null) {
                    return str;
                }
                synchronized (fbbx.class) {
                    strC = fbbx.c;
                    if (strC == null) {
                        strC = dzyc.c(context, "com.google.android.libraries.notifications.platform");
                        fbbx.c = strC;
                    }
                }
                return strC;
            }
        });
        eadgVar.c(ekhx.v("ANDROID_GROWTH", "STREAMZ_ANDROID_GROWTH", "CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES", "ANDROID_CONTACTS_PRIMES", "DOCS_ANDROID_PRIMES", "DRIVE_ANDROID_PRIMES", "CALENDAR_ANDROID_PRIMES", "DIALER_ANDROID_PRIMES", "ANDROID_MESSAGING_PRIMES", "TACHYON_ANDROID_PRIMES", "DYNAMITE_ANDROID_PRIMES", "GMAIL_ANDROID_PRIMES", "PAISA_MERCHANT_ANDROID_PRIMES", "STREAMZ_GNP_ANDROID", "MEETINGS_ANDROID_PRIMES", "FITNESS_ANDROID_PRIMES", "MEDIA_HOME_ANDROID_PRIMES", "TASKS_ANDROID_PRIMES", "GOR_ANDROID_PRIMES", "PLAY_GAMES_ANDROID_PRIMES", "NOVA_ANDROID_PRIMES", "FAMILYLINK_ANDROID_PRIMES", "KEEP_ANDROID_PRIMES", "TRANSLATE_ANDROID_PRIMES", "CHROMECAST_ANDROID_APP_PRIMES", "GOOGLE_RED_ANDROID_PRIMES", "PAISA_FLUTTER_ANDROID_PRIMES", "ADWORDS_FLUTTER_ANDROID_PRIMES", "CULTURAL_ANDROID_PRIMES", "PLAY_MOVIES_ANDROID_PRIMES", "FILESGO_ANDROID_PRIMES", "FITBIT_APP_ANDROID_PRIMES"));
        eadc eadcVarA = eadgVar.a();
        a = eadcVarA;
        b = eacj.d("__phenotype_server_token", "", "com.google.android.libraries.notifications.platform", eadcVarA);
        c = null;
    }

    private fbbx() {
    }
}
