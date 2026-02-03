package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crot {
    public static final cqce a = cqce.g("Bugle", "TelephonyManagerFactory");
    private final Context b;
    private final cub c = new cros(this);

    public crot(Context context) {
        this.b = context;
    }

    public final TelephonyManager a(int i) {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.c(Integer.valueOf(i));
        telephonyManager.getClass();
        return telephonyManager;
    }

    public final TelephonyManager b() {
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService(TelephonyManager.class);
        telephonyManager.getClass();
        return telephonyManager;
    }
}
