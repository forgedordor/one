package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepy {
    public static int a(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    static int b(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static ColorStateList c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListD;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListD = kxj.d(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListD;
    }

    public static ColorStateList d(Context context, yx yxVar, int i) {
        int iF;
        ColorStateList colorStateListD;
        return (!yxVar.q(i) || (iF = yxVar.f(i, 0)) == 0 || (colorStateListD = kxj.d(context, iF)) == null) ? yxVar.g(i) : colorStateListD;
    }

    public static Drawable e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableA;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableA = ku.a(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableA;
    }

    public static boolean f(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static int h(Context context, int i) throws Resources.NotFoundException {
        if (i == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, eepz.a);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(2, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (value) {
            return typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }
}
