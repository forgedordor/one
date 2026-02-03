package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dahq implements eyif {
    public static ZeroStateSearchResultsView a(View view) {
        if (!(view instanceof ZeroStateSearchResultsView)) {
            throw new IllegalStateException(a.L(view, dahm.class, "Attempt to inject a View wrapper of type "));
        }
        ZeroStateSearchResultsView zeroStateSearchResultsView = (ZeroStateSearchResultsView) view;
        zeroStateSearchResultsView.getClass();
        return zeroStateSearchResultsView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
