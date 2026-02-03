package defpackage;

import com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbrn extends AbstractSignInCallbacks {
    final /* synthetic */ dbro a;

    public dbrn(dbro dbroVar) {
        this.a = dbroVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks, com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
    public final void onAccessRevokedFromGoogle(Status status) {
        this.a.m(status);
    }
}
