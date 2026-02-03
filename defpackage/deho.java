package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deho extends IOnRetrieveGlobalStateCallback.Stub {
    final /* synthetic */ defr a;

    public deho(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback
    public final void onRetrieveGlobalState(Status status, GlobalState globalState) {
        dcjb.b(status, globalState, this.a);
    }
}
