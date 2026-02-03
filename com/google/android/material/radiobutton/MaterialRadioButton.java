package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.eehg;
import defpackage.eemh;
import defpackage.eepu;
import defpackage.eepy;
import defpackage.eexh;
import defpackage.rf;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialRadioButton extends rf {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            if (this.b == null) {
                int iB = eehg.b(this, com.google.android.apps.messaging.R.attr.colorControlActivated);
                int iB2 = eehg.b(this, com.google.android.apps.messaging.R.attr.colorOnSurface);
                int iB3 = eehg.b(this, com.google.android.apps.messaging.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                this.b = new ColorStateList(iArr, new int[]{eehg.f(iB3, iB, 1.0f), eehg.f(iB3, iB2, 0.54f), eehg.f(iB3, iB2, 0.38f), eehg.f(iB3, iB2, 0.38f)});
            }
            setButtonTintList(this.b);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(eexh.a(context, attributeSet, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayA = eemh.a(context2, attributeSet, eepu.a, i, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayA.hasValue(0)) {
            setButtonTintList(eepy.c(context2, typedArrayA, 0));
        }
        this.c = typedArrayA.getBoolean(1, false);
        typedArrayA.recycle();
    }
}
