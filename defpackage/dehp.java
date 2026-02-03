package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dehp extends IOnLatestTimeSignalCallback.Stub {
    final /* synthetic */ defr a;

    public dehp(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback
    public final void onLatestTimeSignal(Status status, TimeSignalResult timeSignalResult) {
        dcjb.b(status, timeSignalResult, this.a);
    }
}
