package defpackage;

import android.view.View;
import com.google.android.apps.messaging.welcome.v1.expresssignin.WelcomeExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxd implements eyif {
    public static WelcomeExpressSignInTopView a(View view) {
        if (!(view instanceof WelcomeExpressSignInTopView)) {
            throw new IllegalStateException(a.L(view, daxa.class, "Attempt to inject a View wrapper of type "));
        }
        WelcomeExpressSignInTopView welcomeExpressSignInTopView = (WelcomeExpressSignInTopView) view;
        welcomeExpressSignInTopView.getClass();
        return welcomeExpressSignInTopView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
