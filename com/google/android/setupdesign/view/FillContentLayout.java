package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.efsh;
import defpackage.efsj;
import defpackage.eftq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FillContentLayout extends FrameLayout {
    private int a;
    private int b;

    public FillContentLayout(Context context) {
        this(context, null);
    }

    private static int a(int i, int i2, int i3) {
        int iMax = Math.max(0, i - i2);
        if (i3 >= 0) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (i3 == -1) {
            return View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        }
        if (i3 == -2) {
            return View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            childAt.measure(a(Math.min(this.a, measuredWidth), getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), a(Math.min(this.b, measuredHeight), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        }
    }

    public FillContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sudFillContentLayoutStyle);
    }

    public FillContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.g, i, 0);
        efsj efsjVarH = efsj.h(context);
        efsh efshVar = efsh.CONFIG_ILLUSTRATION_MAX_HEIGHT;
        if (efsjVarH.t(efshVar)) {
            this.b = (int) efsj.h(context).a(context, efshVar);
        } else {
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        efsj efsjVarH2 = efsj.h(context);
        efsh efshVar2 = efsh.CONFIG_ILLUSTRATION_MAX_WIDTH;
        if (efsjVarH2.t(efshVar2)) {
            this.a = (int) efsj.h(context).a(context, efshVar2);
        } else {
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
