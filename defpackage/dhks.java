package defpackage;

import android.content.Context;
import android.os.ParcelUuid;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhks {
    private static volatile dhks b;
    public final SubscriptionManager a;

    private dhks(Context context) {
        this.a = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
    }

    public static dhks b(Context context) {
        if (b == null) {
            synchronized (dhks.class) {
                if (b == null) {
                    b = new dhks(context);
                }
            }
        }
        return b;
    }

    public final SubscriptionInfo a(int i) throws dhkf {
        try {
            return this.a.getActiveSubscriptionInfo(i);
        } catch (SecurityException e) {
            throw new dhkf("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final String c(int i) throws dhkf {
        try {
            return this.a.getPhoneNumber(i);
        } catch (SecurityException e) {
            throw new dhkf("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final List d() throws dhkf {
        try {
            return this.a.getActiveSubscriptionInfoList();
        } catch (SecurityException e) {
            throw new dhkf("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final List e(ParcelUuid parcelUuid) throws dhkf {
        try {
            return this.a.getSubscriptionsInGroup(parcelUuid);
        } catch (SecurityException e) {
            throw new dhkf("READ_PHONE_STATE permission is missing.", e);
        }
    }

    @Deprecated(since = "R")
    public final void f(SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener) throws dhkf {
        try {
            this.a.addOnSubscriptionsChangedListener(onSubscriptionsChangedListener);
        } catch (SecurityException e) {
            throw new dhkf("READ_PHONE_STATE permission is missing.", e);
        }
    }
}
