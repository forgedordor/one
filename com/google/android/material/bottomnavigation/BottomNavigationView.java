package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.eeeg;
import defpackage.eeeh;
import defpackage.eeei;
import defpackage.eemh;
import defpackage.eemo;
import defpackage.eenu;
import defpackage.eeoc;
import defpackage.yx;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class BottomNavigationView extends eeoc {
    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // defpackage.eeoc
    protected final eenu a(Context context) {
        return new eeeg(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i2;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
        }
        super.onMeasure(i, iMakeMeasureSpec);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        yx yxVarB = eemh.b(getContext(), attributeSet, eeei.a, i, i2, new int[0]);
        boolean zP = yxVarB.p(2, true);
        eeeg eeegVar = (eeeg) this.b;
        if (eeegVar.a != zP) {
            eeegVar.a = zP;
            this.c.f(false);
        }
        if (yxVarB.q(0)) {
            setMinimumHeight(yxVarB.b(0, 0));
        }
        yxVarB.o();
        eemo.i(this, new eeeh());
    }
}
