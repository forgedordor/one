package defpackage;

import com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbuq extends IKeyRetrievalCallback.Stub {
    final /* synthetic */ defr a;

    public dbuq(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback
    public final void onResult(Status status, ApiMetadata apiMetadata) {
        dcjb.c(status, null, this.a);
    }
}
