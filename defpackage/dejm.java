package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dejm extends UsageReportingClientImpl.AbstractCallbacks {
    final /* synthetic */ defr a;

    public dejm(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.usagereporting.internal.UsageReportingClientImpl.AbstractCallbacks, com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
    public final void onGetOptInOptions(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        dcjb.b(status, new dejq(new dejz(Status.a, usageReportingOptInOptions)), this.a);
    }
}
