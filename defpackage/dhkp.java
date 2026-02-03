package defpackage;

import android.content.Context;
import android.telephony.CarrierConfigManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhkp {
    private static volatile dhkp b;
    public final CarrierConfigManager a;

    protected dhkp(Context context) {
        this.a = (CarrierConfigManager) context.getSystemService("carrier_config");
    }

    public static dhkp a(Context context) {
        if (b == null) {
            synchronized (dhkp.class) {
                if (b == null) {
                    b = new dhkp(context);
                }
            }
        }
        return b;
    }
}
