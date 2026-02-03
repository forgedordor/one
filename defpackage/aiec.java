package defpackage;

import android.view.View;
import com.google.android.apps.messaging.samsung.appbar.ModifiedScrollingAppBarView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiec implements eyif {
    public static ModifiedScrollingAppBarView a(View view) {
        if (!(view instanceof ModifiedScrollingAppBarView)) {
            throw new IllegalStateException(a.L(view, aidz.class, "Attempt to inject a View wrapper of type "));
        }
        ModifiedScrollingAppBarView modifiedScrollingAppBarView = (ModifiedScrollingAppBarView) view;
        modifiedScrollingAppBarView.getClass();
        return modifiedScrollingAppBarView;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
