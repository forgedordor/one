package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejz implements dcfx {
    public final UsageReportingOptInOptions a;
    private final Status b;

    public dejz(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        UsageReportingOptInOptions usageReportingOptInOptions = this.a;
        dclh.m(usageReportingOptInOptions);
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(usageReportingOptInOptions.a == 1));
    }
}
