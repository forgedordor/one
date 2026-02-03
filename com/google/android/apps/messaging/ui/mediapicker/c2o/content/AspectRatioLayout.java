package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.cywt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AspectRatioLayout extends FrameLayout {
    public final boolean a;
    private final float b;
    private final float c;

    public AspectRatioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cywt.a);
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(0, 1.0f);
            this.b = f;
            this.c = typedArrayObtainStyledAttributes.getFloat(1, f);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final float a() {
        return getResources().getConfiguration().orientation == 1 ? this.b : this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (!this.a) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) ((r4 - paddingTop) / a())) + getPaddingStart() + getPaddingEnd(), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }
}
