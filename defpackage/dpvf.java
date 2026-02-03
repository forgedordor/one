package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ int b;

    public dpvf(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view.getWidth();
        view.setTranslationY(-view.getHeight());
        view.setElevation(fddu.g(this.b >> 3, r1));
    }
}
