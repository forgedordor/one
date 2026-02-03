package com.google.android.setupcompat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.efsj;
import defpackage.efte;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class StatusBarBackgroundLayout extends FrameLayout {
    private static final efte b = new efte("StatusBarBgLayout");
    public Drawable a;
    private Object c;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (efsj.r(getContext()) && windowInsets.getSystemWindowInsetBottom() > 0) {
            b.a("NavigationBarHeight: " + windowInsets.getSystemWindowInsetBottom());
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), findViewById(R.id.suc_layout_status).getPaddingBottom());
        }
        this.c = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        Object obj = this.c;
        if (obj == null || (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) <= 0) {
            return;
        }
        this.a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
        this.a.draw(canvas);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
