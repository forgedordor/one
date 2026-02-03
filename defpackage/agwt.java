package defpackage;

import android.view.View;
import com.google.android.apps.messaging.penpal.gaia.PenpalExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwt implements eyif {
    public static PenpalExpressSignInTopView a(View view) {
        if (!(view instanceof PenpalExpressSignInTopView)) {
            throw new IllegalStateException(a.L(view, agwq.class, "Attempt to inject a View wrapper of type "));
        }
        PenpalExpressSignInTopView penpalExpressSignInTopView = (PenpalExpressSignInTopView) view;
        penpalExpressSignInTopView.getClass();
        return penpalExpressSignInTopView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
