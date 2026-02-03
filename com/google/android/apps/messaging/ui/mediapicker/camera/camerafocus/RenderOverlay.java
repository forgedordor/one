package com.google.android.apps.messaging.ui.mediapicker.camera.camerafocus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.czkq;
import defpackage.czkr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RenderOverlay extends FrameLayout {
    public final czkr a;
    public final List b;
    public final List c;
    public final int[] d;

    public RenderOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new int[2];
        this.a = new czkr(this, context);
        this.b = new ArrayList(10);
        this.c = new ArrayList(10);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        addView(this.a, new FrameLayout.LayoutParams(-1, -1));
        czkq czkqVar = new czkq(getContext());
        this.b.add(czkqVar);
        czkqVar.a = this;
        this.c.add(0, czkqVar);
        requestLayout();
    }
}
