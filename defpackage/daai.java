package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.homeview.CategoryGroupItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daai implements eyif {
    public static CategoryGroupItemView a(View view) {
        if (!(view instanceof CategoryGroupItemView)) {
            throw new IllegalStateException(a.L(view, daaf.class, "Attempt to inject a View wrapper of type "));
        }
        CategoryGroupItemView categoryGroupItemView = (CategoryGroupItemView) view;
        categoryGroupItemView.getClass();
        return categoryGroupItemView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
