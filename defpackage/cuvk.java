package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvk implements eyif {
    public static RcsMultiSimStatusCheckboxView a(View view) {
        if (!(view instanceof RcsMultiSimStatusCheckboxView)) {
            throw new IllegalStateException(a.L(view, cuvg.class, "Attempt to inject a View wrapper of type "));
        }
        RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxView = (RcsMultiSimStatusCheckboxView) view;
        rcsMultiSimStatusCheckboxView.getClass();
        return rcsMultiSimStatusCheckboxView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
