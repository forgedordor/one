package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddhb extends IStatusCallback.Stub {
    final /* synthetic */ defr a;

    public ddhb(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        dcjb.a(status, this.a);
    }
}
