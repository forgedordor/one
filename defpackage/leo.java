package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class leo {
    public static lgt a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        lgt lgtVarO = lgt.o(rootWindowInsets);
        lgtVarO.s(lgtVarO);
        lgtVarO.q(view.getRootView());
        return lgtVarO;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }
}
