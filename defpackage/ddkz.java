package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.learning.internal.training.IInAppTrainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddkz extends IStatusCallback.Stub {
    final /* synthetic */ defr a;
    final /* synthetic */ IInAppTrainer b;

    public ddkz(defr defrVar, IInAppTrainer iInAppTrainer) {
        this.a = defrVar;
        this.b = iInAppTrainer;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        if (status.g == 0) {
            this.a.b(new ddlc(this.b));
        } else {
            this.a.a(new dcff(status));
        }
    }
}
