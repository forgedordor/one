package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.IMdiSyncCallbacks;
import com.google.android.gms.mdisync.internal.SyncResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddsv extends IMdiSyncCallbacks.Stub {
    final /* synthetic */ defr a;

    public ddsv(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.mdisync.internal.IMdiSyncCallbacks
    public final void onSyncComplete(Status status, SyncResult syncResult) {
        dcjb.c(status, status.d() ? syncResult.a : null, this.a);
    }
}
