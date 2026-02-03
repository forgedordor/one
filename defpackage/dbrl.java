package defpackage;

import com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbrl extends AbstractSignInCallbacks {
    final /* synthetic */ dbrm a;

    public dbrl(dbrm dbrmVar) {
        this.a = dbrmVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks, com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
    public final void onSignedOutFromGoogle(Status status) {
        this.a.m(status);
    }
}
