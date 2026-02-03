package defpackage;

import android.view.View;
import com.google.android.apps.messaging.gaia.expresssignin.HqmsExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbx implements eyif {
    public static HqmsExpressSignInTopView a(View view) {
        if (!(view instanceof HqmsExpressSignInTopView)) {
            throw new IllegalStateException(a.L(view, acbu.class, "Attempt to inject a View wrapper of type "));
        }
        HqmsExpressSignInTopView hqmsExpressSignInTopView = (HqmsExpressSignInTopView) view;
        hqmsExpressSignInTopView.getClass();
        return hqmsExpressSignInTopView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
