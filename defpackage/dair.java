package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dair {
    public static final void a(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new daiq(view, runnable));
    }
}
