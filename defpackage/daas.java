package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daas implements eyif {
    public static ZeroStateContentGridLayout a(View view) {
        if (!(view instanceof ZeroStateContentGridLayout)) {
            throw new IllegalStateException(a.L(view, daap.class, "Attempt to inject a View wrapper of type "));
        }
        ZeroStateContentGridLayout zeroStateContentGridLayout = (ZeroStateContentGridLayout) view;
        zeroStateContentGridLayout.getClass();
        return zeroStateContentGridLayout;
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
