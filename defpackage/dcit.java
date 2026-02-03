package defpackage;

import com.google.android.gms.common.api.internal.SignInCoordinator;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcit implements Runnable {
    final /* synthetic */ SignInResponse a;
    final /* synthetic */ SignInCoordinator b;

    public dcit(SignInCoordinator signInCoordinator, SignInResponse signInResponse) {
        this.a = signInResponse;
        this.b = signInCoordinator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignInCoordinator.m289$$Nest$msignInComplete(this.b, this.a);
    }
}
