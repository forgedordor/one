package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehr {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final eesj f;

    private eehr(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, eesj eesjVar, Rect rect) {
        lcg.g(rect.left);
        lcg.g(rect.top);
        lcg.g(rect.right);
        lcg.g(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = eesjVar;
    }

    static eehr c(Context context, int i) throws Resources.NotFoundException {
        lcg.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, eeiz.b);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListC = eepy.c(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListC2 = eepy.c(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListC3 = eepy.c(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        eesj eesjVar = new eesj(eesj.b(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)));
        typedArrayObtainStyledAttributes.recycle();
        return new eehr(colorStateListC, colorStateListC2, colorStateListC3, dimensionPixelSize, eesjVar, rect);
    }

    public final int a() {
        return this.a.bottom;
    }

    public final int b() {
        return this.a.top;
    }

    final void d(TextView textView) {
        eesc eescVar = new eesc();
        eesc eescVar2 = new eesc();
        eesj eesjVar = this.f;
        eescVar.fx(eesjVar);
        eescVar2.fx(eesjVar);
        eescVar.P(this.c);
        eescVar.V(this.e, this.d);
        ColorStateList colorStateList = this.b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), eescVar, eescVar2);
        Rect rect = this.a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
