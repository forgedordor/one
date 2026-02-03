package com.google.android.apps.messaging.ui.mediapicker.camera;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.czkb;

/* compiled from: PG */
/* loaded from: classes3.dex */
class Scale extends Transition {
    public Scale() {
    }

    private static void a(TransitionValues transitionValues) {
        transitionValues.values.put("android:scale", Float.valueOf(transitionValues.view.getScaleX()));
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Object obj = transitionValues.values.get("android:scale");
        obj.getClass();
        float fFloatValue = ((Float) obj).floatValue();
        Object obj2 = transitionValues2.values.get("android:scale");
        obj2.getClass();
        float fFloatValue2 = ((Float) obj2).floatValue();
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        View view = transitionValues.view;
        view.setScaleX(fFloatValue);
        view.setScaleY(fFloatValue);
        return ObjectAnimator.ofFloat(view, new czkb(Float.class, view), fFloatValue, fFloatValue2);
    }

    public Scale(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
