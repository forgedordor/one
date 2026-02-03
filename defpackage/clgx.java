package defpackage;

import com.google.android.apps.messaging.shared.reportissue.ReportIssueReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clgx implements eora {
    final /* synthetic */ emgo a;
    final /* synthetic */ ReportIssueReceiver b;

    public clgx(ReportIssueReceiver reportIssueReceiver, emgo emgoVar) {
        this.a = emgoVar;
        this.b = reportIssueReceiver;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ajgb) this.b.e.b()).a(this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ReportIssueReceiver.a.s("Failed to start feedback from ReportIssueReceiver", th);
    }
}
