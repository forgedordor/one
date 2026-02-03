package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.learning.internal.training.IInAppTrainerCanceller;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddku extends IStatusCallback.Stub {
    final /* synthetic */ defr a;
    final /* synthetic */ IInAppTrainerCanceller b;

    public ddku(defr defrVar, IInAppTrainerCanceller iInAppTrainerCanceller) {
        this.a = defrVar;
        this.b = iInAppTrainerCanceller;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (status.g == 0) {
            this.a.b(new ddkw(this.b));
        } else {
            this.a.a(new dcff(status));
        }
    }
}
