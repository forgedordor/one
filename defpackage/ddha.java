package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddha extends IStatusCallback.Stub {
    final /* synthetic */ defr a;

    public ddha(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        dcjb.b(status, true, this.a);
    }
}
