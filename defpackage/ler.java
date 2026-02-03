package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ler {
    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static <T> T b(View view, int i) {
        return (T) view.requireViewById(i);
    }

    static void c(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void d(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void e(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean f(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean g(View view) {
        return view.isScreenReaderFocusable();
    }
}
