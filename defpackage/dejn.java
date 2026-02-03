package defpackage;

import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dejn extends dejt {
    final /* synthetic */ UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener a;
    final /* synthetic */ dejp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dejn(dejp dejpVar, defr defrVar, UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener) {
        super(defrVar);
        this.a = usageReportingOptInOptionsChangedListener;
        this.b = dejpVar;
    }

    @Override // defpackage.dcgq
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((deju) this.b.g).a = this.a;
        this.c.b(null);
    }
}
