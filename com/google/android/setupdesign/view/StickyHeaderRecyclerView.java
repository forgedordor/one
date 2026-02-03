package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class StickyHeaderRecyclerView extends HeaderRecyclerView {
    private View ac;
    private int ad;
    private final RectF ae;

    public StickyHeaderRecyclerView(Context context) {
        super(context);
        this.ad = 0;
        this.ae = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.ae;
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-rectF.left, -rectF.top);
        return this.ab.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.ac != null) {
            View view = this.ab;
            int iSave = canvas.save();
            View view2 = view != null ? view : this.ac;
            if (view2.getTop() + (view != null ? this.ac.getTop() : 0) < this.ad || !view2.isShown()) {
                RectF rectF = this.ae;
                rectF.set(0.0f, (-r0) + this.ad, view2.getWidth(), (view2.getHeight() - r0) + this.ad);
                canvas.translate(0.0f, rectF.top);
                canvas.clipRect(0, 0, view2.getWidth(), view2.getHeight());
                view2.draw(canvas);
            } else {
                this.ae.setEmpty();
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.ad = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.ac == null && (view2 = this.ab) != null) {
            this.ac = view2.findViewWithTag("sticky");
        }
        if (this.ac == null || (view = this.ab) == null || view.getHeight() != 0) {
            return;
        }
        view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ac != null) {
            measureChild(this.ab, i, i2);
        }
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = 0;
        this.ae = new RectF();
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = 0;
        this.ae = new RectF();
    }
}
