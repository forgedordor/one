package com.google.android.apps.messaging.ui.maxheight;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.cyur;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MaxHeightRecyclerView extends RecyclerView {
    private final int ab;

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cyur.a, 0, 0);
        this.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.ab;
        if (i3 != -1) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeight(), i3));
        }
    }
}
