package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eecu extends LinearLayout.LayoutParams {
    public int a;
    public eecs b;
    public Interpolator c;

    public eecu() {
        super(-1, -2);
        this.a = 1;
    }

    public eecu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eedg.b);
        this.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new eect();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public eecu(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public eecu(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public eecu(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}
