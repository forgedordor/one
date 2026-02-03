package defpackage;

import android.app.Activity;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.welcome.v1.expresssignin.WelcomeExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxa {
    public final Activity a;
    private final WelcomeExpressSignInTopView b;

    public daxa(WelcomeExpressSignInTopView welcomeExpressSignInTopView, Activity activity, fcsu fcsuVar) {
        activity.getClass();
        fcsuVar.getClass();
        this.b = welcomeExpressSignInTopView;
        this.a = activity;
        ComposeView composeView = (ComposeView) welcomeExpressSignInTopView.findViewById(R.id.compose_view);
        composeView.getClass();
        lxs.b(composeView, lxs.a(welcomeExpressSignInTopView));
        composeView.a(new hxd(-1172387782, true, new dawz(fcsuVar, this)));
    }
}
