package com.google.android.libraries.hats20.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.car.app.model.Alert;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import defpackage.drim;
import defpackage.drjf;
import defpackage.drjg;
import defpackage.ea;
import defpackage.eg;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SurveyViewPager extends ViewPager {
    public SurveyViewPager(Context context) throws Resources.NotFoundException {
        super(context);
        y();
    }

    private final void y() throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hats_lib_survey_page_margin);
        int i = this.d;
        this.d = dimensionPixelSize;
        int width = getWidth();
        super.h(width, width, dimensionPixelSize, i);
        requestLayout();
        if (this.e != Integer.MAX_VALUE) {
            this.e = Alert.DURATION_SHOW_INDEFINITELY;
            f();
        }
        d(new drjf(this));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final drim v() {
        if (!(getContext() instanceof eg)) {
            Log.e("HatsLibSurveyViewPager", "Context is not a SurveyPromptActivity, something is very wrong.");
            return null;
        }
        int i = this.c;
        for (ea eaVar : ((eg) getContext()).a().o()) {
            if (drjg.m(eaVar) == i && (eaVar instanceof drim)) {
                return (drim) eaVar;
            }
        }
        Log.e("HatsLibSurveyViewPager", "No Fragment found for the current item, something is very wrong.");
        return null;
    }

    public final void w() {
        v().p();
        v().f();
    }

    public final boolean x() {
        return this.c == this.b.j() + (-1);
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        y();
    }
}
