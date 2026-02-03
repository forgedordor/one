package defpackage;

import com.google.android.gms.auth.account.data.IGetStringValueCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbnt extends IGetStringValueCallback.Stub {
    final /* synthetic */ defr a;

    public dbnt(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.account.data.IGetStringValueCallback
    public final void onResponse(Status status, String str) {
        dcjb.b(status, str, this.a);
    }
}
