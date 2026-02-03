package com.google.android.apps.messaging.ui.maxheight;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ScrollView;
import defpackage.cyur;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MaxHeightScrollView extends ScrollView {
    private final int a;

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cyur.b, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.a;
        if (i3 != -1) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), i3));
        }
    }
}
