package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.penpal.gaia.PenpalExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwq {
    public final fcsu a;
    public final fcsu b;
    private final PenpalExpressSignInTopView c;

    public agwq(PenpalExpressSignInTopView penpalExpressSignInTopView, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.c = penpalExpressSignInTopView;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        Context context = penpalExpressSignInTopView.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.penpal_express_sign_in);
        composeView.a(new hxd(-538407875, true, new agwp(fcsuVar4, this)));
        ((agxn) fcsuVar3.b()).c();
        penpalExpressSignInTopView.addView(composeView);
    }
}
