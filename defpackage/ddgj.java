package defpackage;

import com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddgj extends IOnAccountHealthAlertsListener.Stub {
    final /* synthetic */ dcib a;

    public ddgj(dcib dcibVar) {
        this.a = dcibVar;
    }

    @Override // com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener
    public final void onAccountHealthAlerts(byte[] bArr) {
        this.a.b(new ddgi(bArr));
    }
}
