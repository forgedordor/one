package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekb extends UsageReportingClientImpl.AbstractCallbacks {
    private final defr a;

    public dekb(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onGetCheckboxSettingsPendingIntent(PendingIntent pendingIntent) {
        this.a.b(pendingIntent);
    }
}
