package defpackage;

import com.google.android.apps.messaging.gaia.expresssignin.BugleExpressSignInActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acau extends abs {
    final /* synthetic */ acax a;
    final /* synthetic */ BugleExpressSignInActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acau(acax acaxVar, BugleExpressSignInActivity bugleExpressSignInActivity) {
        super(true);
        this.a = acaxVar;
        this.d = bugleExpressSignInActivity;
    }

    @Override // defpackage.abs
    public final void b() {
        acax acaxVar = this.a;
        ((avmp) acaxVar.m.b()).l(acaxVar.a, null);
        this.d.finish();
    }
}
