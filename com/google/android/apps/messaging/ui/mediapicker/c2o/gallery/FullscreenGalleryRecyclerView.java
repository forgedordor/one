package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FullscreenGalleryRecyclerView extends RecyclerView {
    public GridLayoutManager ab;
    public int ac;
    private final int ad;
    private final int ae;

    public FullscreenGalleryRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ac = 1;
        this.ad = context.getResources().getDimensionPixelSize(R.dimen.full_screen_recycler_view_padding);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.columnWidth});
        this.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.ae;
        if (i3 > 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.ad;
            int iMax = Math.max(1, (size - (i4 + i4)) / i3);
            this.ac = iMax;
            this.ab.r(iMax);
        }
    }
}
