package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.car.app.model.Alert;
import com.google.android.material.button.MaterialButton;
import defpackage.ecps;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ButtonWithMaxTextSize extends MaterialButton {
    public ButtonWithMaxTextSize(Context context) {
        super(context);
    }

    private final void p(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ecps.a);
        setTextSize(0, Math.min(getTextSize(), typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Alert.DURATION_SHOW_INDEFINITELY)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p(context, attributeSet);
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        p(context, attributeSet);
    }
}
