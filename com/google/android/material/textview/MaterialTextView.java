package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.eepx;
import defpackage.eepy;
import defpackage.eexg;
import defpackage.eexh;
import defpackage.lip;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int iA = -1;
        for (int i = 0; i < 2 && iA < 0; i++) {
            iA = eepy.a(context, typedArray, iArr[i], -1);
        }
        return iA;
    }

    private final void b(Resources.Theme theme, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, eexg.a);
        int iA = a(getContext(), typedArrayObtainStyledAttributes, 2, 4);
        typedArrayObtainStyledAttributes.recycle();
        if (iA >= 0) {
            lip.e(this, iA);
        }
    }

    private final void c(AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        Context context = getContext();
        if (d(context)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = eexg.b;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int iA = a(context, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iA != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                b(theme, resourceId);
            }
        }
    }

    private static boolean d(Context context) {
        return eepx.d(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (d(context)) {
            b(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(eexh.a(context, attributeSet, i, 0), attributeSet, i);
        c(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(eexh.a(context, attributeSet, i, i2), attributeSet, i);
        c(attributeSet, i, i2);
    }
}
