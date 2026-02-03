package defpackage;

import android.view.View;
import com.google.android.apps.messaging.samsung.appbar.ExpandableAppBarView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidy implements eyif {
    public static ExpandableAppBarView a(View view) {
        if (!(view instanceof ExpandableAppBarView)) {
            throw new IllegalStateException(a.L(view, aidv.class, "Attempt to inject a View wrapper of type "));
        }
        ExpandableAppBarView expandableAppBarView = (ExpandableAppBarView) view;
        expandableAppBarView.getClass();
        return expandableAppBarView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
