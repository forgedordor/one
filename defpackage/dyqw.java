package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqw {
    public static Drawable a(Context context, int i, int i2) {
        Drawable drawableA = ku.a(context, i);
        c(drawableA, i2);
        return drawableA;
    }

    public static int b(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarItemBackground});
        try {
            return typedArrayObtainStyledAttributes.getResourceId(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void c(Drawable drawable, int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        boolean z = true;
        if (!ecem.g() && drawable.getCallback() != null) {
            z = false;
        }
        ejwl.m(z, "Tinting drawables with callback from background thread might trigger UI code on the background thread.");
        drawable.mutate().setTintList(colorStateListValueOf);
    }
}
