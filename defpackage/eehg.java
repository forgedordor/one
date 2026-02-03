package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eehg {
    private eehg() {
    }

    public static int a(int i, int i2) {
        return kzb.h(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(View view, int i) {
        return j(view.getContext(), eepx.c(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int c(Context context, int i, int i2) {
        Integer numH = h(context, i);
        return numH != null ? numH.intValue() : i2;
    }

    public static int d(Context context, int i, String str) {
        return j(context, eepx.c(context, i, str));
    }

    public static int e(Context context, int i) {
        return eehh.a(i, d(context, R.attr.colorPrimary, eehg.class.getCanonicalName()));
    }

    public static int f(int i, int i2, float f) {
        return kzb.g(kzb.h(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static ColorStateList g(Context context, int i) {
        TypedValue typedValueB = eepx.b(context, i);
        if (typedValueB == null) {
            return null;
        }
        if (typedValueB.resourceId != 0) {
            return kxj.d(context, typedValueB.resourceId);
        }
        if (typedValueB.data != 0) {
            return ColorStateList.valueOf(typedValueB.data);
        }
        return null;
    }

    public static Integer h(Context context, int i) {
        TypedValue typedValueB = eepx.b(context, i);
        if (typedValueB != null) {
            return Integer.valueOf(j(context, typedValueB));
        }
        return null;
    }

    public static boolean i(int i) {
        return i != 0 && kzb.b(i) > 0.5d;
    }

    private static int j(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }
}
