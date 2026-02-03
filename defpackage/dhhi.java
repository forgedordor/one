package defpackage;

import android.content.Context;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhhi {
    public static boolean a(Context context) {
        try {
            NetworkInfo networkInfoD = dhkq.f(context).d();
            if (networkInfoD != null) {
                if (networkInfoD.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (dhkf e) {
            dhja.s(e, "Failed due to missing permission.", new Object[0]);
            return false;
        }
    }

    public static boolean b(Context context) {
        try {
            NetworkInfo networkInfoD = dhkq.f(context).d();
            if (networkInfoD != null && networkInfoD.getType() == 1 && networkInfoD.isConnected()) {
                dhja.c("Wifi connection is available.", new Object[0]);
                return true;
            }
        } catch (dhkf e) {
            dhja.s(e, "Failed due to missing permission.", new Object[0]);
        }
        return false;
    }
}
