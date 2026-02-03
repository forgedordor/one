package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajf implements View.OnApplyWindowInsetsListener {
    private final daje a;

    public dajf(daje dajeVar) {
        this.a = dajeVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.a(view, windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
