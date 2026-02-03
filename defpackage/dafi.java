package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.resultsview.ResultsFilterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dafi implements eyif {
    public static ResultsFilterView a(View view) {
        if (!(view instanceof ResultsFilterView)) {
            throw new IllegalStateException(a.L(view, daff.class, "Attempt to inject a View wrapper of type "));
        }
        ResultsFilterView resultsFilterView = (ResultsFilterView) view;
        resultsFilterView.getClass();
        return resultsFilterView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
