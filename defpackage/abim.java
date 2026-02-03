package defpackage;

import android.view.View;
import com.google.android.apps.messaging.dittosatellite.gaia.gaiapairingsignin.GpWebTabletExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abim implements eyif {
    public static GpWebTabletExpressSignInTopView a(View view) {
        if (!(view instanceof GpWebTabletExpressSignInTopView)) {
            throw new IllegalStateException(a.L(view, abij.class, "Attempt to inject a View wrapper of type "));
        }
        GpWebTabletExpressSignInTopView gpWebTabletExpressSignInTopView = (GpWebTabletExpressSignInTopView) view;
        gpWebTabletExpressSignInTopView.getClass();
        return gpWebTabletExpressSignInTopView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
