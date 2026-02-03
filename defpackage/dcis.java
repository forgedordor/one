package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.SignInCoordinator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcis implements Runnable {
    final /* synthetic */ SignInCoordinator a;

    public dcis(SignInCoordinator signInCoordinator) {
        this.a = signInCoordinator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h.b(new ConnectionResult(4));
    }
}
