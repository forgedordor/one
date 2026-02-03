package defpackage;

import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.auth.folsom.internal.ISharedKeyCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbuo extends ISharedKeyCallback.Stub {
    final /* synthetic */ defr a;

    public dbuo(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.ISharedKeyCallback
    public final void onResult(Status status, SharedKey[] sharedKeyArr, ApiMetadata apiMetadata) {
        if (status.d()) {
            this.a.b(Arrays.asList(sharedKeyArr));
        } else {
            this.a.a(dcjq.a(status));
        }
    }
}
