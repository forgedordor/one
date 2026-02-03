package com.google.research.ink.libs.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.exim;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PenSelectionButton extends ImageView {
    public ColorFilter a;
    public String b;
    public final Drawable c;
    public final int d;
    public final Drawable e;
    public final int f;
    public final int g;
    private final int h;
    private final String i;

    public PenSelectionButton(Context context) {
        this(context, null, 0);
    }

    public final void a() {
        String str = this.i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!isActivated() || TextUtils.isEmpty(this.b)) {
            setContentDescription(str);
        } else {
            setContentDescription(String.format("%s: %s", getResources().getString(R.string.color_selected_template, str), this.b));
        }
    }

    @Override // android.view.View
    public final void setActivated(boolean z) {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.h != this.d || !z) {
                drawable = this.e;
            }
            setImageDrawable(drawable);
        }
        super.setActivated(z);
        setColorFilter(z ? this.a : null);
        a();
    }

    public PenSelectionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PenSelectionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, exim.b, 0, 0);
        typedArrayObtainStyledAttributes.getResourceId(6, 0);
        this.h = typedArrayObtainStyledAttributes.getResourceId(4, -1);
        typedArrayObtainStyledAttributes.getFloat(5, 0.5f);
        this.f = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.g = typedArrayObtainStyledAttributes.getColor(3, -16777216);
        typedArrayObtainStyledAttributes.getString(7);
        this.i = typedArrayObtainStyledAttributes.getString(8);
        this.d = typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color.ink_default_alt_color));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.c = getContext().getDrawable(resourceId);
        } else {
            this.c = null;
        }
        this.e = getDrawable();
        typedArrayObtainStyledAttributes.recycle();
        a();
    }
}
