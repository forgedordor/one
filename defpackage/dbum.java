package defpackage;

import com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbum extends IKeyRetrievalSyncStatusCallback.Stub {
    final /* synthetic */ defr a;

    public dbum(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback
    public final void onSyncStatusResult(Status status, int i, ApiMetadata apiMetadata) {
        dcjb.c(status, Integer.valueOf(i), this.a);
    }
}
