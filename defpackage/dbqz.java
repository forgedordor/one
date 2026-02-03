package defpackage;

import com.google.android.gms.auth.api.internal.AbstractAuthCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbqz extends AbstractAuthCallbacks {
    final /* synthetic */ defr a;

    public dbqz(defr defrVar) {
        this.a = defrVar;
    }

    @Override // com.google.android.gms.auth.api.internal.AbstractAuthCallbacks, com.google.android.gms.auth.api.internal.IAuthCallbacks
    public final void handleSpatulaHeader(String str) {
        dcjb.b(str != null ? Status.a : new Status(3006), str, this.a);
    }
}
