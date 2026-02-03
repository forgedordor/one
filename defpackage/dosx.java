package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dosx implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ RippleDrawable b;
    final /* synthetic */ View c;

    public dosx(View view, RippleDrawable rippleDrawable, View view2) {
        this.a = view;
        this.b = rippleDrawable;
        this.c = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        RippleDrawable rippleDrawable = this.b;
        View view2 = this.c;
        rippleDrawable.setHotspotBounds(view2.getPaddingLeft(), view2.getPaddingTop(), view.getWidth() - view2.getPaddingRight(), view.getHeight() - view2.getPaddingBottom());
    }
}
