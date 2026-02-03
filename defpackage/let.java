package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class let {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static lhb b(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new lhb(windowInsetsController);
        }
        return null;
    }

    static CharSequence c(View view) {
        return view.getStateDescription();
    }

    static void d(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
