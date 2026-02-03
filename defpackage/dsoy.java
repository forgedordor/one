package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsoy {
    public static final dsox a(Context context, etns etnsVar, boolean z) {
        if (!z) {
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorPrimary, R.attr.colorOnPrimary, R.attr.colorSecondary, R.attr.colorSurface, R.attr.colorOnSurface, R.attr.colorOnSurfaceVariant, android.R.attr.colorBackground, R.attr.colorOutline});
        int color = typedArrayObtainStyledAttributes.getColor(0, b(R.color.gm3_default_color_primary, R.color.gm3_dark_default_color_primary, context, etnsVar));
        int color2 = typedArrayObtainStyledAttributes.getColor(1, b(R.color.gm3_default_color_on_primary, R.color.gm3_dark_default_color_on_primary, context, etnsVar));
        int color3 = typedArrayObtainStyledAttributes.getColor(2, b(R.color.gm3_default_color_secondary, R.color.gm3_dark_default_color_secondary, context, etnsVar));
        int color4 = typedArrayObtainStyledAttributes.getColor(3, b(R.color.gm3_default_color_surface, R.color.gm3_dark_default_color_surface, context, etnsVar));
        int color5 = typedArrayObtainStyledAttributes.getColor(4, b(R.color.gm3_default_color_on_surface, R.color.gm3_dark_default_color_on_surface, context, etnsVar));
        int color6 = typedArrayObtainStyledAttributes.getColor(5, b(R.color.gm3_default_color_on_surface_variant, R.color.gm3_dark_default_color_on_surface_variant, context, etnsVar));
        int color7 = typedArrayObtainStyledAttributes.getColor(6, b(R.color.gm3_default_color_background, R.color.gm3_dark_default_color_background, context, etnsVar));
        int color8 = typedArrayObtainStyledAttributes.getColor(7, b(R.color.gm3_default_color_outline, R.color.gm3_dark_default_color_outline, context, etnsVar));
        typedArrayObtainStyledAttributes.recycle();
        return new dsov(color, color2, color3, color4, dtci.SURFACE_1.a(context), dtci.SURFACE_2.a(context), dtci.SURFACE_3.a(context), dtci.SURFACE_4.a(context), dtci.SURFACE_5.a(context), color5, color6, color7, color8);
    }

    private static final int b(int i, int i2, Context context, etns etnsVar) {
        if (true == etnsVar.equals(etns.DARK)) {
            i = i2;
        }
        return context.getColor(i);
    }
}
