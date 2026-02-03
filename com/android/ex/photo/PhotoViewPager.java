package com.android.ex.photo;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import defpackage.qxg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PhotoViewPager extends ViewPager {
    private int l;

    public PhotoViewPager(Context context) throws Resources.NotFoundException {
        super(context);
        v();
    }

    private final void v() throws Resources.NotFoundException {
        qxg qxgVar = new qxg();
        qxg qxgVar2 = this.k;
        this.k = qxgVar;
        setChildrenDrawingOrderEnabled(true);
        this.j = 2;
        this.i = 2;
        if (qxgVar2 == null) {
            f();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3) {
            this.l = -1;
        } else if (action == 1) {
            action = 1;
            this.l = -1;
        }
        if (action == 0) {
            motionEvent.getX();
            motionEvent.getRawX();
            motionEvent.getRawY();
            this.l = motionEvent.getPointerId(0);
        } else if (action == 6) {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.l) {
                int i = actionIndex != 0 ? 0 : 1;
                motionEvent.getX(i);
                this.l = motionEvent.getPointerId(i);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        v();
    }
}
