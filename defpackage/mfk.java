package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfk extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final mfp a;

    public mfk(mfp mfpVar) {
        this.a = mfpVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.a.d(true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}
