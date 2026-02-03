package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.efsj;
import defpackage.efte;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class InsetAdjustmentLayout extends LinearLayout {
    private static final efte a = new efte("InsetAdjustmentLayout");

    public InsetAdjustmentLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (efsj.r(getContext()) && windowInsets.getSystemWindowInsetBottom() > 0) {
            a.a("NavigationBarHeight: " + windowInsets.getSystemWindowInsetBottom());
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), findViewById(R.id.suc_layout_status).getPaddingBottom());
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    public InsetAdjustmentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InsetAdjustmentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
