package com.google.android.apps.messaging.ui.rcs.consent;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.czqu;
import defpackage.czrc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InterceptTouchConstraintLayout extends ConstraintLayout {
    public czqu i;

    public InterceptTouchConstraintLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        czqu czquVar = this.i;
        if (czquVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        czrc czrcVar = czquVar.a;
        int i = czrcVar.l;
        if (i == 1 || i == 0) {
            View view = czrcVar.e;
            int[] iArr = czquVar.c;
            view.getLocationInWindow(iArr);
            Rect rect = czquVar.b;
            int i2 = iArr[0];
            rect.set(i2 - 30, iArr[1] - 30, i2 + view.getWidth() + 30, iArr[1] + view.getHeight() + 30);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                czrcVar.b();
            }
        }
        return false;
    }

    public InterceptTouchConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptTouchConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
