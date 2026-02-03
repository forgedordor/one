package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeda extends FrameLayout.LayoutParams {
    int a;
    float b;

    public eeda() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public eeda(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eedg.d);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public eeda(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }
}
