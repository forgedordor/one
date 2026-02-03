package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhkv {
    private static volatile dhkv b;
    public final TelephonyManager a;

    public dhkv(TelephonyManager telephonyManager) {
        this.a = telephonyManager;
    }

    public static dhkv g(Context context) {
        if (b == null) {
            synchronized (dhkv.class) {
                if (b == null) {
                    b = new dhkv((TelephonyManager) context.getSystemService("phone"));
                }
            }
        }
        return b;
    }

    public final int a() {
        return this.a.getDataNetworkType();
    }

    public final int b() {
        try {
            return this.a.getDataState();
        } catch (SecurityException e) {
            dhja.i(e, "Got SecurityException for getDataState, this shouldn't happen!", new Object[0]);
            return Build.VERSION.SDK_INT >= 29 ? -1 : 0;
        }
    }

    public final int c() {
        return this.a.getNetworkType();
    }

    public final int d() throws dhkf {
        try {
            return this.a.getSimCarrierId();
        } catch (SecurityException e) {
            throw new dhkf("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final TelephonyManager e(int i) throws dhkf {
        try {
            return this.a.createForSubscriptionId(i);
        } catch (SecurityException e) {
            throw new dhkf("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final dhkv f(int i) {
        TelephonyManager telephonyManagerCreateForSubscriptionId = this.a.createForSubscriptionId(i);
        if (telephonyManagerCreateForSubscriptionId == null) {
            return null;
        }
        return new dhkv(telephonyManagerCreateForSubscriptionId);
    }

    public final String h() throws dhkf {
        try {
            return this.a.getGroupIdLevel1();
        } catch (SecurityException e) {
            throw new dhkf(e);
        }
    }

    public final String i() throws dhkf {
        try {
            return this.a.getLine1Number();
        } catch (SecurityException e) {
            throw new dhkf("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final String j() {
        return this.a.getNetworkOperator();
    }

    public final String k() {
        return this.a.getNetworkOperatorName();
    }

    public final String l() {
        return this.a.getSimCountryIso();
    }

    public final String m() {
        return this.a.getSimOperator();
    }

    public final String n() throws dhkf {
        try {
            return this.a.getSimSerialNumber();
        } catch (SecurityException e) {
            throw new dhkf("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
        }
    }
}
