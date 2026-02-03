package com.google.android.libraries.hats20.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.car.app.model.Alert;
import defpackage.drhi;
import defpackage.qp;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ButtonWithMaxTextSize extends qp {
    public ButtonWithMaxTextSize(Context context) {
        super(context);
    }

    private final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, drhi.a);
        setTextSize(0, Math.min(getTextSize(), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Alert.DURATION_SHOW_INDEFINITELY)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }
}
