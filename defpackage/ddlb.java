package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddlb extends IStatusCallback.Stub {
    final /* synthetic */ defr a;

    public ddlb(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        dcjb.a(status, this.a);
    }
}
