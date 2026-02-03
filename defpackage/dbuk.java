package defpackage;

import com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbuk extends IKeyRetrievalConsentCallback.Stub {
    final /* synthetic */ defr a;

    public dbuk(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback
    public final void onConsentResult(Status status, boolean z, ApiMetadata apiMetadata) {
        dcjb.c(status, null, this.a);
    }
}
