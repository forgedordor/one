package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehs {
    public final eehr a;
    final eehr b;
    final eehr c;
    final eehr d;
    final eehr e;
    final eehr f;
    final eehr g;
    public final Paint h;

    public eehs(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(eepx.e(context, eeih.class.getCanonicalName()), eeiz.a);
        this.a = eehr.c(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.g = eehr.c(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.b = eehr.c(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.c = eehr.c(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListC = eepy.c(context, typedArrayObtainStyledAttributes, 7);
        this.d = eehr.c(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.e = eehr.c(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = eehr.c(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListC.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
