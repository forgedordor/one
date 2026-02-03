package defpackage;

import com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcdl extends ICobaltLoggerCallbacks.Stub {
    final /* synthetic */ defr a;

    public dcdl(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks
    public final void onLogInteger(Status status) {
        dcjb.a(status, this.a);
    }

    @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks
    public final void onLogOccurrence(Status status) {
        dcjb.a(status, this.a);
    }
}
