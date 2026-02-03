package defpackage;

import com.google.android.apps.messaging.gaia.expresssignin.BugleExpressSignInActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acav extends abs {
    final /* synthetic */ acax a;
    final /* synthetic */ BugleExpressSignInActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acav(acax acaxVar, BugleExpressSignInActivity bugleExpressSignInActivity) {
        super(true);
        this.a = acaxVar;
        this.d = bugleExpressSignInActivity;
    }

    @Override // defpackage.abs
    public final void b() {
        ((AtomicBoolean) this.a.l.b()).set(true);
        this.d.finish();
    }
}
