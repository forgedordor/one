package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpa extends IStatusCallback.Stub {
    final /* synthetic */ Object a;
    final /* synthetic */ defr b;

    public ddpa(Object obj, defr defrVar) {
        this.a = obj;
        this.b = defrVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        dcjb.b(status, this.a, this.b);
    }
}
