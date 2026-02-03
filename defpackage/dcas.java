package defpackage;

import com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcas extends DefaultClearcutLoggerCallbacks {
    final /* synthetic */ dcau a;

    public dcas(dcau dcauVar) {
        this.a = dcauVar;
    }

    @Override // com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks, com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
    public final void onLogEvent(Status status) {
        this.a.m(status);
    }
}
