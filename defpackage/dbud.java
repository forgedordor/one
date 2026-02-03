package defpackage;

import com.google.android.gms.auth.folsom.internal.IByteArrayListCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbud extends IByteArrayListCallback.Stub {
    final /* synthetic */ defr a;

    public dbud(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IByteArrayListCallback
    public final void onResult(Status status, List<byte[]> list, ApiMetadata apiMetadata) {
        if (status.d()) {
            this.a.b(list);
        } else {
            this.a.a(dcjq.a(status));
        }
    }
}
