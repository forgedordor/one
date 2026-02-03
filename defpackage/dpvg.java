package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvg implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;

    public dpvg(View view, View view2, int i) {
        this.a = view;
        this.b = view2;
        this.c = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view.getWidth();
        this.b.setElevation(fddu.g(this.c >> 3, view.getHeight()));
    }
}
